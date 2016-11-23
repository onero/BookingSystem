/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.controller;

import bookingsystem.be.Entertainer;
import bookingsystem.be.EntertainerType;
import bookingsystem.bll.BookingManager;
import bookingsystem.gui.model.BookingModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BookingSystemController implements Initializable {

    @FXML
    private ImageView imgEntertainer1;
    @FXML
    private ImageView imgEntertainer2;
    @FXML
    private ImageView imgEntertainer3;
    @FXML
    private Button btnLogin;
    @FXML
    private Label lblFirstArtistName;
    @FXML
    private Label lblSecondArtistName;
    @FXML
    private Label lblThirdArtistName;
    @FXML
    private TableView<Entertainer> tableEntertainers;
    @FXML
    private TableColumn<Entertainer, String> tableEntertainer;
    @FXML
    private TableColumn<Entertainer, EntertainerType> tableType;
    @FXML
    private TextArea txtDescription;
    @FXML
    private ImageView imgSelectedEntertainer;

    static Stage primStage;

    private BookingModel bookingModel;

    private BookingManager bookingManager;

    private Image selectedEntertainerImg;
    @FXML
    private TextField txtSearch;
    @FXML
    private Button btnClearSearch;
    @FXML
    private ComboBox<String> comboEntertainers;

    public BookingSystemController() {
        bookingModel = new BookingModel();
        bookingManager = new BookingManager();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableEntertainer.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableType.setCellValueFactory(new PropertyValueFactory<>("entertainerType"));
        tableEntertainers.setItems(bookingModel.getEntertainers());

        comboEntertainers.setItems(FXCollections.observableArrayList(
                "ALL",
                "Musician",
                "Stand_up",
                "Bartender",
                "Event_Girl",
                "DJ"));
        comboEntertainers.setVisibleRowCount(6);
    }

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        //Get primary stage, get loader and load FXML
        primStage = (Stage) btnLogin.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bookingsystem/gui/view/LoginModal.fxml"));
        Parent root = loader.load();

        //Fetches controller
        LoginModalController loginModalController = loader.getController();

        //Sets new stage as modal
        Stage stageLoginView = new Stage();
        stageLoginView.setScene(new Scene(root));
        stageLoginView.initModality(Modality.WINDOW_MODAL);
        stageLoginView.initOwner(primStage);
        stageLoginView.show();
    }

    /**
     * Loads the desciption and image of the entertainer
     */
    @FXML
    private void handleLoadEntertainer(MouseEvent event) {
        Entertainer selectedEntertainer = tableEntertainers.getSelectionModel().getSelectedItem();
        txtDescription.setText(bookingManager.getEntertainerDescription(selectedEntertainer));
        selectedEntertainerImg = new Image(selectedEntertainer.getIMAGE_PATH());
        imgSelectedEntertainer.setImage(selectedEntertainerImg);
    }

    /**
     * Clears all search and resets data
     */
    @FXML
    private void handleReset() {
        bookingModel.resetList();
        txtSearch.setText("");
    }

    /**
     * Begins a search in the observable list for the query parsed
     */
    @FXML
    private void handleSearch(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            bookingModel.updateEntertainers(
                    bookingManager.getEntertainersFromSearch(
                            bookingModel.getEntertainers(), txtSearch.getText().toLowerCase()));
        }
    }

    /**
     * Limit search result to show only results from selection
     */
    @FXML
    private void handleComboLimit() {
        String choice = comboEntertainers.getSelectionModel().getSelectedItem().toLowerCase();
        switch (choice) {
            case "all":
                bookingModel.resetList();
                break;
            default:
                bookingModel.resetList();
                bookingModel.updateEntertainers(bookingManager.getEntertainersFromComboLimit(bookingModel.getEntertainers(), choice));
                break;
        }
    }

    /**
     * Switch to the EntertainerView
     *
     * @throws IOException
     */
    public static void switchToEnterTainerView() throws IOException {
        FXMLLoader loader = new FXMLLoader(BookingSystemController.class.getResource("/bookingsystem/gui/view/EntertainerView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(loader.getRoot());
        primStage.setScene(scene);
    }

}

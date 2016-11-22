/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.controller;

import bookingsystem.be.Entertainer;
import bookingsystem.be.EntertainerType;
import bookingsystem.gui.model.BookingModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
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

    static Stage primStage;
    @FXML
    private Label lblFirstArtistName;
    @FXML
    private Label lblSecondArtistName;
    @FXML
    private Label lblThirdArtistName;

    private BookingModel bookingModel;
    @FXML
    private TableView<Entertainer> tableEntertainers;
    @FXML
    private TableColumn<Entertainer, String> tableEntertainer;
    @FXML
    private TableColumn<Entertainer, EntertainerType> tableType;

    public BookingSystemController() {
        bookingModel = new BookingModel();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableEntertainer.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableType.setCellValueFactory(new PropertyValueFactory<>(""));
        ObservableList<Entertainer> test = bookingModel.getEntertainers();
        tableEntertainers.setItems(bookingModel.getEntertainers());
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

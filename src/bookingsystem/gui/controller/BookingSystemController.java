/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        //Get primary stage, get loader and load FXML
        Stage primStage = (Stage) btnLogin.getScene().getWindow();
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.controller;

import bookingsystem.bll.LoginManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class LoginModalController implements Initializable {

    @FXML
    private TextField userId;
    @FXML
    private PasswordField password;
    @FXML
    private Label errorMessage;
    @FXML
    private Button login;

    private final LoginManager loginManager = new LoginManager();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Handles the login and switches Scene depending on who logs in!
     *
     * @param event
     */
    @FXML
    private void processLogin(ActionEvent event) {
        String username = userId.getText().trim().toLowerCase();
        String passwordString = password.getText().trim().toLowerCase();

        Stage loginStage = (Stage) login.getScene().getWindow();

        String loginError = "There is an error in your login details";

        switch (username) {
            case "admin":
                if (loginManager.validateAdminLogin(username, passwordString)) {
                    System.out.println("Admin success!");
                    try {
                        BookingSystemController.switchToEnterTainerView();
                    } catch (IOException ex) {
                        Logger.getLogger(LoginModalController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loginStage.close();
                } else {
                    errorMessage.setText(loginError);
                    break;
                }
            case "minion":
                if (loginManager.validateWorkerLogin(username, passwordString)) {
                    System.out.println("Worker success!");
                    try {
                        BookingSystemController.switchToEnterTainerView();
                    } catch (IOException ex) {
                        Logger.getLogger(LoginModalController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loginStage.close();
                } else {
                    errorMessage.setText(loginError);
                    break;
                }
            default:
                break;
        }
    }

}

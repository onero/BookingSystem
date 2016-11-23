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

/**
 * FXML Controller class
 *
 * @author Rasmus
 */
public class EmployeeViewController implements Initializable
{

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }
    
    /**
     * Switches to the entertainerView.
     * @param event
     * @throws IOException 
     */
    @FXML
    public void switchToEntertainerView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(BookingSystemController.class.getResource("/bookingsystem/gui/view/EntertainerView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(loader.getRoot());
        BookingSystemController.primStage.setScene(scene);
    }
    
}

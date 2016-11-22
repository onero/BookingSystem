/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.controller;

import bookingsystem.BookingSystem;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author gta1
 */
public class BookingSystemController implements Initializable {

    @FXML
    private Label label;
    
    private BookingSystem application;
    
    public void setApp(BookingSystem application)
    {
        this.application = application;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void handleTest(ActionEvent event)
    {
        if(application == null)
        {
            //Do nothing.
        }
        else
        {
            application.goToTest();
        }
    }   
}

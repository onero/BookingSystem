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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Rasmus
 */
public class TestController implements Initializable
{
    private BookingSystem application;
    
    public void setApp(BookingSystem application)
    {
        this.application = application;
    }
    
    @FXML
    public void handleButton(ActionEvent event) throws IOException
    {
        if(application == null)
        {
            //DO NOTHING
        }
        else
        {
            application.gotToStart();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        //TODO
    }
}

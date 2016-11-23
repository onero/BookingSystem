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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Rasmus
 */
public class EntertainerViewController implements Initializable
{

    @FXML
    private Label lblName;
    @FXML
    private Label lblBookingPrice;
    @FXML
    private Label lblNumber;
    @FXML
    private Label lblCostumersPrice;
    @FXML
    private ComboBox<?> comboEntertainers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }
    
    /**
     * Switches to the employeeView.
     * @param event
     * @throws IOException 
     */
    @FXML
    public void switchToEmployeeView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(BookingSystemController.class.getResource("/bookingsystem/gui/view/EmployeeView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(loader.getRoot());
        BookingSystemController.primStage.setScene(scene);
    }
    
}

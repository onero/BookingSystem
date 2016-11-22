/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

//import java.net.URL;
import bookingsystem.gui.controller.BookingSystemController;
import bookingsystem.gui.controller.TestController;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author gta1
 */
public class BookingSystem extends Application {
    
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        try
        {
            this.stage = stage;
            gotToStart();
            stage.show();
        }
        catch(Exception ex)
        {
            System.out.println("Some mistake");
        }        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void gotToStart() throws IOException
    {
        try
        {
            BookingSystemController bookingSystemController = 
                    (BookingSystemController) replaceSceneContent("gui/view/BookingSystem.fxml");
            bookingSystemController.setApp(this);
        }
        catch(Exception ex)
        {
            System.out.println("Some mistake");
        }
    }
    
    public void goToTest()
    {
        try
        {
            TestController testController = 
                    (TestController) replaceSceneContent("gui/view/TestView.fxml");
            testController.setApp(this);
        }
        catch(Exception ex)
        {
            System.out.println("Some mistake");
        }
    }
    
    private Initializable replaceSceneContent(String fxml) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = BookingSystem.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(BookingSystem.class.getResource(fxml));
        AnchorPane page;
        try
        {
            page = (AnchorPane) loader.load(in);
        }
        finally
        {
            in.close();
        }
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}

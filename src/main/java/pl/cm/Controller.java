package pl.cm;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller
{
    //buttony głównego menu
    public void clickButtonHardware(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/hardwareWindow.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void clickButtonGiveOnLoan(ActionEvent event) throws Exception
    {

    }

    public void clickButtonReturn(ActionEvent event) throws Exception
    {

    }

    public void clickButtonHistory(ActionEvent event) throws Exception
    {

    }

    public void clickButtonWorkers(ActionEvent event) throws Exception
    {

    }

    public void clickInfoInMenu(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/infoWindow.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}

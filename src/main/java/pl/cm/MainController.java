package pl.cm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainController
{
    //buttony głównego menu
    public void clickButtonHardware(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/hardwareWindow.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 845, 500));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void clickButtonGiveOnLoan(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/loanWindow.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 600, 455));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void clickButtonReturn(ActionEvent event) throws Exception
    {

    }

    public void clickButtonHistory(ActionEvent event) throws Exception
    {

    }

    public void clickButtonWorkers(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/workersWindow.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 430, 432));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
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

    public void clickDatabaseOptions(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/databaseOptionsWindow.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 598, 293));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

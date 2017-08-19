package pl.cm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/mainWindow.fxml"));
        primaryStage.setTitle("Spis sprzętu");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.getIcons().add(new Image("file:logo_cm.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();

        Database database = new Database();
        database.test();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}

package com.openwindow;

import com.openwindow.Planes.CargoPlane;
import com.openwindow.Planes.EconomyPlane;
import com.openwindow.Planes.LuxuryPlane;
import com.openwindow.Planes.Plane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends Application {
    Stage window;
    //Main run method
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));

        window = primaryStage;
        window.setTitle("Airport Booking App");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        window.setScene(new Scene(root, 750, 500));
        window.show();



    }

    private void closeProgram() {
        window.close();
    }


}

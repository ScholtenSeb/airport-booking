package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {
    //Main run method
    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Airport Booking App");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });



        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // create button
        Button button1 = new Button("Goto scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        Button button2 = new Button("Back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        Button buttonAlert = new Button("Alert button updated");
        buttonAlert.setOnAction(event -> {
            boolean result = ConfirmBox.dislay("Alert", "You clicked the confirm button");
            System.out.println(result);
        });


        VBox layout1 = new VBox(20);
        scene1 = new Scene(layout1, 800, 600);
        scene1.getStylesheets().add("Style.css");
        layout1.getChildren().addAll(button1, buttonAlert);

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 800, 600);

        window.setScene(scene1);
        window.show();

        //cssButton.getStyleClass().add("blue-button");
        //cssButton.setID("some-id")



    }

    private void closeProgram() {
        window.close();
    }


}

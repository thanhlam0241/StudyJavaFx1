package com.example.studyjavafx.main2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Main2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
            try{
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);

                primaryStage.show();

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}

package com.example.sudokututorial;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;

import javafx.scene.Parent;

import javafx.scene.Scene;
//import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    /* modify the method declaration to throw generic Exception (in case any of the steps fail) */
    public void start(Stage primaryStage) throws Exception {

        /* load .fxml from file and assign it to a scene root object */
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        /* assign the root to a new scene and define its dimensions */
        Scene scene = new Scene(root, 720, 480);

        /* set the title of the stage (window) */
        primaryStage.setTitle("Sudoku");
        /* set the scene of the stage to our newly created from the layout scene */
        primaryStage.setScene(scene);
        /* show the stage */
        primaryStage.show();
    }
}
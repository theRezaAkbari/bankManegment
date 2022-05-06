package com.example.bankmanegment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage stage1;
    @Override
    public void start(Stage stage) throws IOException {
        stage1=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("FirstPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Bank Manegment");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void onchangeScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load());
        stage1.setScene(scene);
        stage1.centerOnScreen();
    }
}
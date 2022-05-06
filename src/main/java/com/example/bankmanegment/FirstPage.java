package com.example.bankmanegment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class FirstPage {

    @FXML
    private Button adminStart;

    @FXML
    private Button userStart;

    @FXML
    void OnAdminStart(ActionEvent event) throws IOException {
        scene.onchangeScene("AdminLogin.fxml");
    }

    @FXML
    void OnUserStart(ActionEvent event) throws IOException {
        scene.onchangeScene("UserLogin.fxml");
    }
    Main scene=new Main();

}

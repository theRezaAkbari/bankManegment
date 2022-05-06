package com.example.bankmanegment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MoneyTransfer {

    @FXML
    private Button back;

    @FXML
    private Label massage;

    @FXML
    private TextField money;

    @FXML
    private TextField shabanum;

    @FXML
    private Button transfer;

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("CenterBankPage.fxml");
    }

    @FXML
    void transferbtn(ActionEvent event) {

    }
    Main scene=new Main();

}

package com.example.bankmanegment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class WithdrawalCenter {

    @FXML
    private Button back;

    @FXML
    private Label massage;

    @FXML
    private TextField moneylabal;

    @FXML
    private Button withdraw;

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("CenterBankPage.fxml");
    }

    @FXML
    void withdrawbtn(ActionEvent event) {

    }
    Main scene=new Main();

}

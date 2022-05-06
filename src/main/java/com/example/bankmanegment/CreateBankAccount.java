package com.example.bankmanegment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class CreateBankAccount {

    @FXML
    private Button BankA;

    @FXML
    private Button bankC;

    @FXML
    private Button bankb;

    @FXML
    void bankAbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("RegisterBankA.fxml");
    }

    @FXML
    void bankCbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("RegisterBankC.fxml");
    }

    @FXML
    void bankbbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("RegisterBankB.fxml");
    }
    Main scene=new Main();
}

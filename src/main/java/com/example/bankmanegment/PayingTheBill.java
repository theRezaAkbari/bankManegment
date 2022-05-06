package com.example.bankmanegment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class PayingTheBill {

    @FXML
    private Button back;

    @FXML
    private Label massage;

    @FXML
    private Label money;

    @FXML
    private Button pay;

    @FXML
    private Label payId;

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("CenterBankPage.fxml");
    }

    @FXML
    void paybtn(ActionEvent event) {

    }
    Main scene=new Main();

}

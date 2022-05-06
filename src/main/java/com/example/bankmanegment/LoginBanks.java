package com.example.bankmanegment;

import File.FileManegment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginBanks extends FileManegment {

    @FXML
    private TextField BankName;

    @FXML
    private Button LoginCenterbtn;

    @FXML
    private TextField UserCenter;

    @FXML
    private Label WrongMassage;

    @FXML
    private PasswordField passCenter;

    @FXML
    void OnCenterLoginBank(ActionEvent event) throws IOException {
        boolean t=loginBanks(UserCenter.getText(),passCenter.getText(),BankName.getText(),",","Data.txt");
        if(UserCenter.getText().equals("") ||passCenter.getText().equals("") || BankName.getText().equals("")){
            WrongMassage.setText("None of the fields should be empty");
        }
        else if (t==true){
          check();

        }else {
            WrongMassage.setText("UserName Or Password is Wrong");
            UserCenter.setText("");
            passCenter.setText("");
            BankName.setText("");
        }
    }

    private void  check() throws IOException {
        if (BankName.getText().toString().equals("BankA")) {
            scene.onchangeScene("BankApage.fxml");
        } else if (BankName.getText().toString().equals("BankB")) {
            scene.onchangeScene("BankBPage.fxml");
        } else if (BankName.getText().toString().equals("BankC")) {
            scene.onchangeScene("BankCPage.fxml");

        }
    }

    Main scene=new Main();

}

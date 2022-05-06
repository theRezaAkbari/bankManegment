package com.example.bankmanegment;

import File.FileManegment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UserLogin extends FileManegment {

    @FXML
    private Button LoginBanksSection;

    @FXML
    private Button LoginCenterbtn;

    @FXML
    private TextField UserCenter;

    @FXML
    private Label WrongMassage;

    @FXML
    private PasswordField passCenter;

    @FXML
    void OnCenterLogin(ActionEvent event) throws IOException {


        boolean temp=login(UserCenter.getText(),passCenter.getText(),",","Data.txt");
        if(UserCenter.getText().equals("") ||passCenter.getText().equals("")){
            WrongMassage.setText("None of the fields should be empty");
        }
        else if (temp==true){
            scene.onchangeScene("CenterBankPage.fxml");

        }else {
            WrongMassage.setText("UserName Or Password is Wrong");
            UserCenter.setText("");
            passCenter.setText("");
        }

    }

    @FXML
    void OnLoginBanksSectionbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("loginBanks.fxml");
    }
    Main scene=new Main();

}

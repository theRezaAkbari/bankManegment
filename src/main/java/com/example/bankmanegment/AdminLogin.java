package com.example.bankmanegment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AdminLogin {

    @FXML
    private Button loginAdminbtn;

    @FXML
    private PasswordField loginPassAdmin;

    @FXML
    private TextField loginUserAdmin;

    @FXML
    private Label wrongMassage;

    @FXML
    void OnloginAdmin(ActionEvent event) {
        check();
    }
    private void check(){
        if (loginUserAdmin.getText().toString().equals("") ||loginPassAdmin.getText().toString().equals("")){
            wrongMassage.setText("please complete all fields");
        }else if(loginUserAdmin.getText().toString().equals("admin") &&loginPassAdmin.getText().toString().equals("admin1234")){
            wrongMassage.setText("Succesful");
        }else {
            wrongMassage.setText("UserName Or Password is Wrong");
            loginUserAdmin.setText("");
            loginPassAdmin.setText("");
        }
    }

}

package CenterBank;

import File.FileManegment;
import com.example.bankmanegment.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public class CenterBankPage extends FileManegment {

    @FXML
    private Label AccountBalanceCenter;

    @FXML
    private Button Createabankaccount;

    @FXML
    private Button History;

    @FXML
    private Button Moneytransfer;

    @FXML
    private Button WithdrawalCenter;

    @FXML
    private Label accountNumberCenter;

    @FXML
    private Label accountShabaNumberCenter;

    @FXML
    private Label nameCenteralBank;

    @FXML
    private Button payingthebill;


    @FXML
    void Createabankaccountbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("CreateBankAccount.fxml");
    }

    @FXML
    void Historybtn(ActionEvent event) throws IOException {

    }

    @FXML
    void Moneytransferbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("MoneyTransfer.fxml");

    }

    @FXML
    void WithdrawalCenterbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("WithdrawalCenter.fxml");
    }

    @FXML
    void payingthebillbtn(ActionEvent event) throws IOException {
        scene.onchangeScene("PayingTheBill.fxml");

    }

    Main scene = new Main();
}


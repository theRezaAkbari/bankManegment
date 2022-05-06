package RegisterBanks;

import File.FileManegment;
import File.Information;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class RegisterBankB {

    @FXML
    private TextField Age;

    @FXML
    private TextField fName;

    @FXML
    private TextField idcard;

    @FXML
    private TextField lName;

    @FXML
    private TextField money;

    @FXML
    private TextField pNumber;

    @FXML
    private Button register;
    @FXML
    private Label massageBankb;

    @FXML
    void Registerbtn(ActionEvent event) throws IOException {
        Information information=new Information();
        FileManegment fileManegment=new FileManegment();
        ArrayList<Information> list=new ArrayList<>();
        if (fName.getText().equals("") ||lName.getText().equals("")|| Age.getText().equals("") || pNumber.getText().equals("")||idcard.getText().equals("")||money.getText().equals("")){
            massageBankb.setText("None of the fields should be empty");
        }else {
            try {
            information.setFirstName(fName.getText());
            information.setLastName((lName.getText()));
            information.setAge(Age.getText());
            information.setCellNumber(pNumber.getText());
            information.setIdCard(idcard.getText());
            information.setBanks("BankB");
                information.setMoney(Long.parseLong(money.getText()));
            }catch (Exception e){
                e.printStackTrace();
                massageBankb.setText("The amount of money is wrong");
            }
            list.add(information);
            fileManegment.informationWrite(list.toString(), "Data.txt");
        }

    }

}

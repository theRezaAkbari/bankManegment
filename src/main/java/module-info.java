module com.example.bankmanegment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankmanegment to javafx.fxml;
    exports com.example.bankmanegment;
    exports RegisterBanks;
    opens RegisterBanks to javafx.fxml;
    exports CenterBank;
    opens CenterBank to javafx.fxml;
    exports File;
    opens File to javafx.fxml;
}
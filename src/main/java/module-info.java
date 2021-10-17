module com.mireahw.lab13_14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mireahw.lab13_14 to javafx.fxml;
    exports com.mireahw.lab13_14;
}
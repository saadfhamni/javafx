module com.example.controlebb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appJava to javafx.fxml;
    exports com.example.appJava;
}
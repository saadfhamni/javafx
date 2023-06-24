package com.example.appJava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField name;
    @FXML
    private PasswordField pwd;
 @FXML
    protected void login() throws IOException {
     if (name.getText().equals("admin") && pwd.getText().equals("admin")) {
         Stage s= (Stage) name.getScene().getWindow();
         FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
         Scene scene = new Scene(fxmlLoader.load());
         s.setScene(scene);

     }
     else {
         Alert alert=new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error 404");
         alert.setHeaderText("username or password is incorrect!");
         alert.setContentText("Change your information and enter the correct username or password");
         alert.show();

     }
 }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Library;
import model.User;

/**
 *
 * @author portia
 */
public class SignupController implements Initializable {

    @FXML private TextField txt_username;
    @FXML private TextField txt_password;
    @FXML private TextField txt_first_name;
    @FXML private TextField txt_last_name;
    @FXML private TextField txt_age;
    @FXML private TextField txt_phone_number;
    @FXML private Label lbl_error;
    
    @FXML
    private void btnSignupClicked(MouseEvent event) {
        String username = txt_username.getText();
        String password = txt_password.getText();
        String firstName = txt_first_name.getText();
        String lastName = txt_last_name.getText();
        int age = Integer.parseInt(txt_age.getText());
        String phoneNumber = txt_phone_number.getText();
        
        Library library = Library.getInstance();
        
        if(!library.createAccount(username, firstName, lastName, age, phoneNumber)){
            lbl_error.setText("Sorry, this user couldn't be created.");
            return;
        }
        
        library.login(username);
        User user = library.getCurrentUser();
        System.out.println("Hello " + user.getFirstName() + " " + user.getLastName());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

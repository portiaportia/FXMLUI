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
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.*;

/**
 *
 * @author portia
 */
public class LoginController implements Initializable {
    @FXML private TextField txt_username;
    @FXML private TextField txt_password;
    @FXML private Label lbl_error;
    
    @FXML
    private void btnLoginClicked(MouseEvent event) {
        String username = txt_username.getText();
        String password = txt_password.getText();
        
        Library library = Library.getInstance();
        
        if(!library.login(username)){
            lbl_error.setText("Invalid login credentials.");
            return;
        }
        
        User user = library.getCurrentUser();
        System.out.println("Hello " + user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}

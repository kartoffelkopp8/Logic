package com.example.logic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    public ListView list_E;
    @FXML
    private Button btn_close;
    @FXML
    private Button btn_ok;
    @FXML
    private Button btn_switch;
    @FXML
    private TextField txt_input;
    @FXML
    private Label lbl_edit;

    @FXML
    protected void close(){
        Platform.exit();
        System.exit(0);
    }
    @FXML
    protected String getInput(){
       return txt_input.getText();
    }
    public void test(){
        for(char c : getInput().toCharArray()){
            if (Character.isUpperCase(c)){
                
            } else if (Character.isLowerCase(c)) {
                
            }
        }
    }

}
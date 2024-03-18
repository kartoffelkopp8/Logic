package com.example.logic;

import Logic.Predicate;
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
    @FXML
    public void test(){
        char name = ' ';
        int amount = 0;
        boolean not = false;
        String input = getInput();
        for(char c : input.toCharArray()){
            if (Character.isUpperCase(c)){
                name = c;
            } else if (Character.isLowerCase(c)) {
                amount++;
            }
        }
        if (input.charAt(0) == '~'){
            not = true;
        }
        Predicate pred = new Predicate(name, amount, not);
        // Verwenden Sie 'pred' hier oder geben Sie es zurück, je nachdem, was Sie tun möchten
    }


}
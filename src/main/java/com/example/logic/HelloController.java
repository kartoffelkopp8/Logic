package com.example.logic;

import Logic.Constant;
import Logic.Predicate;
import Logic.Variable;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.*;

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
        ArrayList<Constant> constants = new ArrayList<>();
        ArrayList<Variable> variables = new ArrayList<>();
        char name = ' ';
        int amount = 0;
        boolean not = false;
        String input = getInput();
        for(char c : input.toCharArray()){
            if (Character.isUpperCase(c)){
                name = c;
            } else if (Character.isLowerCase(c)) {
                Set <Character> variableChars = new HashSet<>(Arrays.asList('v', 'w', 'x','y', 'z'));
                Set <Character> constantChars = new HashSet<>(Arrays.asList('v', 'w', 'x','y', 'z'));
                amount++;
                if (variableChars.contains(c)){
                    variables.add(new Variable(c));
                } else if (constantChars.contains(c)){
                    constants.add(new Constant(c));
                }
            }
        }
        if (input.charAt(0) == '~'){
            not = true;
        }
        Predicate pred = new Predicate(name, amount, not, constants, variables);
    }


}
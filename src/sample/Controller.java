package sample;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class Controller {

    public Main kek = new Main();



    @FXML
    public JFXButton zero;
    @FXML
    public JFXButton one;
    @FXML
    public JFXButton two;
    @FXML
    public JFXButton three;
    @FXML
    public JFXButton four;
    @FXML
    public JFXButton five;
    @FXML
    public JFXButton six;
    @FXML
    public JFXButton seven;
    @FXML
    public JFXButton eight;
    @FXML
    public JFXButton nine;
    @FXML
    public JFXButton point;
    @FXML
    public JFXButton clearall;
    @FXML
    public JFXButton plus;
    @FXML
    public JFXButton minus;
    @FXML
    public JFXButton multi;
    @FXML
    public JFXButton divide;
    @FXML
    public JFXButton equal;
    @FXML
    public JFXTextField input;
    @FXML
    public Label prom;
    @FXML
    public CheckBox ruleCheck;





    private double fnumber;
    private double snumber;
    private String operation ="";

    @FXML
    public void point_click(){
        String oldvalue = input.getText();
        String set = ".";
        input.setText(oldvalue+set);
    }
    @FXML
    public void zero_click(){
        String oldvalue = input.getText();
        String set = "0";
        input.setText(oldvalue+set);
    }
    @FXML
    public void zerozero_click() {
        String oldvalue = input.getText();
        String set = "00";
        input.setText(oldvalue+set);
    }
    @FXML
    public void one_click(){
        String oldvalue = input.getText();
        String set = "1";
        input.setText(oldvalue+set);
    }

    @FXML
    public void two_click(){
        String oldvalue = input.getText();
        String set = "2";
        input.setText(oldvalue+set);
    }
    @FXML
    public void three_click(){
        String oldvalue = input.getText();
        String set = "3";
        input.setText(oldvalue+set);
    }
    @FXML
    public void four_click(){
        String oldvalue = input.getText();
        String set = "4";
        input.setText(oldvalue+set);
    }
    @FXML
    public void five_click(){
        String oldvalue = input.getText();
        String set = "5";
        input.setText(oldvalue+set);
    }
    @FXML
    public void six_click(){
        String oldvalue = input.getText();
        String set = "6";
        input.setText(oldvalue+set);
    }
    @FXML
    public void seven_click(){
        String oldvalue = input.getText();
        String set = "7";
        input.setText(oldvalue+set);
    }
    @FXML
    public void eight_click(){
        String oldvalue = input.getText();
        String set = "8";
        input.setText(oldvalue+set);
    }
    @FXML
    public void nine_click(){
        String oldvalue = input.getText();
        String set = "9";
        input.setText(oldvalue+set);
    }
    @FXML
    public void plus_click(){
        if (operation =="")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(value +"+");
            operation = "+";
        }


    }
    @FXML
    public void minus_click(){
        if (operation =="")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(value +"-");
            operation = "-";
        }

    }
    @FXML
    public void multi_click(){
        if (operation =="")
        {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value +"x");
        operation = "x";
        }
    }
    @FXML
    public void divide_click(){
        if(operation == "")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(value +"/");
            operation = "/";
        }

    }
    @FXML
    public void sqrt_click() {

            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            prom.setText("√" + value);
            input.setText(String.valueOf(Math.sqrt(valuenumber)));

    }


    @FXML
    public void equal_click(){
        switch(operation){
            case "+":
                String value = input.getText();
                this.snumber = Double.parseDouble(value);
                double system = this.fnumber+this.snumber;
                input.setText(String.valueOf(system));
                String oldprom = prom.getText();
                prom.setText((oldprom+value));
                operation="";
                break;

            case "-":
                String valueplus = input.getText();
                this.snumber = Double.parseDouble(valueplus);
                double systemplus = this.fnumber-this.snumber;
                input.setText(String.valueOf(systemplus));
                String oldpromplus = prom.getText();
                prom.setText((oldpromplus+valueplus));
                operation="";
                break;
            case "x":
                String valuemulti = input.getText();
                this.snumber = Double.parseDouble(valuemulti);
                double systemmulti = this.fnumber*this.snumber;
                input.setText(String.valueOf(systemmulti));
                String oldprommulti = prom.getText();
                prom.setText((oldprommulti+valuemulti));
                operation="";
                break;

            case "/":
                String valuediv = input.getText();
                this.snumber = Double.parseDouble(valuediv);
                double systemdiv = this.fnumber/this.snumber;
                input.setText(String.valueOf(systemdiv));
                String oldpromdiv = prom.getText();
                prom.setText((oldpromdiv+valuediv));
                operation="";
                break;


        }
    }

    @FXML
    public void clear_click(){
        input.setText("");
        //prom.setText("");
        //this.fnumber=0.0;
        //this.snumber=0;
    }
    @FXML
    public void clearall_click() {
        input.setText("");
        prom.setText("");
        this.fnumber=0.0;
        this.snumber=0.0;
    }
    @FXML
    public void undo_click() {
        if(input.getText().length() !=0)
        {
            input.setText(input.getText(0,input.getText().length()-1));
        }
        else{

        }

    }



}


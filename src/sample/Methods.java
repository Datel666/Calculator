package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;


public class Methods {


    public void pointSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = ".";
        input.setText(oldvalue+set);
    }

    public void zeroSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "0";
        input.setText(oldvalue+set);
    }

    public void doublezeroSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "00";
        input.setText(oldvalue+set);
    }

    public void oneSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "1";
        input.setText(oldvalue+set);
    }

    public void twoSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "2";
        input.setText(oldvalue+set);
    }

    public void threeSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "3";
        input.setText(oldvalue+set);
    }

    public void fourSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "4";
        input.setText(oldvalue+set);
    }

    public void fiveSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "5";
        input.setText(oldvalue+set);
    }

    public void sixSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "6";
        input.setText(oldvalue+set);
    }

    public void sevenSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "7";
        input.setText(oldvalue+set);
    }

    public void eightSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "8";
        input.setText(oldvalue+set);
    }

    public void nineSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "9";
        input.setText(oldvalue+set);
    }

    public void plusSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value +"+");
            operation.ref1 = "+";
        }
    }

    public void minusSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value +"-");
            operation.ref1 = "-";
        }
    }

    public void multiSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value +"x");
            operation.ref1 = "x";
        }
    }

    public void divideSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if(operation.ref1 == "")
        {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value +"/");
            operation.ref1 = "/";
        }
    }

    public void sqrtValue(JFXTextField input,Wrapper fnumber,Label prom){
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        fnumber.ref1 = valuenumber;
        prom.setText("√" + value);
        input.setText(String.valueOf(Math.sqrt(valuenumber)));
    }

    public void performLogic(JFXTextField input,Wrapper operation,Wrapper snumber,Wrapper fnumber,Label prom){

        switch((String)operation.ref1){
            case "+":
                String value = input.getText();
                snumber.ref1 = Double.parseDouble(value);
                double system = (Double)fnumber.ref1+(Double)snumber.ref1;
                input.setText(String.valueOf(system));
                String oldprom = prom.getText();
                prom.setText((oldprom+value));
                operation.ref1="";
                break;

            case "-":
                String valueminus = input.getText();
                snumber.ref1 = Double.parseDouble(valueminus);
                double systemminus = (Double)fnumber.ref1-(Double)snumber.ref1;
                input.setText(String.valueOf(systemminus));
                String oldpromminus = prom.getText();
                prom.setText((oldpromminus+valueminus));
                operation.ref1="";
                break;
            case "x":
                String valuemulti = input.getText();
                snumber.ref1 = Double.parseDouble(valuemulti);
                double systemmulti = (Double)fnumber.ref1*(Double)snumber.ref1;
                input.setText(String.valueOf(systemmulti));
                String oldprommulti = prom.getText();
                prom.setText((oldprommulti+valuemulti));
                operation.ref1="";
                break;

            case "/":
                String valuediv = input.getText();
                snumber.ref1 = Double.parseDouble(valuediv);
                double systemdiv = (Double)fnumber.ref1/(Double)snumber.ref1;
                input.setText(String.valueOf(systemdiv));
                String oldpromdiv = prom.getText();
                prom.setText((oldpromdiv+valuediv));
                operation.ref1="";
                break;
        }
    }




    public void performUndo(JFXTextField input){
        if(input.getText().length() !=0)
        {
            input.setText(input.getText(0,input.getText().length()-1));
        }
        else{

        }
    }

}

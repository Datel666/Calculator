package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import sun.nio.cs.UTF_32;

import java.math.BigInteger;


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

    public void ASet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "A";
        input.setText(oldvalue+set);
    }

    public void BSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "B";
        input.setText(oldvalue+set);
    }

    public void CSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "C";
        input.setText(oldvalue+set);
    }

    public void DSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "D";
        input.setText(oldvalue+set);
    }

    public void ESet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "E";
        input.setText(oldvalue+set);
    }

    public void FSet(JFXTextField input){
        String oldvalue = input.getText();
        String set = "F";
        input.setText(oldvalue+set);
    }


    public void plusSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom,int level){
        if (operation.ref1 =="")
        {
            if(level ==10) {
                String value = input.getText();
                double valuenumber = Double.parseDouble(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "+");
                operation.ref1 = "+";
            }
            else if ( level == 8 || level ==16)
            {
                String value = input.getText();
                int valuenumber = Integer.parseUnsignedInt(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "+");
                operation.ref1 = "+";
            }
            else if (level ==2)
            {
                String value = input.getText();
                int valuenumber = binaryToInteger(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "+");
                operation.ref1 = "+";
            }
        }
    }

    public void minusSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom, int level){
        if (operation.ref1 =="")
        {
            if(level ==10) {
                String value = input.getText();
                double valuenumber = Double.parseDouble(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "-");
                operation.ref1 = "-";
            }
            else if ( level == 8 || level ==16)
            {
                String value = input.getText();
                int valuenumber = Integer.parseUnsignedInt(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "-");
                operation.ref1 = "-";
            }
            else if (level ==2)
            {
                String value = input.getText();
                int valuenumber = binaryToInteger(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "-");
                operation.ref1 = "-";
            }
        }
    }

    public void multiSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom, int level){
        if (operation.ref1 =="")
        {
            if(level ==10) {
                String value = input.getText();
                double valuenumber = Double.parseDouble(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "x");
                operation.ref1 = "x";
            }
            else if ( level == 8 || level ==16)
            {
                String value = input.getText();
                int valuenumber = Integer.parseUnsignedInt(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "x");
                operation.ref1 = "x";
            }
            else if (level ==2)
            {
                String value = input.getText();
                int valuenumber = binaryToInteger(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "x");
                operation.ref1 = "x";
            }
        }
    }

    public void divideSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom, int level){
        if(operation.ref1 == "")
        {
            if(level ==10) {
                String value = input.getText();
                double valuenumber = Double.parseDouble(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "/");
                operation.ref1 = "/";
            }
            else if (level == 8 || level ==16)
            {
                String value = input.getText();
                int valuenumber = Integer.parseUnsignedInt(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "/");
                operation.ref1 = "/";
            }
            else if (level ==2)
            {
                String value = input.getText();
                int valuenumber = binaryToInteger(value);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "/");
                operation.ref1 = "/";
            }
        }
    }

    public void orSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="") {

            String value = input.getText();
            int valuenumber = Integer.parseUnsignedInt(value,2);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value + "|");
            operation.ref1 = "|";
        }
    }

    public void xorSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="") {

            String value = input.getText();
            int valuenumber = Integer.parseUnsignedInt(value,2);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value + "^");
            operation.ref1 = "^";
        }
    }

    public void andSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="") {

            String value = input.getText();
            int valuenumber = Integer.parseUnsignedInt(value,2);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value + "&");
            operation.ref1 = "&";
        }
    }

    public void notSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom){
        if (operation.ref1 =="") {
            String value = input.getText();
            int valuenumber = binaryToInteger(value);
            fnumber.ref1 = valuenumber;
            if (value =="")
            {
                prom.setText("0"+"!");
            }
            else {
                prom.setText(value + "!");
            }
            input.setText(Integer.toBinaryString(~valuenumber));
            operation.ref1 = "";
        }
    }

    public void sqrtValue(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom,int level){
        if (operation.ref1 =="") {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            fnumber.ref1 = valuenumber;
            prom.setText("√" + value);
            input.setText(String.valueOf(Math.sqrt(valuenumber)));
            operation.ref1 = "";
        }
    }

    public void bitwiseLogic(JFXTextField input,Wrapper operation,Wrapper snumber,Wrapper fnumber,Label prom)
    {
        switch ((String) operation.ref1)
        {
            case "&":
                String valueand = input.getText();
                snumber.ref1 = Integer.parseUnsignedInt(valueand,2);
                int system = (int)fnumber.ref1&(int)snumber.ref1;
                input.setText(String.valueOf(system));
                String oldprom = prom.getText();
                prom.setText((oldprom + valueand));
                operation.ref1 = "";
                break;

            case "|":
                String valueor = input.getText();
                snumber.ref1 = Integer.parseUnsignedInt(valueor,2);
                int systemand = (int)fnumber.ref1|(int)snumber.ref1;
                input.setText(String.valueOf(systemand));
                String oldpromor = prom.getText();
                prom.setText((oldpromor + valueor));
                operation.ref1 = "";
                break;

            case "^":
                String valuexor = input.getText();
                snumber.ref1 = Integer.parseUnsignedInt(valuexor,2);
                int systemxor = (int)fnumber.ref1^(int)snumber.ref1;
                input.setText(String.valueOf(systemxor));
                String oldpromxor = prom.getText();
                prom.setText((oldpromxor + valuexor));
                operation.ref1 = "";
                break;
        }

    }

    public void performLogic(JFXTextField input,Wrapper operation,Wrapper snumber,Wrapper fnumber,Label prom,int level){
        if (level ==10)
        {
            switch ((String) operation.ref1)
            {
                case "+":
                    String value = input.getText();
                    snumber.ref1 = Double.parseDouble(value);
                    double system = (Double) fnumber.ref1 + (Double) snumber.ref1;
                    input.setText(String.valueOf(system));
                    String oldprom = prom.getText();
                    prom.setText((oldprom + value));
                    operation.ref1 = "";
                    break;

                case "-":
                    String valueminus = input.getText();
                    snumber.ref1 = Double.parseDouble(valueminus);
                    double systemminus = (Double) fnumber.ref1 - (Double) snumber.ref1;
                    input.setText(String.valueOf(systemminus));
                    String oldpromminus = prom.getText();
                    prom.setText((oldpromminus + valueminus));
                    operation.ref1 = "";
                    break;
                case "x":
                    String valuemulti = input.getText();
                    snumber.ref1 = Double.parseDouble(valuemulti);
                    double systemmulti = (Double) fnumber.ref1 * (Double) snumber.ref1;
                    input.setText(String.valueOf(systemmulti));
                    String oldprommulti = prom.getText();
                    prom.setText((oldprommulti + valuemulti));
                    operation.ref1 = "";
                    break;

                case "/":
                    String valuediv = input.getText();
                    snumber.ref1 = Double.parseDouble(valuediv);
                    double systemdiv = (Double) fnumber.ref1 / (Double) snumber.ref1;
                    input.setText(String.valueOf(systemdiv));
                    String oldpromdiv = prom.getText();
                    prom.setText((oldpromdiv + valuediv));
                    operation.ref1 = "";
                    break;
            }
        }
        else if (level==8 || level==16)
        {
            switch ((String) operation.ref1)
            {
                case "+":
                    String value = input.getText();
                    snumber.ref1 =Integer.parseUnsignedInt(value,level);
                    int system = (int)fnumber.ref1 + (int)snumber.ref1;
                    input.setText(Integer.toString(system,level).toUpperCase());
                    String oldprom = prom.getText();
                    prom.setText((oldprom + value));
                    operation.ref1 = "";
                    break;

                case "-":
                    String valueminus = input.getText();
                    snumber.ref1 = Integer.parseUnsignedInt(valueminus,level);
                    int systemminus = (int)fnumber.ref1 - (int)snumber.ref1;
                    input.setText(Integer.toString(systemminus,level).toUpperCase());
                    String oldpromminus = prom.getText();
                    prom.setText((oldpromminus + valueminus));
                    operation.ref1 = "";
                    break;
                case "x":
                    String valuemulti = input.getText();
                    snumber.ref1 = Integer.parseUnsignedInt(valuemulti,level);
                    int systemmulti = (int)fnumber.ref1 * (int)snumber.ref1;
                    input.setText(Integer.toString(systemmulti,level).toUpperCase());
                    String oldprommulti = prom.getText();
                    prom.setText((oldprommulti + valuemulti));
                    operation.ref1 = "";
                    break;

                case "/":
                    String valuediv = input.getText();
                    snumber.ref1 = Integer.parseUnsignedInt(valuediv,level);
                    int systemdiv = (int)fnumber.ref1 / (int)snumber.ref1;
                    input.setText(Integer.toString(systemdiv,level).toUpperCase());
                    String oldpromdiv = prom.getText();
                    prom.setText((oldpromdiv + valuediv));
                    operation.ref1 = "";
                    break;
            }
        }
        else if (level ==2)
        {
            switch ((String) operation.ref1)
            {
                case "+":
                    String value = input.getText();
                    snumber.ref1 = Integer.parseUnsignedInt(value,level);
                    int system = (int)fnumber.ref1 + (int)snumber.ref1;
                    input.setText(Integer.toString(system));
                    String oldprom = prom.getText();
                    prom.setText((oldprom + value));
                    operation.ref1 = "";
                    break;

                case "-":
                    String valueminus = input.getText();
                    snumber.ref1 = Integer.parseUnsignedInt(valueminus,level);
                    int systemminus = (int)fnumber.ref1 - (int)snumber.ref1;
                    input.setText(Integer.toString(systemminus,level).toUpperCase());
                    String oldpromminus = prom.getText();
                    prom.setText((oldpromminus + valueminus));
                    operation.ref1 = "";
                    break;
                case "x":
                    String valuemulti = input.getText();
                    snumber.ref1 =Integer.parseUnsignedInt(valuemulti,level);
                    int systemmulti = (int)fnumber.ref1 * (int)snumber.ref1;
                    input.setText(Integer.toString(systemmulti,level).toUpperCase());
                    String oldprommulti = prom.getText();
                    prom.setText((oldprommulti + valuemulti));
                    operation.ref1 = "";
                    break;

                case "/":
                    String valuediv = input.getText();
                    snumber.ref1 = Integer.parseUnsignedInt(valuediv,level);
                    int systemdiv = (int)fnumber.ref1 / (int)snumber.ref1;
                    input.setText(Integer.toString(systemdiv,level).toUpperCase());
                    String oldpromdiv = prom.getText();
                    prom.setText((oldpromdiv + valuediv));
                    operation.ref1 = "";
                    break;
            }
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

    public void adapt(JFXTextField input, int level, int prlevel){
        String temp = input.getText();
        int prevvalue = Integer.parseUnsignedInt(temp,prlevel);
        input.setText(Integer.toString(prevvalue,level));
    }

    public int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    }

}

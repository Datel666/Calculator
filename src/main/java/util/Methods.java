package main.java.util;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Label;


import javax.swing.*;
import java.math.BigDecimal;
import java.math.BigInteger;


public class Methods {

    String regExp = "[\\x00-\\x20]*[+-]?(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*";

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


    public void plusSet(JFXTextField input, Wrapper operation, Wrapper fnumber, Label prom, int level){
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
                BigInteger valuenumber = new BigInteger(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "+");
                operation.ref1 = "+";
            }
            else if (level ==2)
            {
                String value = input.getText();
                BigInteger valuenumber = new BigInteger(value,2);
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
                BigInteger valuenumber = new BigInteger(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "-");
                operation.ref1 = "-";
            }
            else if (level ==2)
            {
                String value = input.getText();
                BigInteger valuenumber = new BigInteger(value,2);
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
                BigInteger valuenumber = new BigInteger(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "x");
                operation.ref1 = "x";
            }
            else if (level ==2)
            {
                String value = input.getText();
                BigInteger valuenumber = new BigInteger(value,2);
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
                BigInteger valuenumber = new BigInteger(value,level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "/");
                operation.ref1 = "/";
            }
            else if (level ==2)
            {
                String value = input.getText();
                BigInteger valuenumber = new BigInteger(value,2);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "/");
                operation.ref1 = "/";
            }
        }
    }
    public void debug(String val) {

        JOptionPane.showMessageDialog(null, val, "Помощь" , JOptionPane.INFORMATION_MESSAGE);

    }
    public void orSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom,int level){
        if (operation.ref1 =="") {
            if (level==16)
            {
                String value = input.getText();
                BigInteger req1 = new BigInteger(value,16);
                String req2 = req1.toString();
                BigInteger valuenumber = new BigInteger(req2, level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "|");
                operation.ref1 = "|";
            }
            else {
                String value = input.getText();
                BigInteger req1 = BigInteger.valueOf(((long) Double.parseDouble(value)));
                String req2 = req1.toString();
                BigInteger valuenumber = new BigInteger(req2, level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "|");
                operation.ref1 = "|";
            }

        }
    }

    public void xorSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom,int level){
        if (operation.ref1 =="") {
            if (level==16)
            {
                String value = input.getText();
                BigInteger req1 = new BigInteger(value,16);
                String req2 = req1.toString();
                BigInteger valuenumber = new BigInteger(req2, level);
                fnumber.ref1 = valuenumber;
                input.setText("");
                prom.setText(value + "^");
                operation.ref1 = "^";
            }
            else{
            String value = input.getText();
            BigInteger req1 = BigInteger.valueOf(((long) Double.parseDouble(value)));
            String req2 = req1.toString();
            BigInteger valuenumber = new BigInteger(req2, level);
            fnumber.ref1 = valuenumber;
            input.setText("");
            prom.setText(value + "^");
            operation.ref1 = "^";
            }

        }
    }

    public void andSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom,int level){
        if (operation.ref1 =="") {
            if (level==16)
            {
                String value = input.getText();
                BigInteger req1 = new BigInteger(value,16);
                String req2 = req1.toString();
                BigInteger valueand = new BigInteger(req2,level);
                fnumber.ref1 = valueand;
                input.setText("");
                prom.setText(value + "&");
                operation.ref1 = "&";
            }
            else{
            String value = input.getText();
            BigInteger req1 = BigInteger.valueOf(((long) Double.parseDouble(value)));
            String req2 = req1.toString();
            BigInteger valueand = new BigInteger(req2,level);
            fnumber.ref1 = valueand;
            input.setText("");
            prom.setText(value + "&");
            operation.ref1 = "&";
            }
        }
    }

    public void notSet(JFXTextField input,Wrapper operation,Wrapper fnumber,Label prom,int level){
        if (operation.ref1 =="") {
            if (level==16)
            {
                String value = input.getText();
                BigInteger req1 = new BigInteger(value,16);
                BigInteger temp = req1.not();
                fnumber.ref1 = temp;
                if (value == "") {
                    prom.setText("0" + "!");
                } else {
                    prom.setText(value + "!");
                }
                input.setText(temp.toString(level));
                operation.ref1 = "";
            }
            else {
                String value = input.getText();
                BigInteger req1 = BigInteger.valueOf(((long) Double.parseDouble(value)));
                String req2 = req1.toString();
                BigInteger valuenumber = new BigInteger(req2, level);
                BigInteger temp = valuenumber.not();
                fnumber.ref1 = temp;
                if (value == "") {
                    prom.setText("0" + "!");
                } else {
                    prom.setText(value + "!");
                }
                input.setText(temp.toString(level));
                operation.ref1 = "";
            }
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

    public void bitwiseLogic(JFXTextField input,Wrapper operation,Wrapper snumber,Wrapper fnumber,Label prom,int level)
    {
        switch ((String) operation.ref1)
        {
            case "&":
                String valueand = input.getText();
                snumber.ref1 = new BigInteger(valueand,level);
                BigInteger tempand1 = (BigInteger)snumber.ref1;
                BigInteger tempand2 = (BigInteger)fnumber.ref1;
                BigInteger systemand = tempand2.and(tempand1);
                input.setText(systemand.toString(level));
                String oldprom = prom.getText();
                prom.setText((oldprom + valueand));
                operation.ref1 = "";
                break;

            case "|":
                String valueor = input.getText();
                snumber.ref1 = new BigInteger(valueor,level);
                BigInteger tempor1 = (BigInteger)snumber.ref1;
                BigInteger tempor2 = (BigInteger)fnumber.ref1;
                BigInteger systemor = tempor2.or(tempor1);
                input.setText(systemor.toString(level));
                String oldpromor = prom.getText();
                prom.setText((oldpromor + valueor));
                operation.ref1 = "";
                break;

            case "^":
                String valuexor = input.getText();

                snumber.ref1 = new BigInteger(valuexor,level);
                BigInteger tempxor1 = (BigInteger)snumber.ref1;
                BigInteger tempxor2 = (BigInteger)fnumber.ref1;
                BigInteger systemxor = tempxor2.xor(tempxor1);
                input.setText(systemxor.toString(level));
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
                    snumber.ref1 = new BigInteger(value,level);
                    BigInteger tempplus1 = (BigInteger)snumber.ref1;
                    BigInteger tempplus2 = (BigInteger)fnumber.ref1;
                    BigInteger systemplus = tempplus2.and(tempplus1);
                    input.setText(systemplus.toString(level));
                    String oldprom = prom.getText();
                    prom.setText((oldprom + value));
                    operation.ref1 = "";
                    break;

                case "-":
                    String valueminus = input.getText();
                    snumber.ref1 = new BigInteger(valueminus,level);
                    BigInteger tempminus1 = (BigInteger)snumber.ref1;
                    BigInteger tempminus2 = (BigInteger)fnumber.ref1;
                    BigInteger systemminus = tempminus2.subtract(tempminus1);
                    input.setText(systemminus.toString(level));
                    String oldpromminus = prom.getText();
                    prom.setText((oldpromminus + valueminus));
                    operation.ref1 = "";
                    break;
                case "x":
                    String valuemulti = input.getText();
                    snumber.ref1 = new BigInteger(valuemulti,level);
                    BigInteger tempmulti1 = (BigInteger)snumber.ref1;
                    BigInteger tempmulti2 = (BigInteger)fnumber.ref1;
                    BigInteger systemmulti = tempmulti2.multiply(tempmulti1);
                    input.setText(systemmulti.toString(level));
                    String oldprommulti = prom.getText();
                    prom.setText((oldprommulti + valuemulti));
                    operation.ref1 = "";
                    break;

                case "/":
                    String valuediv = input.getText();
                    snumber.ref1 = new BigInteger(valuediv,level);
                    BigInteger tempdiv1 = (BigInteger)snumber.ref1;
                    BigInteger tempdiv2 = (BigInteger)fnumber.ref1;
                    BigInteger systemdiv = tempdiv2.divide(tempdiv1);
                    input.setText(systemdiv.toString(level));
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
                    snumber.ref1 = new BigInteger(value,level);
                    BigInteger tempplus1 = (BigInteger)snumber.ref1;
                    BigInteger tempplus2 = (BigInteger)fnumber.ref1;
                    BigInteger systemplus = tempplus1.add(tempplus2);
                    input.setText(systemplus.toString(2));
                    String oldprom = prom.getText();
                    prom.setText((oldprom + value));
                    operation.ref1 = "";
                    break;

                case "-":
                    String valueminus = input.getText();
                    snumber.ref1 = new BigInteger(valueminus,level);
                    BigInteger tempmminus1 = (BigInteger)snumber.ref1;
                    BigInteger tempminus2 = (BigInteger)fnumber.ref1;
                    BigInteger systemminus = tempminus2.subtract(tempmminus1);
                    input.setText(systemminus.toString(2));
                    String oldpromminus = prom.getText();
                    prom.setText((oldpromminus + valueminus));
                    operation.ref1 = "";
                    break;
                case "x":
                    String valuemulti = input.getText();
                    snumber.ref1 = new BigInteger(valuemulti,level);
                    BigInteger tempmulti1 = (BigInteger)snumber.ref1;
                    BigInteger tempmulti2 = (BigInteger)fnumber.ref1;
                    BigInteger systemmulti = tempmulti2.multiply(tempmulti1);
                    input.setText(systemmulti.toString(2));
                    String oldprommulti = prom.getText();
                    prom.setText((oldprommulti + valuemulti));
                    operation.ref1 = "";
                    break;

                case "/":
                    String valuediv = input.getText();
                    snumber.ref1 = new BigInteger(valuediv,level);
                    BigInteger tempdiv1 = (BigInteger)snumber.ref1;
                    BigInteger tempdiv2 = (BigInteger)fnumber.ref1;
                    BigInteger systemdiv = tempdiv2.divide(tempdiv1);
                    input.setText(systemdiv.toString(2));
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
        try {
            String temp = input.getText();
            BigInteger prevvalue = new BigInteger(temp, prlevel);
            input.setText(prevvalue.toString(level));
        }
        catch (Exception ex){

        }
    }

    public long binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        long result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    }

}

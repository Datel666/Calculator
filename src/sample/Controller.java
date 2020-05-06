package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Controller {

    // Right buttons section

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
    public JFXButton sqrt;


    //Left buttons section

    @FXML
    public JFXButton A;
    @FXML
    public JFXButton B;
    @FXML
    public JFXButton C;
    @FXML
    public JFXButton D;
    @FXML
    public JFXButton E;
    @FXML
    public JFXButton F;
    @FXML
    public JFXButton or;
    @FXML
    public JFXButton xor;
    @FXML
    public JFXButton not;
    @FXML
    public JFXButton and;


    @FXML
    public JFXTextField input;
    @FXML
    public Label prom;

    @FXML
    public JFXCheckBox programmerFlag;

    @FXML
    public JFXRadioButton hexRadio;
    @FXML
    public JFXRadioButton decRadio;
    @FXML
    public JFXRadioButton octRadio;
    @FXML
    public JFXRadioButton binRadio;


    private double fnumber = 0;
    private double snumber;
    private int lfnumber = 0;
    private int lsnumber;
    private String operation ="";
    private int level = 10;
    private int prlevel;
    private boolean flag = false;


    public Methods mets = new Methods();

    public void point_click(){
       mets.pointSet(input);

    }

    public void zero_click(){
        mets.zeroSet(input);
    }

    public void zerozero_click() {
        mets.doublezeroSet(input);
    }

    public void one_click(){
        mets.oneSet(input);
    }


    public void two_click(){
        mets.twoSet(input);
    }

    public void three_click(){
        mets.threeSet(input);
    }

    public void four_click(){
        mets.fourSet(input);
    }

    public void five_click(){
        mets.fiveSet(input);
    }

    public void six_click(){
        mets.sixSet(input);
    }

    public void seven_click(){
        mets.sevenSet(input);
    }

    public void eight_click(){
        mets.eightSet(input);
    }

    public void nine_click(){
        mets.nineSet(input);
    }

    public void plus_click(){
        if (level ==10) {

            Wrapper fvar = new Wrapper(this.fnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.plusSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.fnumber = (Double) fvar.ref1;
        }
        else{
            Wrapper fvar = new Wrapper(this.lfnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.plusSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.lfnumber = (int)fvar.ref1;
        }
    }

    public void minus_click(){
        if (level ==10) {
            Wrapper fvar = new Wrapper(this.fnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.minusSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.fnumber = (Double) fvar.ref1;
        }
        else{
            Wrapper fvar = new Wrapper(this.lfnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.minusSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.lfnumber = (int)fvar.ref1;
        }
    }

    public void multi_click(){
        if(level ==10)
        {
            Wrapper fvar = new Wrapper(this.fnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.multiSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.fnumber = (Double) fvar.ref1;
        }
        else{
            Wrapper fvar = new Wrapper(this.lfnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.multiSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.lfnumber = (int)fvar.ref1;
        }
    }

    public void divide_click(){
        if(level==10) {
            Wrapper fvar = new Wrapper(this.fnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.divideSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.fnumber = (Double) fvar.ref1;
        }
        else{
            Wrapper fvar = new Wrapper(this.lfnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.divideSet(input, opvar, fvar, prom, level);
            operation = (String) opvar.ref1;
            this.lfnumber = (int)fvar.ref1;
        }
    }

    public void sqrt_click() {
        Wrapper fvar = new Wrapper(this.fnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.sqrtValue(input,opvar,fvar,prom,level);
        this.fnumber = (Double)fvar.ref1;
    }


    public void equal_click(){
        if ((operation.equals("^"))||(operation.equals("&"))||(operation.equals("|")))
        {
            Wrapper fvar = new Wrapper(this.lfnumber);
            Wrapper svar = new Wrapper(this.lsnumber);
            Wrapper opvar = new Wrapper(operation);
            mets.bitwiseLogic(input, opvar, svar, fvar, prom);
            this.lfnumber = (int) fvar.ref1;
            this.lsnumber = (int) svar.ref1;
            operation = (String) opvar.ref1;
        }
        else {
            if (level == 10)
            {
                Wrapper fvar = new Wrapper(this.fnumber);
                Wrapper svar = new Wrapper(this.snumber);
                Wrapper opvar = new Wrapper(operation);
                mets.performLogic(input, opvar, svar, fvar, prom, level);
                this.fnumber = (Double) fvar.ref1;
                this.snumber = (Double) svar.ref1;
                operation = (String) opvar.ref1;
            }
            else
                {
                Wrapper fvar = new Wrapper(this.lfnumber);
                Wrapper svar = new Wrapper(this.lsnumber);
                Wrapper opvar = new Wrapper(operation);
                mets.performLogic(input, opvar, svar, fvar, prom, level);
                this.lfnumber = (int) fvar.ref1;
                this.lsnumber = (int) svar.ref1;
                operation = (String) opvar.ref1;
            }
        }

    }

    public void clear_click(){
        input.setText("");
        //prom.setText("");
        //this.fnumber=0.0;
        //this.snumber=0;
    }

    public void clearall_click() {
        input.setText("");
        prom.setText("");
        this.fnumber=0.0;
        this.snumber=0.0;
        this.lfnumber=0;
        this.lsnumber=0;
    }

    public void undo_click() {
        mets.performUndo(input);
    }


    public void godHelpClick() {

        JOptionPane.showMessageDialog(null, "Бог поможет!!!", "Помощь" , JOptionPane.INFORMATION_MESSAGE);

    }

    public void hexClicked() {
        prlevel = level;
        level = 16;
            A.setDisable(false);
            B.setDisable(false);
            C.setDisable(false);
            D.setDisable(false);
            E.setDisable(false);
            F.setDisable(false);
            point.setDisable(true);
            nine.setDisable(false);
            eight.setDisable(false);
            seven.setDisable(false);
            six.setDisable(false);
            five.setDisable(false);
            four.setDisable(false);
            three.setDisable(false);
            two.setDisable(false);
        if(input.getText().length()!=0) {
            mets.adapt(input, level, prlevel);
        }
    }

    public void decClicked() {
        prlevel = level;
        level = 10;
            A.setDisable(true);
            B.setDisable(true);
            C.setDisable(true);
            D.setDisable(true);
            E.setDisable(true);
            F.setDisable(true);
            point.setDisable(false);
            nine.setDisable(false);
            eight.setDisable(false);
            seven.setDisable(false);
            six.setDisable(false);
            five.setDisable(false);
            four.setDisable(false);
            three.setDisable(false);
            two.setDisable(false);
        if(input.getText().length()!=0) {
            mets.adapt(input, level, prlevel);
        }
    }

    public void octClicked() {
        prlevel = level;
        level = 8;

            A.setDisable(true);
            B.setDisable(true);
            C.setDisable(true);
            D.setDisable(true);
            E.setDisable(true);
            F.setDisable(true);
            point.setDisable(true);
            nine.setDisable(true);
            eight.setDisable(true);
            seven.setDisable(false);
            six.setDisable(false);
            five.setDisable(false);
            four.setDisable(false);
            three.setDisable(false);
            two.setDisable(false);
        if(input.getText().length()!=0) {
            mets.adapt(input, level, prlevel);
        }
    }

    public void binClicked() {
        prlevel = level;
        level = 2;

            A.setDisable(true);
            B.setDisable(true);
            C.setDisable(true);
            D.setDisable(true);
            E.setDisable(true);
            F.setDisable(true);
            point.setDisable(true);
            nine.setDisable(true);
            eight.setDisable(true);
            seven.setDisable(true);
            six.setDisable(true);
            five.setDisable(true);
            four.setDisable(true);
            three.setDisable(true);
            two.setDisable(true);

            if(input.getText().length()!=0) {
                mets.adapt(input, level, prlevel);
            }
    }

    public void f_Click() {
        mets.FSet(input);
    }

    public void A_click() {
        mets.ASet(input);
    }

    public void not_Click()
    {
        Wrapper fvar = new Wrapper(this.lfnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.notSet(input,opvar,fvar,prom);
        this.lfnumber = (int)fvar.ref1;
    }

    public void b_Click() {
        mets.BSet(input);
    }

    public void xor_Click() {
        Wrapper fvar = new Wrapper(this.lfnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.xorSet(input,opvar,fvar,prom);
        this.lfnumber = (int)fvar.ref1;
    }

    public void c_Click() {
        mets.CSet(input);
    }

    public void or_Click() {
        Wrapper fvar = new Wrapper(this.lfnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.orSet(input,opvar,fvar,prom);
        this.lfnumber = (int)fvar.ref1;
    }

    public void d_Click() {
        mets.DSet(input);
    }

    public void and_Click() {
        Wrapper fvar = new Wrapper(this.lfnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.andSet(input,opvar,fvar,prom);
        this.lfnumber = (int)fvar.ref1;
    }

    public void e_Click() {
        mets.ESet(input);
    }

    public void programmerFlagChanged() {
        programmerFlag.setSelected(!flag);
        flag = programmerFlag.isSelected();
        if(flag == false) {
            decClicked();
            clearall_click();
            sqrt.setDisable(false);
            decRadio.setSelected(true);
        }
        sqrt.setDisable(flag);
        xor.setDisable(!flag);
        or.setDisable(!flag);
        and.setDisable(!flag);
        not.setDisable(!flag);
        hexRadio.setDisable(!flag);
        decRadio.setDisable(!flag);
        octRadio.setDisable(!flag);
        binRadio.setDisable(!flag);
    }
}




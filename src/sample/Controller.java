package sample;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;


public class Controller {

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

    public Main kek = new Main();
    public Methods mets = new Methods();




    @FXML
    public void point_click(){
       mets.pointSet(input);
    }
    @FXML
    public void zero_click(){
        mets.zeroSet(input);
    }
    @FXML
    public void zerozero_click() {
        mets.doublezeroSet(input);
    }
    @FXML
    public void one_click(){
        mets.oneSet(input);
    }

    @FXML
    public void two_click(){
        mets.twoSet(input);
    }
    @FXML
    public void three_click(){
        mets.threeSet(input);
    }
    @FXML
    public void four_click(){
        mets.fourSet(input);
    }
    @FXML
    public void five_click(){
        mets.fiveSet(input);
    }
    @FXML
    public void six_click(){
        mets.sixSet(input);
    }
    @FXML
    public void seven_click(){
        mets.sevenSet(input);
    }
    @FXML
    public void eight_click(){
        mets.eightSet(input);
    }
    @FXML
    public void nine_click(){
        mets.nineSet(input);
    }
    @FXML
    public void plus_click(){

        Wrapper fvar = new Wrapper(this.fnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.plusSet(input,opvar,fvar,prom);
        operation = (String)opvar.ref1;
        this.fnumber = (Double)fvar.ref1;
    }
    @FXML
    public void minus_click(){
        Wrapper fvar = new Wrapper(this.fnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.minusSet(input,opvar,fvar,prom);
        operation = (String)opvar.ref1;
        this.fnumber = (Double)fvar.ref1;
    }
    @FXML
    public void multi_click(){
        Wrapper fvar = new Wrapper(this.fnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.multiSet(input,opvar,fvar,prom);
        operation = (String)opvar.ref1;
        this.fnumber = (Double)fvar.ref1;
    }
    @FXML
    public void divide_click(){
        Wrapper fvar = new Wrapper(this.fnumber);
        Wrapper opvar = new Wrapper(operation);
        mets.divideSet(input,opvar,fvar,prom);
        operation = (String)opvar.ref1;
        this.fnumber = (Double)fvar.ref1;
    }
    @FXML
    public void sqrt_click() {
        Wrapper fvar = new Wrapper(this.fnumber);
        mets.sqrtValue(input,fvar,prom);
        this.fnumber = (Double)fvar.ref1;
    }

    @FXML
    public void equal_click(){
        Wrapper fvar = new Wrapper(this.fnumber);
        Wrapper svar = new Wrapper(this.snumber);
        Wrapper opvar = new Wrapper(operation);
        mets.performLogic(input,opvar,svar,fvar,prom);
        this.fnumber = (Double)fvar.ref1;
        this.snumber = (Double)svar.ref1;
        operation = (String)opvar.ref1;
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
        mets.performUndo(input);
    }

    public void Switch_click(ActionEvent actionEvent) {
        two.setDisable(!two.isDisabled());
        three.setDisable(!three.isDisabled());
    }
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function.point;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXComboBox;
import javafx.scene.control.Label;




/**
 *
 * @author Suchaimi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXTextField tfile;

    @FXML
    private JFXComboBox<Label> ttujuh;

    @FXML
    private JFXComboBox<Label> tdelapan;

    @FXML
    private JFXTextField tinterfacex;

    @FXML
    private JFXComboBox<Label> tdua;

    @FXML
    private JFXComboBox<Label> tlima;

    @FXML
    private JFXComboBox<Label> tempatbelas;

    @FXML
    private JFXComboBox<Label> tempat;

    @FXML
    private JFXComboBox<Label> tduabelas;

    @FXML
    private JFXTextField tquery;

    @FXML
    private JFXComboBox<Label> tlimabelas;

    @FXML
    private JFXTextField toutput;

    @FXML
    private JFXComboBox<Label> tsebelas;

    @FXML
    private JFXComboBox<Label> ttigabelas;

    @FXML
    private JFXTextField tinput;

    @FXML
    private JFXComboBox<Label> tsatu;

    @FXML
    private JFXComboBox<Label> ttiga;

    @FXML
    private JFXComboBox<Label> tenam;

    @FXML
    private JFXComboBox<Label> tsepuluh;

    @FXML
    private JFXComboBox<Label> tsembilan;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Check inputan file
        RequiredFieldValidator tfileValidator = new RequiredFieldValidator();
        tfile.getValidators().add(tfileValidator);
        tfileValidator.setMessage("Input tidak boleh kosong !");
        
        NumberValidator tfileNumValidator = new NumberValidator();
        tfile.getValidators().add(tfileNumValidator);
        tfileNumValidator.setMessage("Input harus angka !");
        
        tfile.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                tfile.validate();
            }
        });
        
        // Check inputan query
        RequiredFieldValidator tqueryValidator = new RequiredFieldValidator();
        tquery.getValidators().add(tqueryValidator);
        tqueryValidator.setMessage("Input tidak boleh kosong !");
        
        NumberValidator tqueryNumValidator = new NumberValidator();
        tquery.getValidators().add(tqueryNumValidator);
        tqueryNumValidator.setMessage("Input harus angka !");
        
        tquery.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                tquery.validate();
            }
        });
        
        // Check inputan output
        RequiredFieldValidator toutputValidator = new RequiredFieldValidator();
        toutput.getValidators().add(toutputValidator);
        toutputValidator.setMessage("Input tidak boleh kosong !");
        
        NumberValidator toutputNumValidator = new NumberValidator();
        toutput.getValidators().add(toutputNumValidator);
        toutputNumValidator.setMessage("Input harus angka !");
        
        toutput.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                toutput.validate();
            }
        });
        
        // Check inputan interface external
        RequiredFieldValidator tinterfacexValidator = new RequiredFieldValidator();
        tinterfacex.getValidators().add(tinterfacexValidator);
        tinterfacexValidator.setMessage("Input tidak boleh kosong !");
        
        NumberValidator tinterfacexNumValidator = new NumberValidator();
        tinterfacex.getValidators().add(tinterfacexNumValidator);
        tinterfacexNumValidator.setMessage("Input harus angka !");
        
        tinterfacex.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                tinterfacex.validate();
            }
        });
        
        // Check inputan input
        RequiredFieldValidator tinputValidator = new RequiredFieldValidator();
        tinput.getValidators().add(tinputValidator);
        tinputValidator.setMessage("Input tidak boleh kosong !");
        
        NumberValidator tinputNumValidator = new NumberValidator();
        tinput.getValidators().add(tinputNumValidator);
        tinputNumValidator.setMessage("Input harus angka !");
        
        tinput.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                tinput.validate();
            }
        });
        
        // Inputan satu
        tsatu.getItems().add(new Label("0"));
        tsatu.getItems().add(new Label("1"));
        tsatu.getItems().add(new Label("2"));
        tsatu.getItems().add(new Label("3"));
        tsatu.getItems().add(new Label("4"));
        tsatu.getItems().add(new Label("5"));
        tsatu.setEditable(false);
        
        // Inputan dua
        tdua.getItems().add(new Label("0"));
        tdua.getItems().add(new Label("1"));
        tdua.getItems().add(new Label("2"));
        tdua.getItems().add(new Label("3"));
        tdua.getItems().add(new Label("4"));
        tdua.getItems().add(new Label("5"));
        tdua.setEditable(false);
        
        // Inputan tiga
        ttiga.getItems().add(new Label("0"));
        ttiga.getItems().add(new Label("1"));
        ttiga.getItems().add(new Label("2"));
        ttiga.getItems().add(new Label("3"));
        ttiga.getItems().add(new Label("4"));
        ttiga.getItems().add(new Label("5"));
        ttiga.setEditable(false);
        
        // Inputan empat
        tempat.getItems().add(new Label("0"));
        tempat.getItems().add(new Label("1"));
        tempat.getItems().add(new Label("2"));
        tempat.getItems().add(new Label("3"));
        tempat.getItems().add(new Label("4"));
        tempat.getItems().add(new Label("5"));
        tempat.setEditable(false);
        
        // Inputan lima
        tlima.getItems().add(new Label("0"));
        tlima.getItems().add(new Label("1"));
        tlima.getItems().add(new Label("2"));
        tlima.getItems().add(new Label("3"));
        tlima.getItems().add(new Label("4"));
        tlima.getItems().add(new Label("5"));
        tlima.setEditable(false);
        
        // Inputan enam
        tenam.getItems().add(new Label("0"));
        tenam.getItems().add(new Label("1"));
        tenam.getItems().add(new Label("2"));
        tenam.getItems().add(new Label("3"));
        tenam.getItems().add(new Label("4"));
        tenam.getItems().add(new Label("5"));
        tenam.setEditable(false);
        
        // Inputan tujuh
        ttujuh.getItems().add(new Label("0"));
        ttujuh.getItems().add(new Label("1"));
        ttujuh.getItems().add(new Label("2"));
        ttujuh.getItems().add(new Label("3"));
        ttujuh.getItems().add(new Label("4"));
        ttujuh.getItems().add(new Label("5"));
        ttujuh.setEditable(false);
        
        // Inputan delapan
        tdelapan.getItems().add(new Label("0"));
        tdelapan.getItems().add(new Label("1"));
        tdelapan.getItems().add(new Label("2"));
        tdelapan.getItems().add(new Label("3"));
        tdelapan.getItems().add(new Label("4"));
        tdelapan.getItems().add(new Label("5"));
        tdelapan.setEditable(false);
        
        // Inputan sembilan
        tsembilan.getItems().add(new Label("0"));
        tsembilan.getItems().add(new Label("1"));
        tsembilan.getItems().add(new Label("2"));
        tsembilan.getItems().add(new Label("3"));
        tsembilan.getItems().add(new Label("4"));
        tsembilan.getItems().add(new Label("5"));
        tsembilan.setEditable(false);
        
        // Inputan sepuluh
        tsepuluh.getItems().add(new Label("0"));
        tsepuluh.getItems().add(new Label("1"));
        tsepuluh.getItems().add(new Label("2"));
        tsepuluh.getItems().add(new Label("3"));
        tsepuluh.getItems().add(new Label("4"));
        tsepuluh.getItems().add(new Label("5"));
        tsepuluh.setEditable(false);
        
        // Inputan sebelas
        tsebelas.getItems().add(new Label("0"));
        tsebelas.getItems().add(new Label("1"));
        tsebelas.getItems().add(new Label("2"));
        tsebelas.getItems().add(new Label("3"));
        tsebelas.getItems().add(new Label("4"));
        tsebelas.getItems().add(new Label("5"));
        tsebelas.setEditable(false);
        
        // Inputan duabelas
        tduabelas.getItems().add(new Label("0"));
        tduabelas.getItems().add(new Label("1"));
        tduabelas.getItems().add(new Label("2"));
        tduabelas.getItems().add(new Label("3"));
        tduabelas.getItems().add(new Label("4"));
        tduabelas.getItems().add(new Label("5"));
        tduabelas.setEditable(false);
        
        // Inputan tigabelas
        ttigabelas.getItems().add(new Label("0"));
        ttigabelas.getItems().add(new Label("1"));
        ttigabelas.getItems().add(new Label("2"));
        ttigabelas.getItems().add(new Label("3"));
        ttigabelas.getItems().add(new Label("4"));
        ttigabelas.getItems().add(new Label("5"));
        ttigabelas.setEditable(false);
        
        // Inputan empatbelas
        tempatbelas.getItems().add(new Label("0"));
        tempatbelas.getItems().add(new Label("1"));
        tempatbelas.getItems().add(new Label("2"));
        tempatbelas.getItems().add(new Label("3"));
        tempatbelas.getItems().add(new Label("4"));
        tempatbelas.getItems().add(new Label("5"));
        tempatbelas.setEditable(false);
        
        // Inputan limabelas
        tlimabelas.getItems().add(new Label("0"));
        tlimabelas.getItems().add(new Label("1"));
        tlimabelas.getItems().add(new Label("2"));
        tlimabelas.getItems().add(new Label("3"));
        tlimabelas.getItems().add(new Label("4"));
        tlimabelas.getItems().add(new Label("5"));
        tlimabelas.setEditable(false);
       
    }    
    
}

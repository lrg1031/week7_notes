/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author itlabs
 */
public class CalculatorController implements Initializable {

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private Label answer;

    @FXML
    void calcAnswer(ActionEvent event) {
        int f = Integer.parseInt(text1.getText());
        int s = Integer.parseInt(text1.getText());
        int a = f + s;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

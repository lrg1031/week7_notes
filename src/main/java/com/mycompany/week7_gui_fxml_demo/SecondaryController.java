package com.mycompany.week7_gui_fxml_demo;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private Label nameLabel;
    
    @FXML
    private Button secondaryButton;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void printMyName() throws IOException {
        nameLabel.setText("Luke Green 99999999999");
    }
}
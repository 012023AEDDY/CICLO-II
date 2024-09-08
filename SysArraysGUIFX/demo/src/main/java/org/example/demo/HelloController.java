package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public static void main(String[] args) {
        
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
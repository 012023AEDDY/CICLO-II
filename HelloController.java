package org.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField numUno;
    public TextField numDos;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        Integer resultado = Integer.parseInt(numUno.getText())+Integer.parseInt(numDos.getText());
        welcomeText.setText("resultado: "+resultado);
    }

    public void onrestaclick(ActionEvent actionEvent) {
        Integer resultado = Integer.parseInt(numUno.getText())-Integer.parseInt(numDos.getText());
        welcomeText.setText("Resultado: "+resultado);
    }
    public void onMultiplicacion(ActionEvent actionEvent) {
        Integer resultado = Integer.parseInt(numUno.getText())*Integer.parseInt(numDos.getText());
        welcomeText.setText("Resultado: "+resultado);
    }public void onDivision(ActionEvent actionEvent) {
        Integer resultado = Integer.parseInt(numUno.getText())/Integer.parseInt(numDos.getText());
        welcomeText.setText("Resultado: "+resultado);
    }
}
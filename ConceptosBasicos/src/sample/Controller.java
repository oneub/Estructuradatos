package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    TextField txtEdad;
    @FXML
    Label lblTitulo;

    public void evento1(ActionEvent event){
        int dias = Integer.parseInt(txtEdad.getText()) * 365;
        lblTitulo.setText("Has vivido" +dias+" dias");
    }

}

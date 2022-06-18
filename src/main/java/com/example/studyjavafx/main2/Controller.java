package com.example.studyjavafx.main2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.awt.*;

public class Controller {
    @FXML
    private TextField Height;
    public void Submit(ActionEvent event ){
        String height = Height.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("CHiều cao của bạn "+height+"cm");
        alert.show();
    }
}

package org.example.urmarirebuguri;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class logInController {

    @FXML
    TextField usernameTextBox;
    @FXML
    TextField passwordTextBox;
    public void logInButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("angajat.fxml"));

        AnchorPane root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Welcome back " + usernameTextBox.getText().trim() + "!");
        stage.setScene(new Scene(root));

        angajatController angajatController = loader.getController();
        angajatController.setStage(stage);
        stage.show();
    }
}

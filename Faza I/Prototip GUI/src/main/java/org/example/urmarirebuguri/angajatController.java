package org.example.urmarirebuguri;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class angajatController {
    Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;

    }

    @FXML
    TableView bugTable;

    public void vizualizareBuguriClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("filtrare.fxml"));
        AnchorPane root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));

        filtrareController angajatController = loader.getController();
        angajatController.setStage(stage);
        stage.show();
    }

    public void inregistrareBugClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("inregistrare.fxml"));
        AnchorPane root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));

        inregistrareController angajatController = loader.getController();
        angajatController.setStage(stage);
        stage.show();
    }

    public void EliminareBugClick() {

    }
}

package br.com.hoyper.apps.java.githubdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
 

public class GitHubDemo {

    @FXML
    public void onActionButtonClose(ActionEvent event) {
        final Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }
}

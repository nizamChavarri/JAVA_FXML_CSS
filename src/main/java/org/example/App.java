package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org.example/styles.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/org.example/styles.css").toExternalForm());

        stage.setTitle("FlowPane Alignment with FXML");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

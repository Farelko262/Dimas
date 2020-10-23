package sample.resource;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StatResultController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Дщз;

    @FXML
    private AnchorPane authTanya;

    @FXML
    private Button authSigInButton;

    @FXML
    private DatePicker datInform;

    @FXML
    private Button authSigInButton1;

    @FXML
    private Button loginSignUpButton;

    @FXML
    void initialize() {
        authSigInButton.setOnAction(event -> {
            authSigInButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/resource/Body.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        });
    }
}

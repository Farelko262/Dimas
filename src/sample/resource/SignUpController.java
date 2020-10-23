package sample;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.menu.MenuItemBase;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.resource.DatabaseHandler;
import sample.resource.User;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane body;

    @FXML
    private Button singUpButton;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private Button bodyExit;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private Button dataBodyButton;

    @FXML
    private TextField signUpCuntry;
    private MenuItemBase signUpButton;

    @FXML
    void initialize() {

        signUpButton.setOnAction(event -> {

            signUpNewUser();

        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String location = signUpCuntry.getText();
        String gender = "";

        if(signUpCheckBoxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName, lastName, userName, password, location, gender);


        dbHandler.signUpUser(user);
    }
}

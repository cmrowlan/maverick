package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.io.IOException;


public class HomeController {
    @FXML
    public Label lblStatus;


    public void changePassword(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "ChangePassword.fxml");
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Login.fxml");
    }
}

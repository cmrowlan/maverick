package sample;

import javafx.event.ActionEvent;


import java.io.IOException;

public class HomeController {
    public void changePassword(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "ChangePassword.fxml");
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Login.fxml");
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController {
    public Button btnLogin;
    public void login(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Home.fxml");
    }
    public void register(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Register.fxml");
    }
    public void recovery(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "ForgotPwd.fxml");
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.io.IOException;

public class RegisterController {
    public Button btnRegister;
    public Button btnCancel;
    public TextField txtName;

    private Common helper = new Common();
    public void cancel(ActionEvent actionEvent) throws IOException {
        helper.loadWindow(actionEvent, "Login.fxml");
    }

    public void register(ActionEvent actionEvent) throws IOException {
        helper.loadWindow(actionEvent, "Home.fxml");
    }
}

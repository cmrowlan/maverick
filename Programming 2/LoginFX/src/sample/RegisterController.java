package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.io.IOException;

public class RegisterController {
    public Button btnRegister;
    public Button btnCancel;
    public TextField txtName;
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtCPwd;

    private Common helper = new Common();
    public void cancel(ActionEvent actionEvent) throws IOException {
        helper.loadWindow(actionEvent, "Login.fxml");
    }

    public void register(ActionEvent actionEvent) throws IOException {
        Crud.register(txtUsername.getText(), txtName.getText(), txtEmail.getText(), txtCPwd.getText());
        helper.loadWindow(actionEvent, "Home.fxml");
    }
}

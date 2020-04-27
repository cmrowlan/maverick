package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.io.IOException;

public class RegisterController {
    @FXML
    public Button btnRegister;
    @FXML
    public Button btnCancel;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtUsername;
    @FXML
    public TextField txtEmail;
    @FXML
    public TextField txtPwd;
    @FXML
    public PasswordField txtCPwd;

    private Common helper = new Common();
    public void cancel(ActionEvent actionEvent) throws IOException {
        helper.loadWindow(actionEvent, "Login.fxml");
    }

    public void register(ActionEvent actionEvent) throws IOException {
        User user = new User();
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setUsername(txtUsername.getText());
        user.setPwd(txtCPwd.getText());
        user.setSalt(" ");

        Main.users.add(user);
        JSONFile.Save(Main.users);

        helper.loadWindow(actionEvent, "Home.fxml");
    }
}

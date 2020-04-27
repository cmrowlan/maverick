package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ForgotPwdController {
    @FXML
    public TextField txtUsername;
    @FXML
    public Label lblError;
    @FXML
    public PasswordField txtCPwd;

    public static User currentUser = null;
    Hash hash = new Hash();
    public void cancel(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Login.fxml");
    }

    public void send(ActionEvent actionEvent) throws IOException, NoSuchAlgorithmException {
        for(int x = 0; x<Main.users.size(); x++){
            if(Main.users.get(x).getUsername().equals(txtUsername.getText())){
                currentUser = Main.users.get(x);
                byte[] salt = hash.getSalt();
                String pwd = hash.getHash(txtCPwd.getText(), salt);
                Main.users.get(x).setPwd(pwd);
                String saltString = Base64.getEncoder().encodeToString(salt);
                Main.users.get(x).setSalt(saltString);
            }else{
                lblError.setText("No account found with that Username!");
            }
        }


    }
}

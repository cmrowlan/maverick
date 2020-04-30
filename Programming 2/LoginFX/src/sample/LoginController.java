package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class LoginController {

    @FXML
    public TextField txtUsername;
    @FXML
    public PasswordField txtPwd;
    @FXML
    public Label lblError;

    public void login(ActionEvent actionEvent) throws IOException, NoSuchAlgorithmException {

        for(int x = 0; x<Main.users.size(); x++){
            if(Main.users.get(x).getUsername().equals(txtUsername.getText())){
                Main.currentUser = Main.users.get(x);
                continue;
            }else{
                lblError.setText("Username or Password is incorrect!");
                return;
            }
        }
        if (Main.currentUser.getUsername() != null){
            Hash hash = new Hash();
            byte[] saltByte = Base64.getDecoder().decode(Main.currentUser.getSalt());
            String hashedPwd = hash.getHash(txtPwd.getText(), saltByte);
            if (Main.currentUser.getPwd().equals(hashedPwd)){
                Common.loadWindow(actionEvent, "Home.fxml");
            }else{
                lblError.setText("Username or Password is incorrect!");
            }
        }

    }
    public void register(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Register.fxml");
    }
    public void recovery(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "ForgotPwd.fxml");
    }
}

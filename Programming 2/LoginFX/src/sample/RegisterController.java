package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

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

    public void register(ActionEvent actionEvent) throws IOException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        Hash hash = new Hash();
        User user = new User();
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setUsername(txtUsername.getText());

        byte[] salt = hash.getSalt();
        String pwd = hash.getHash(txtCPwd.getText(), salt);
        user.setPwd(pwd);
        String saltString = Base64.getEncoder().encodeToString(salt);
        user.setSalt(saltString);


        Main.users.add(user);

        Encryption enc = new Encryption();
        for (int x = 0; x<Main.users.size(); x++){
            String encName = enc.encrypt(Main.users.get(x).getName(), "ABC123");
            Main.users.get(x).setName(encName);
            String encEmail = enc.encrypt(Main.users.get(x).getEmail(), "ABC123");
            Main.users.get(x).setEmail(encEmail);


        }

        JSONFile.Save(Main.users);

        helper.loadWindow(actionEvent, "Home.fxml");
    }
}

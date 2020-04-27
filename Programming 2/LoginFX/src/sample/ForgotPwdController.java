package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ForgotPwdController {
    @FXML
    public TextField txtEmail;
    @FXML
    public Label lblError;
    public static User currentUser = null;

    public void cancel(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Home.fxml");
    }

    public void send(ActionEvent actionEvent) throws IOException {
        for(int x = 0; x<Main.users.size(); x++){
            if(Main.users.get(x).getEmail().equals(txtEmail.getText())){
                currentUser = Main.users.get(x);
                Common.loadWindow(actionEvent, "ForgotPwdChangeController.fxml");
            }else{
                lblError.setText("No account found with Email!");
            }
        }

    }
}

package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ForgotPwdController {

    public void cancel(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Home.fxml");
    }

    public void send(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Home.fxml");
    }
}

package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ChangePasswordController {

    public void change(ActionEvent actionEvent) throws IOException {

        Common.loadWindow(actionEvent, "Home.fxml");
    }

    public void cancel(ActionEvent actionEvent) throws IOException {
        Common.loadWindow(actionEvent, "Home.fxml");
    }
}

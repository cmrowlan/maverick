package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    public Button btnRegister;
    public Button btnCancel;
    public TextField txtName;

    public void cancel(ActionEvent actionEvent) throws IOException {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Login.fxml")));
        stage.setScene(scene);
        stage.show();
    }

    public void register(ActionEvent actionEvent) throws IOException {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Home.fxml")));
        stage.setScene(scene);
        stage.show();
    }
}

package comm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class KreditController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Addingbutton;

    @FXML
    private Button Earlierbutton;

    @FXML
    private Button Exitеbutton;

    @FXML
    void initialize() {
        Exitеbutton.setOnAction(event -> {
            openNew("../fxml/hello-view.fxml",event);
        });
        Addingbutton.setOnAction(event -> {
            openNew("../fxml/anketaAddingMoney.fxml",event);
        });
       Earlierbutton.setOnAction(event -> {
            openNew("../fxml/anketaLoad.fxml",event);
        });
    }
    public void openNew(String winow , ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(winow));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root =loader.getRoot();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }


}


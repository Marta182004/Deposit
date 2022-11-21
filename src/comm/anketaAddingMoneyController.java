package comm;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class anketaAddingMoneyController {
    public static Integer SUM;

    @FXML
    private TextField AnketaSum1;

    @FXML
    private Button buttonAddMoney;

    @FXML
    private Button buttonBack;

    @FXML
    void initialize() {
        buttonBack.setOnAction(event -> {
            openNew("../fxml/infoDeposit.fxml",event);
        });
        buttonAddMoney.setOnAction(event -> {
            anketaAddingMoneyController.SUM = Integer.valueOf(AnketaSum1.getText());
            openNew("../fxml/addingMoney.fxml",event);
        });
        AnketaSum1.setOnAction(event -> {



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

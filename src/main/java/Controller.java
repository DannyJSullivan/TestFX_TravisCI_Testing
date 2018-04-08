import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button printName;

    @FXML
    private Label name;

    @FXML
    private void handleButtonAction(ActionEvent e){
        if(e.getSource() == printName){
            name.setText("Danny Sullivan");
        }
    }
}

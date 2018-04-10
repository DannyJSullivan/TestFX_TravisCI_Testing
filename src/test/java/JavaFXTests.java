import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxRobotException;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import java.util.concurrent.TimeoutException;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;


public class JavaFXTests extends ApplicationTest {
    //launch Main
    /*
    @Before
    public void setUpClass() throws Exception {
        ApplicationTest.launch(Main.class);
    }
    */

    //show screen
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Sarcastic Squonks Software Workshop");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
        primaryStage.toFront();
        primaryStage.requestFocus();
    }

    //close after test so no other tests get messed up/IntelliJ (hopefully) doesn't crash
    @After
    public void afterEachTest() throws TimeoutException {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @Test
    public void printName() throws Exception {
        //Thread.sleep(1000);
        //moveTo("#printName");
        //clickOn("#printName");
        clickOn("#printName");
        verifyThat("#name", hasText("Danny Sullivan"));
    }

}

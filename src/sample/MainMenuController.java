package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by Viktoria on 15.11.16.
 */

public class MainMenuController {

    @FXML
    private Button exitButton, startButton, aboutButton;

    @FXML
    private void startButtonClicked() {
        Main.runMainWindow();
    }

    @FXML
    private void aboutButtonClicked() {

    }

    @FXML
    private void exitButtonClicked() {
        Main.close();
    }
}

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuGameApplication extends Application {
    private IUserInterfaceControler.View uiImpl;

    public void start(Stage primaryStage throws Exception) {
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
    public static void main(String[] args){
        launch(args);
    }


 }
import java.io.IOException;

public class SudokuGra extends Application{
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
 }
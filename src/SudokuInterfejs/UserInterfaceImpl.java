package SudokuInterfejs;

import com.sun.corba.se.pept.transport.Acceptor;
import com.sun.corba.se.pept.transport.Connection;
import com.sun.corba.se.pept.transport.EventHandler;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.sun.xml.internal.bind.v2.runtime.Coordinator;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.HashMap;

public class UserInterfaceImpl implements IUserInterfaceContract.Viev,
        EventHandler<KeyEvent> {

    private final Stage stage;
    private final Gropu root;

    private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;

    private IUserInterfaceContract.EventListener listener;
    private  static final double Window_X= 668;
    private  static final double Window_Y= 732;
    private  static final double BoardPadding= 50;
    private  static final double Board_X_and_Y= 576;

    private static final Color WINDOW_BACKGROUND_COLOR=  Color.rgb(0,150, 136);
    private static final Color BOARD_BACKGROUND_COLOR=  Color.rgb(224, 242, 241);
    public static final String SUDOKU = "SUDOKU";

    public UserInterfaceImpl(Stage stage) {
        this.stage = stage;
        this.root = new Group();
        this.textFieldCoordinates = new HashMap<>();
        initializeUserInterface();
    }

    private void initializeUserInterface() {
        drawBackground(root);
        drawTitle (root);
        drawSudokuBoard(root);
        drawTextFields(root);
        drawGridLines(root);
        stage.show();
    }

    private void drawGridLines(Gropu root) {
        int xAndY =114;
        int index = 0;
        while (index < 8){
            int thickness;
            if (index == 2 || 5){
                thickness = 3;
            } else {
                thickness =2;
            }

            Rectangle verticalLine= getLine(
                    xAndY +64 * index,
                    BoardPadding,
                    Board_X_and_Y,
                    thickness

            )
        }
    }

    private Rectangle getLine(double x, double y, double height, double width) {
        Rectangle line =  new Rectangle();

        line.setX(x);
        line.setY(y);
        line.setHight(height);
        line.setWidth(width);

        line.setFill(Color.BLACK);
        return null;
    }

    private void drawTextFields(Gropu root) {
    }

    private void drawSudokuBoard(Gropu root) {
    }

    private void drawTitle(Gropu root) {
        
    }

    private void drawBackground(Gropu root) {
        
    }

    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {
        this.listener = listener;
    }

    @Override
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String message) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void setUseSelectThreadToWait(boolean b) {

    }

    @Override
    public boolean shouldUseSelectThreadToWait() {
        return false;
    }

    @Override
    public SelectableChannel getChannel() {
        return null;
    }

    @Override
    public int getInterestOps() {
        return 0;
    }

    @Override
    public void setSelectionKey(SelectionKey selectionKey) {

    }

    @Override
    public SelectionKey getSelectionKey() {
        return null;
    }

    @Override
    public void handleEvent() {

    }

    @Override
    public void setUseWorkerThreadForEvent(boolean b) {

    }

    @Override
    public boolean shouldUseWorkerThreadForEvent() {
        return false;
    }

    @Override
    public void setWork(Work work) {

    }

    @Override
    public Work getWork() {
        return null;
    }

    @Override
    public Acceptor getAcceptor() {
        return null;
    }

    @Override
    public Connection getConnection() {
        return null;
    }
}

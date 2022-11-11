package SudokuPlansza;

import java.io.IOException;

public interface Storage {
    void updateGameData(SudokuGame) throws IOException;
    SudokuGame getGameData() throws IOException;
}

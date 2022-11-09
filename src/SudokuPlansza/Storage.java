package SudokuPlansza;

import java.io.IOException;

public interface Storage {
    void uaktualnij(SudokuGame) throws IOException;
    SudokuGame getEtapGry() throws IOException;
}

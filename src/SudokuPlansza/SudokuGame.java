package SudokuPlansza;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int [][] gridState;

    public static final int GRID_BOUNDRY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}

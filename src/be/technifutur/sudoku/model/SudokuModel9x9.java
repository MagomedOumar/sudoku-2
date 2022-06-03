package be.technifutur.sudoku.model;

public class SudokuModel9x9 {
    public static final int EMPTY_VALUE = 0;
    private char[][] grille = new char[9][9];

    public int getLineSize() {
        return 9;
    }


    public int getColumnSize() {
        return 9;
    }


    public boolean isEmpty(int line, int column) {

        return grille[line][column] == EMPTY_VALUE;
    }

    public void setValue(int line, int column, char val) {
        grille[line][column] = val;

    }

    public char getValue(int line, int column) {
        return grille[line][column];
    }

}

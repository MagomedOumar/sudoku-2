package be.technifutur.sudoku.model;

public class SudokuModel4x4 {

    public static final short EMPTY_VALUE = 0;
    private char [][] grille = new char[4][4];
    public SudokuModel4x4() {

    }

    public int getLineSize() {
        return 4;
    }

    public int getColumnSize() {
        return 4;
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

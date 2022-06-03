package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel4x4;

public class SudokuVue4x4 {
    public String getGrilleVide() {
        return """
                +------+-----+
                | . .  | . . |
                | . .  | . . |
                +------+-----+
                | . .  | . . |
                | . .  | . . |
                +------+-----+
                """;
    }

    public String getGrille(SudokuModel4x4 sudo) {
        String format = getGrilleVide().replace(".", "%s");
        Character[] tab = new Character[16];


        int pos = 0;

        for (int line = 0; line < sudo.getLineSize(); line++) {
            for (int column = 0; column < sudo.getColumnSize(); column++) {
                if ((sudo.isEmpty(line, column)) == true) {
                    tab[pos] = '.';

                } else {
                    tab[pos] = sudo.getValue(line, column);
                }
                pos++;

            }
        }


        return String.format(format, (Object[]) tab);

    }
}




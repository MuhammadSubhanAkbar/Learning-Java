public class MatricsMaker { // Fixed spelling

    int rows;
    int col;
    char character;

    MatricsMaker(int rows, int col, char character) {
        this.rows = rows;
        this.col = col;
        this.character = character;
    }

    void makeMatrix() { // Fixed spelling and followed Java naming convention
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < col; b++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
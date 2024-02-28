package org.game;

public class Board {
    char[][] matrix;
    /**
     * n – кількість зроблених ходів
     */
    int n;
    public Board(){
        this.n = 0;
        this.matrix = new char[3][3];       // {null, null, null}
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = '*';
            }
        }
        /*
        {
        { '*', '*', '*'},
        { '*', '*', '*'},
        { '*', '*', '*'}
        }
         */
    }
    public boolean isEmpty(int row, int col) {
        return matrix[row][col] == '*';
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || matrix[row][col] != '*') {
            return false; // Invalid move
        }
        matrix[row][col] = symbol;
        n++;
        return true;
    }

    /**
     * Check is symbol is in the win state on the board
     */
    public boolean isWin(char symbol) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == symbol && matrix[i][1] == symbol && matrix[i][2] == symbol) {
                return true; // Row win
            }
            if (matrix[0][i] == symbol && matrix[1][i] == symbol && matrix[2][i] == symbol) {
                return true; // Column win
            }
        }
        if (matrix[0][0] == symbol && matrix[1][1] == symbol && matrix[2][2] == symbol) {
            return true; // Main diagonal win
        }
        if (matrix[0][2] == symbol && matrix[1][1] == symbol && matrix[2][0] == symbol) {
            return true; // Anti-diagonal win
        }
        return false;
    }

    public boolean isDraw() {
        return n == 9;
        /*
        // Check if the board is full and no winner
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == '*') {
                    return false; // Board is not full
                }
            }
        }
        return true; // Board is full
         */
    }

    public void clear() {
        // Clear the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = '*';
            }
        }
        n = 9;
    }


    @Override
    public String toString() {
        // TODO: Зробити текст для гарного відображення дошки
        /*
        {
        { '*', '*', 'X'},
        { 'X', 'O', '*'},
        { 'X', '*', 'O'}
        }
        | * | * | * |
        | X | * | * |
        | * | * | * |

         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(" | ");
                sb.append(matrix[i][j]);
            }
            sb.append(" | ");
            sb.append("\n");
            if (i > 2)
                sb.append("\n");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}

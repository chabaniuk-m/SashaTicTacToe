package org.game;

public class Board {
    char[][] matrix;
    int n;
    public Board(){
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
        return sb.toString().trim();
    }
}

package org.game.player;

import org.game.Board;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        super('0');
    }

    @Override
    public void choosePosition(Board board) {
        // TODO: (computer) choosePosition(board)
        Random random = new Random();
        int computerRow, computerCol;
        boolean moveMade = false;
        do {
            computerRow = random.nextInt(3);
            computerCol = random.nextInt(3);
            if (board.isEmpty(computerRow, computerCol)) {
                board.makeMove(computerRow, computerCol, getMark());
                moveMade = true;
            }
        } while (!moveMade);
    }

    @Override
    public String winMessage() {
        return "Computer wins!";
    }
}

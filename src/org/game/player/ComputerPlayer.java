package org.game.player;

import org.game.Board;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        super('X');
    }

    @Override
    public void choosePosition(Board board) {
        // TODO: (computer) choosePosition(board)
    }

    @Override
    public String winMessage() {
        return "Computer wins!";
    }
}

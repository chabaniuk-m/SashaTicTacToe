package org.game.player;

import org.game.Board;

public class UserPlayer extends Player {
    String name;

    public UserPlayer() {
        super('O');
    }

    @Override
    public void choosePosition(Board board) {
        // TODO: (user) choosePosition(board)
    }

    @Override
    public String winMessage() {
        return "User wins!";
    }
}

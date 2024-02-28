package org.game.player;

import org.game.Board;

public abstract class Player {
    private final char mark;
    /*
    comment
     */

    public Player(char mark) {
        this.mark = mark;
    }

    abstract public void choosePosition(Board board);

    public char getMark() {
        return mark;
    }


    abstract public String  winMessage();
}

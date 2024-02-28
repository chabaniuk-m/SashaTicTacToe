package org.game.player;

import org.game.Board;

import java.util.Scanner;

public class UserPlayer extends Player {
    String name;

    public UserPlayer() {
        super('X');
    }

    @Override
    public void choosePosition(Board board) {
        // TODO: (user) choosePosition(board)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row and column for your position");
        int userRow = scanner.nextInt() - 1;
        int userCol = scanner.nextInt() - 1;

        if (!board.makeMove(userRow,userCol, getMark())){
            System.out.println("Invalid move");
            choosePosition(board);
        }

    }

    @Override
    public String winMessage() {
        return "User wins!";
    }
}

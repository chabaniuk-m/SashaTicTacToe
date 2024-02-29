package org.game;

import org.game.player.ComputerPlayer;
import org.game.player.Player;
import org.game.player.UserPlayer;

import java.util.Scanner;

public class Game {
    private final Board board;
    private final Player player;
    private final Player computer;

    public Game() {
        board = new Board();
        player = new UserPlayer();
        computer = new ComputerPlayer();
    }

    public void play() {
        try (Scanner scanner = new Scanner(System.in)) {
            Player currentPlayer = player; // Start with the player
            while (true) {
                System.out.println(board);
                currentPlayer.choosePosition(board);
                if (board.isWin(currentPlayer.getMark())) {
                    System.out.println(currentPlayer.winMessage());
                    System.out.println("Finished grid:");
                    System.out.println(board); // Display the finished grid
                    return;
                }
                if (board.isDraw()) {
                    System.out.println("Draw \\_•-•_/");
                    System.out.println("Finished grid:");
                    System.out.println(board); // Display the finished grid
                    return;
                }
                // Change player
                currentPlayer = (currentPlayer == player) ? computer : player;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

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
            Player currentPlayer = computer;
            while (board.isDraw()) {
                System.out.println(board);
                currentPlayer.choosePosition(board);
                if (board.isWin(currentPlayer.getMark())) {
                    System.out.println(currentPlayer.winMessage());
                    return;
                }
                // change player
                currentPlayer = (currentPlayer == computer) ? player : computer;
            }
            System.out.println("Draw \\_•-•_/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package com.company;


public class TicTacToeGame {
    public static void creatingboard() {
        creatingboard();

        char[] board = new char[10]; //0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 1; i < board.length; i++)
            board[i] = ' ';
    }

    public static void main(String[] args) {
        System.out.println("Welcome");

    }
}

package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
	String [][] board = new String[10][10];
    for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++) {
            int coinLocationi =  rand.nextInt(10);
            int coinLocationj = rand.nextInt(10);
            if (i == coinLocationi && j == coinLocationj){
                board[i][j] = "[x]";
                System.out.print(board[i][j]);
            }
            else {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
        }
        System.out.println("");
    }
    }
}

package com.kodilla.scissors_paper_rock;

import java.util.Random;
import java.util.Scanner;

interface Game {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    default void getResult(int inputFromPlayer, int inputFromComputer, int[][] resultsTable) {
        int result = resultsTable[inputFromPlayer - 1][inputFromComputer - 1];
        switch (result) {
            case 1:
                System.out.println("You Win !!!");
                break;
            case -1:
                System.out.println("You Lost !!!");
                break;
            case 0:
                System.out.println("Dead-heat !!!");
                break;
        }
        System.out.println();
    }

    void gameMenu();

    int inputFromPlayer();

    int inputFromComputer();

    int[][] getResultsTable();
}

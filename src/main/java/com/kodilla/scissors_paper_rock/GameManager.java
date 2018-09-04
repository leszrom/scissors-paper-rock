package com.kodilla.scissors_paper_rock;

import java.util.Scanner;

class GameManager {

    private static void mainMenu() {
        System.out.println("Main Menu: ");
        System.out.println("[s] - Standar");
        System.out.println("[e] - Extended");
        System.out.println("[x] - Exit game");
    }

    private void gameProcess(Game game) {

        int playerChoice;
        for (; ; ) {
            game.gameMenu();
            playerChoice = game.inputFromPlayer();
            if (playerChoice == 0) {
                return;
            }
            game.getResult(playerChoice, game.inputFromComputer(), game.getResultsTable());
        }
    }

    void runGame() {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            mainMenu();
            System.out.print("Take a choice: ");
            String choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "s":
                    System.out.println("Standar mode...");
                    gameProcess(new BasicGame());
                    break;
                case "e":
                    System.out.println("Extended mode...");
                    gameProcess(new ExtendedGame());
                    break;
                case "x":
                    System.out.println("See You later...");
                    return;
                default:
                    System.out.println("Wrong choice !!! Please, try again...");
            }
        }
    }
}

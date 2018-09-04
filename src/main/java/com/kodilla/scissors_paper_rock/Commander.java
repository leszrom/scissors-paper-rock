package com.kodilla.scissors_paper_rock;

import java.util.Scanner;

class Commander {

    static void mainMenu() {
        System.out.println("Main Menu: ");
        System.out.println("[s] - Standar");
        System.out.println("[e] - Extended");
        System.out.println("[x] - Exit game");
    }

    void command(Game game) {
        int playerChoice;
        boolean loopCond;
        do {
            game.gameMenu();
            playerChoice = game.inputFromPlayer();
            loopCond = game.getResult(playerChoice, game.inputFromComputer(), game.getResultsTable());
        } while (loopCond);
    }

    void gameProcess() {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.print("Take a choice: ");
            String choice = scanner.nextLine();
            System.out.println();

            switch(choice) {
                case "s":
                    System.out.println("Standar mode...");
                    command(new BasicGame());
                    break;
                case "e":
                    System.out.println("Extended mode...");
                    command(new ExtendedGame());
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

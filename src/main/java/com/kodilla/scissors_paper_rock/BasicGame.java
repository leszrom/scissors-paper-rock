package com.kodilla.scissors_paper_rock;

public class BasicGame implements Game {
    private static int[][] resultsTable = {{0, 1, -1}, //s
            {-1, 0, 1}, //p
            {1, -1, 0}, //r
            {-1, 1, -1}, //l
            {1, -1, 1}};//c

    @Override
    public int[][] getResultsTable() {
        return resultsTable;
    }

    @Override
    public void gameMenu() {
        System.out.println("Menu: ");
        System.out.println("[s] - Scissors");
        System.out.println("[p] - Paper");
        System.out.println("[r] - Rock");
        System.out.println("[x] - Exit standard mode");
    }

    @Override
    public int inputFromPlayer() {

        for (; ; ) {
            System.out.print("Take a choice: ");
            String choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "s":
                    System.out.println("Player 1: Scissors");
                    return 1;
                case "p":
                    System.out.println("Player 1: Paper");
                    return 2;
                case "r":
                    System.out.println("Player 1: Rock");
                    return 3;
                case "x":
                    return 0;
                default:
                    System.out.println("Wrong choice !!! Please, try again...");
            }
        }
    }

    @Override
    public int inputFromComputer() {

        int randomIntChoice = rand.nextInt(3) + 1;
        switch (randomIntChoice) {
            case 1:
                System.out.println("Player 2: Scissors");
                break;
            case 2:
                System.out.println("Player 2: Paper");
                break;
            case 3:
                System.out.println("Player 2: Rock");
                break;
            default:
                System.out.println("Error !!!");
        }
        return randomIntChoice;
    }
}


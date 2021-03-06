package com.kodilla.scissors_paper_rock;

class ExtendedGame implements Game {
    private final static int[][] resultsTable = {{0, 1, -1, 1, -1}, //s
            {-1, 0, 1, -1, 1}, //p
            {1, -1, 0, 1, -1}, //r
            {-1, 1, -1, 0, 1}, //l
            {1, -1, 1, -1, 0}};//c

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
        System.out.println("[l] - Lizard");
        System.out.println("[c] - Spock");
        System.out.println("[x] - Exit extended mode");
    }

    @Override
    public int inputFromPlayer() {

        for (; ; ) {
            switch(takeAChoice()) {
                case "s":
                    System.out.println("Player 1: Scissors");
                    return 1;
                case "p":
                    System.out.println("Player 1: Paper");
                    return 2;
                case "r":
                    System.out.println("Player 1: Rock");
                    return 3;
                case "l":
                    System.out.println("Player 1: Lizard");
                    return 4;
                case "c":
                    System.out.println("Player 1: Spock");
                    return 5;
                case "x":
                    return 0;
                default:
                    System.out.println("Wrong choice !!! Please, try again...");
            }
        }
    }

    @Override
    public int inputFromComputer() {

        int randomIntChoice = rand.nextInt(5) + 1;
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
            case 4:
                System.out.println("Player 2: Lizard");
                break;
            case 5:
                System.out.println("Player 2: Spock");
                break;
            default:
                System.out.println("Error !!!");
        }
        return randomIntChoice;
    }
}


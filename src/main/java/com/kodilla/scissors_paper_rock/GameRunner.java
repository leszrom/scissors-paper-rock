package com.kodilla.scissors_paper_rock;

public class GameRunner {

    void runGame() {
        GameProcessor gameProcessor = new GameProcessor();

        for (; ; ) {
            gameProcessor.printMainMenu();
            switch (gameProcessor.getGame().takeAChoice()) {
                case "s":
                    System.out.println("Standard mode...");
                    gameProcessor.setGame(new BasicGame());
                    break;
                case "e":
                    System.out.println("Extended mode...");
                    gameProcessor.setGame(new ExtendedGame());
                    break;
                case "x":
                    System.out.println("See You later...");
                    return;
                default:
                    System.out.println("Wrong choice !!! Please, try again...");
            }
            gameProcessor.runProcess();
        }
    }
}

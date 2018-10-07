package com.kodilla.scissors_paper_rock;

class GameProcessor {

    private Game game = new BasicGame();

    public void runProcess() {

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
    public void printMainMenu() {
        System.out.println("Main Menu: ");
        System.out.println("[s] - Standar");
        System.out.println("[e] - Extended");
        System.out.println("[x] - Exit game");
    }

    public Game getGame() {
        return game;
    }

    public void setGame(final Game game) {
        this.game = game;
    }
}

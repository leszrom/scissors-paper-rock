package com.kodilla.scissors_paper_rock;

public class ScissorsPaperRockApplication {

    public static void main(String[] args) {
        Commander commander = new Commander();

        //Game gameMode;
        Commander.mainMenu();
        commander.gameProcess();
//        gameMode = commander.getGameMode();
//        commander.command(gameMode);

    }
}

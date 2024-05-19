package com.example.demo;

public class GameRunner {
//    private MarioGame game;
    private GamingConsole game;

    public GameRunner( GamingConsole game) {
        this.game = game;

    }

    public void run() {
        System.out.println("game is running" + " :  " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

package com.example.demo;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PackManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}

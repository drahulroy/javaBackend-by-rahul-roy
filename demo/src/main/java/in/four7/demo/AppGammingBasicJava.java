package in.four7.demo;

import in.four7.demo.game.GameRunner;
import in.four7.demo.game.MarioGame;
import in.four7.demo.game.SuperContraGame;

//public class AppGammingBasicJava {
//    public static void main(String[] args) {
//        var marioGame = new MarioGame();
//        var gameRunner = new GameRunner( marioGame);
//        gameRunner.run();
//    }

    public class AppGammingBasicJava {
        public static void main(String[] args) {
            var superContraGame = new SuperContraGame();    //1. object creation
            var gameRunner = new GameRunner(superContraGame); //2. object creation + wring of dependency + superContraGame is a dependancy of game runner calss + is injectige in the game runner

            gameRunner.run();
        }
}

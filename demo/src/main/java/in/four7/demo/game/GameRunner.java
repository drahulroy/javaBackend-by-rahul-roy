package in.four7.demo.game;

public class GameRunner {
//    MarioGame game;
    SuperContraGame game;

//    public GameRunner(MarioGame game) {
//        this.game = game;
    }
    public GameRunner(SuperContraGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("madarchod java is running: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

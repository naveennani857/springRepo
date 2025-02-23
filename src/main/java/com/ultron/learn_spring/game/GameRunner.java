package com.ultron.learn_spring.game;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Game is running"+game);

        game.up();
        game.down();
        game.left();
        game.right();
    }
}

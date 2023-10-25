package com.balbasio.XMLComfiguration.xml;

public class GameRunner {

    IGameConsole game;
    public GameRunner(IGameConsole game){
        this.game=game;
    }



    public void run() {
        System.out.println("Oyun calisiyor."+game.getClass().getName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

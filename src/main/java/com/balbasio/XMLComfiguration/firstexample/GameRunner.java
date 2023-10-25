package com.balbasio.XMLComfiguration.firstexample;

public class GameRunner {
    MarioGame marioGame;
    Pacman pacman;
    public GameRunner(){
        this.marioGame=new MarioGame();
        this.pacman=new Pacman();
    }
    public void run() {
        System.out.println("Oyun calisiyor."+marioGame.getClass().getName());
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}

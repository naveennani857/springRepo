package com.ultron.learn_spring.game;

public class MarioGame implements GameConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Get into the hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Go forward");
    }

}

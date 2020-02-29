package com.company;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("emre",80,"sword");
        player.loseHealth(20);
        System.out.println(player.getHealth());
    }
}

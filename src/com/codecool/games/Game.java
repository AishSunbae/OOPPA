package com.codecool.games;

public class Game {
    private GameType type;
    private int time;
    private GameComplexity complexity;
    private int min;
    private int max;
    private boolean isAvailable;

    public Game(GameType type, int time, GameComplexity complexity, int min, int max, boolean isAvailable) {}

    public GameType getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean start(int playerNumber) {
        return false;
    }
}

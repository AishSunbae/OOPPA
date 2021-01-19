package com.codecool;

import com.codecool.games.Game;
import com.codecool.games.GameType;

import java.util.HashSet;

public class Pub {
    private HashSet<Game> games = new HashSet<Game>();

    private boolean isThereAStoryTellingGame() {
        for (Game game : games) {
            if (!game.isAvailable() && game.getType() == GameType.STORYTELLING) {
                return true;
            }
        }
        return false;
    }

    private void addGame(Game game){
        games.add(game);
    }

    private boolean startGame(Game game, int playerNumber) {
        return game.start(playerNumber);
    }
}

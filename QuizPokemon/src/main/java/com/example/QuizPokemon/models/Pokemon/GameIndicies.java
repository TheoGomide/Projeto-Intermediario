package com.example.QuizPokemon.models.Pokemon;

public class GameIndicies {
    private String game_index;
    private Version version;

    public GameIndicies(String game_index, Version version) {
        this.game_index = game_index;
        this.version = version;
    }

    public String getGameIndex() {
        return game_index;
    }

    public void setGameIndex(String game_index) {
        this.game_index = game_index;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}

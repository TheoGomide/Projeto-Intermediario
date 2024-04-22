package com.example.QuizPokemon.models.Pokemon;

public class VersionDetails {
    private int rarity;
    private Version version;

    public VersionDetails(int rarity, Version version) {
        this.rarity = rarity;
        this.version = version;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}

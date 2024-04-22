package com.example.QuizPokemon.models.Pokemon;

public class HeldItens {
    private Item item;
    private VersionDetails version_details;

    public HeldItens(Item item, VersionDetails version_details) {
        this.item = item;
        this.version_details = version_details;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public VersionDetails getVersionDetails() {
        return version_details;
    }

    public void setVersionDetails(VersionDetails version_details) {
        this.version_details = version_details;
    }
}

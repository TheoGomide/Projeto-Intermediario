package com.example.QuizPokemon.models.Pokemon;

public class Pokemon {
    private Abilities abilities[];
    private int base_experience;
    private Cries cries; 
    private Forms forms[]; 
    private GameIndicies game_indices[]; 
    private int height; 
    private HeldItens held_items[]; 
    private int id;
    private Boolean is_default;
    private String location_area_encounters;
    private String name;
    

    public Pokemon(Abilities[] abilities, int base_experience, Cries cries, Forms[] forms,
                   GameIndicies[] game_indices, int height, HeldItens[] held_items,
                   int id, Boolean is_default, String location_area_encounters, String name) {
        this.abilities = abilities;
        this.base_experience = base_experience;
        this.cries = cries;
        this.forms = forms;
        this.game_indices = game_indices;
        this.height = height;
        this.held_items = held_items;
        this.id = id;
        this.is_default = is_default;
        this.location_area_encounters = location_area_encounters;
        this.name = name;
    }

    public Abilities[] getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities[] abilities) {
        this.abilities = abilities;
    }

    public int getBaseExperience() {
        return base_experience;
    }

    public void setBaseExperience(int base_experience) {
        this.base_experience = base_experience;
    }

    public Cries getCries() {
        return cries;
    }

    public void setCries(Cries cries) {
        this.cries = cries;
    }

    public Forms[] getForms() {
        return forms;
    }

    public void setForms(Forms[] forms) {
        this.forms = forms;
    }

    public GameIndicies[] getGameIndices() {
        return game_indices;
    }

    public void setGameIndices(GameIndicies[] game_indices) {
        this.game_indices = game_indices;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public HeldItens[] getHeldItems() {
        return held_items;
    }

    public void setHeldItems(HeldItens[] held_items) {
        this.held_items = held_items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return is_default;
    }

    public void setIsDefault(Boolean is_default) {
        this.is_default = is_default;
    }

    public String getLocationAreaEncounters() {
        return location_area_encounters;
    }

    public void setLocationAreaEncounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.QuizPokemon.models.Pokemon;

public class Abilities {
    private Ability ability;
    private Boolean is_hidden;
    private int slot;
    

    public Abilities(Ability ability, Boolean is_hidden, int slot) {
        this.ability = ability;
        this.is_hidden = is_hidden;
        this.slot = slot;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Boolean getIsHidden() {
        return is_hidden;
    }

    public void setIsHidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}

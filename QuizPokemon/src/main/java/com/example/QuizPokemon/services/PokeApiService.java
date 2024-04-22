package com.example.QuizPokemon.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.example.QuizPokemon.models.Pokemon.Pokemon;


@Service
public class PokeApiService implements PokeService {
    private RestClient client = RestClient.create("https://pokeapi.co/api/v2");

    @Override
    public Pokemon getPokemon(String pokemon) {
        return client
                .get()
                .uri("/pokemon/{pokemon}", pokemon)
                .retrieve()
                .body(Pokemon.class);
    }
}

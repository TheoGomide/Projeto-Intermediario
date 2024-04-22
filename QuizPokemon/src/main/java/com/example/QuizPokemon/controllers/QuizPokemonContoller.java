package com.example.QuizPokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.QuizPokemon.models.Ajuda;
import com.example.QuizPokemon.models.Pergunta;
import com.example.QuizPokemon.models.Resposta;
import com.example.QuizPokemon.models.Pokemon.Pokemon;
import com.example.QuizPokemon.services.PokeService;

@RestController
public class QuizPokemonContoller {
    @Autowired
    private PokeService pokeService;

    @GetMapping("/ajuda")
    public ResponseEntity<Object> ajuda(){
        Ajuda ajuda = new Ajuda();

        return ResponseEntity.status(200).body(ajuda);
    }

    @GetMapping("/pergunta/1")
    public ResponseEntity<Object> pergunta_1(){
        Pergunta pergunta = new Pergunta("Qual pokemon ocupa a posição 151 da pokedex?");

        return ResponseEntity.status(200).body(pergunta);
    }

    @PostMapping("/resposta/1")
    public ResponseEntity<Object> resposta_1(@RequestBody Resposta resposta){
        Pokemon pokemon = pokeService.getPokemon(resposta.getResposta());
        
        if (pokemon.getName() == "mew") {
            return ResponseEntity.status(200).body("Correto!");
        } else {
            return ResponseEntity.status(200).body("Errado!");
        }
    }
}
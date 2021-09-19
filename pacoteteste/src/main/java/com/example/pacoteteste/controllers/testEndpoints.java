package com.example.pacoteteste.controllers;


import com.example.pacoteteste.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testEndpoints {

    @GetMapping("/{nome}/{sobrenome}")
    public String nomePessoa(@PathVariable String nome, @PathVariable String sobrenome){
        return "Meu nome é" + " " + nome + "  " + sobrenome;
    }

    @GetMapping("/nome")
    public String nomePessoa1(@RequestParam String nome, @RequestParam String sobrenome){
        return nome + " " + sobrenome;

    }
    @GetMapping("/inicial")
    public Integer testeNumero(@RequestParam Integer numero){
        return  numero;
    }

    @GetMapping("/pessoa")
    public Pessoa retornaPessoa(@RequestParam String nome,@RequestParam String sobrenome,@RequestParam Integer
            idade){
        Pessoa pessoa = new Pessoa(nome,sobrenome,idade);
        return pessoa;
    }




}

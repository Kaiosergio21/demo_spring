package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return repository.findAll();
    }

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }
}

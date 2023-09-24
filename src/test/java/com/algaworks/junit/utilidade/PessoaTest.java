package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada(){
        Pessoa pessoa = new Pessoa("Constantino","Barreto");
        assertAll("Assercoes de pessoa", ()-> assertEquals("Constantino",pessoa.getNome()),
                ()-> assertEquals("Barreto",pessoa.getSobrenome()));
    }
}
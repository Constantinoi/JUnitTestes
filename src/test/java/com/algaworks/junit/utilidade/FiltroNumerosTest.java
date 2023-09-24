package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltroNumerosTest {
    @Test
    public void deveRetornarNumeroPares(){
       List<Integer> numeros = Arrays.asList(1,2,3,4);
       List<Integer> numerosParesEsperados = Arrays.asList(4,2);
       List<Integer> resultadoFiltro = FiltroNumeros.numerosPares(numeros);
        Assertions.assertIterableEquals(numerosParesEsperados,resultadoFiltro);
        //utiliza o metodo equal da classe , e tambem ele verifica a ordem
    }



}
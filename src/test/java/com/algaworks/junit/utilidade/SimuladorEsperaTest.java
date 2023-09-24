package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SimuladorEsperaTest {

    @Test
    public void deveEsperarENaoDarTimeout(){
       // Assertions.assertTimeout(Duration.ofSeconds(1),()->SimuladorEspera.esperar(Duration.ofSeconds(10)));
       //ele espera ate o final do teste para verificar a quantidade de tempo esta demorando;
        Assertions.assertTimeoutPreemptively (Duration.ofSeconds(1),()->SimuladorEspera.esperar(Duration.ofSeconds(10)));
        //apos 1 segundo como foi definido ele ja finaliza o teste
    }
}
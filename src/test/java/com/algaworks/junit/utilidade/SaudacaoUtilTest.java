package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar(){
        String saudacao = SaudacaoUtil.saudar(9);
        assertEquals("Bom d12ia",saudacao,"Saudação incorreto");
    }

    @Test
    public void deveLancaException(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,()->SaudacaoUtil.saudar(-1));
        assertEquals("Hora inválida",illegalArgumentException.getMessage());
    }

}
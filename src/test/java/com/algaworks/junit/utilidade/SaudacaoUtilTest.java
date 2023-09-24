package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudarComBomDia(){
        String saudacao = SaudacaoUtil.saudar(9);
        assertEquals("Bom dia",saudacao,"Saudação incorreto");
    }

    @Test
    public void saudarComBoaTarde(){
        String saudacao = SaudacaoUtil.saudar(15);
        assertEquals("Boa tarde",saudacao,"Saudação incorreto");
    }

    @Test
    public void saudarComBoaNoite(){
        String saudacao = SaudacaoUtil.saudar(22);
        assertEquals("Boa noite",saudacao,"Saudação incorreto");
    }

    @Test
    public void saudarComBoaNoiteas4h(){
        String saudacao = SaudacaoUtil.saudar(4);
        assertEquals("Boa noite",saudacao,"Saudação incorreto");
    }

    @Test
    public void deveLancaException(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,()->SaudacaoUtil.saudar(-1));
        assertEquals("Hora inválida",illegalArgumentException.getMessage());
    }

    @Test
    public void naoDeveLancaException(){
      assertDoesNotThrow(()->SaudacaoUtil.saudar(0));
    }

}
package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudarComBomDia(){
        //Arange
        int horaValida = 9;

        //Act
        String saudacao = saudar(horaValida);

        //Assert
        assertEquals("Bom dia",saudacao,"Saudação incorreto");

    }

    @Test
    public void saudarComBoaTarde(){
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde",saudacao,"Saudação incorreto");
    }

    @Test
    public void saudarComBoaNoite(){
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite",saudacao,"Saudação incorreto");
    }

    @Test
    public void saudarComBoaNoiteas4h(){
        int horaValida = 4;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite",saudacao,"Saudação incorreto");
    }

    @Test
    public void deveLancaException(){
        int horaInvalida = -10;

        Executable chamadaDeMetodoInvalida = ()-> saudar(horaInvalida);

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,chamadaDeMetodoInvalida);

        assertEquals("Hora inválida",illegalArgumentException.getMessage());
    }

    @Test
    public void naoDeveLancaException(){
        int horaInvalida = 0;

        Executable chamadaDeMetodoInvalida = ()-> saudar(horaInvalida);

        assertDoesNotThrow(chamadaDeMetodoInvalida);
    }

}
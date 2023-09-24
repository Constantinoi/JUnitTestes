package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes Utilitarios Saudação")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SaudacaoUtilTest {

    @Test
    @DisplayName("Deve saudar com bom dia")
    public void saudarComBomDia(){
        //Arange
        int horaValida = 9;

        //Act
        String saudacao = saudar(horaValida);

        //Assert
        assertEquals("Bom dia",saudacao,"Saudação incorreto");

    }

    @Test
    @DisplayName("Deve saudar com boa tarde")
    public void saudarComBoaTarde(){
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde",saudacao,"Saudação incorreto");
    }

    @Test
    @DisplayName("Deve saudar com boa noite")
    public void saudarComBoaNoite(){
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite",saudacao,"Saudação incorreto");
    }

    @Test
    @DisplayName("Deve saudar com boa noite as 5hrs")
    public void Dado_um_horario_noturno_Quando_saudar_Entao_deve_retornar_boa_tarde(){
        int horaValida = 4;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite",saudacao,"Saudação incorreto");
    }

    @Test
    public void Dado_uma_hora_invalida_Quando_saudar_Entao_deve_lancar_exception(){
        int horaInvalida = -10;

        Executable chamadaDeMetodoInvalida = ()-> saudar(horaInvalida);

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,chamadaDeMetodoInvalida);

        assertEquals("Hora inválida",illegalArgumentException.getMessage());
    }

    @Test
    public void  Dado_uma_hora_valida_Quando_saudar_Entao_nao_deve_lancar_exception(){
        int horaInvalida = 0;

        Executable chamadaDeMetodoInvalida = ()-> saudar(horaInvalida);

        assertDoesNotThrow(chamadaDeMetodoInvalida);
    }

}
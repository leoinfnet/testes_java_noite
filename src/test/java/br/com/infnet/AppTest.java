package br.com.infnet;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest{
    @BeforeAll
    static void inicializarTabelasParaTeste(){
        System.out.println("Rodando antes de TODOS");
        //CREATE TABLE
    }
    @BeforeEach
    public void inicializar(){
        //INSERT ALUNO1, ALUNO2
        System.out.println("Rodando antes de CADA UM");
    }
    @AfterEach
    public void finalizar(){
        //TRUNCATE TABLE
        System.out.println("Rodando ao final de CADA UM");

    }
    @AfterAll
    static void limparTabelas(){
        //DROP TABLE
        System.out.println("Rodando ao final de Todos");
    }
    @Test
    @DisplayName("Deve testar a soma de dois inteiros")
    public void test1(){
        System.out.println("test1");
        int soma = 2 + 2; //soma(2,2)
        assertEquals(4,soma);
        soma = 0 - 1; //soma(0,-1)
        assertEquals(-1, soma);
        soma = 0 + 0; // resultado errado soma(0,0) => 0
        assertEquals(0,soma);
    }
    @Test
    @DisplayName("Deve testar o produto de dois inteiros")
    public void test2(){
        System.out.println("test2");
        int produto = 0; //multiply(0, 1)
        assertEquals(0, produto);
        produto = 2 * 2 ; //multiply(2,2)
        assertEquals(4, produto);
        produto = -1 * 2 ; //multiply(-1,2)
        assertEquals(-2, produto);
    }
    @Test
    @DisplayName("Deve calcular a divisao dos fatores")
    @Disabled("Não foi implementado ainda")
    public void test3(){

    }
}

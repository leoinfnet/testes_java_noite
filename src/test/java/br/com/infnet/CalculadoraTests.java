package br.com.infnet;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraTests.class);
    @BeforeAll
    static void inicializarTabelasParaTeste(){
        LOGGER.info("ROdando antes de TODOS");
        //System.out.println("METODO - Rodando antes de TODOS");
        //CREATE TABLE
    }
    @BeforeEach
    public void inicializar(){
        //INSERT ALUNO1, ALUNO2
        LOGGER.info("Rodando antes de CADA UM");
    }
    @AfterEach
    public void finalizar(){
        //TRUNCATE TABLE
        LOGGER.info("Rodando ao final de CADA UM");

    }
    @AfterAll
    static void limparTabelas(){
        //DROP TABLE
        LOGGER.info("Rodando ao final de Todos");
    }
    @Test
    @DisplayName("Deve testar a soma de dois inteiros")
    public void test1(){
        LOGGER.info("Iniciando test1");
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(2,2); //soma(2,2)
        LOGGER.debug("Valor da Soma: " + soma);
        assertEquals(4,soma);
        soma = calculadora.soma(0,-1); //soma(0,-1)
        assertEquals(-1, soma);
        soma =calculadora.soma(0,0); // resultado errado soma(0,0) => 0
        assertEquals(0,soma);
    }
    @Test
    @DisplayName("Deve testar o produto de dois inteiros")
    public void test2(){
        System.out.println("test2");
        Calculadora calculadora = new Calculadora();
        int produto = calculadora.produto(0,1); //multiply(0, 1)
        assertEquals(0, produto);
        produto =calculadora.produto(2,2); ; //multiply(2,2)
        assertEquals(4, produto);
        produto = calculadora.produto(-1,2); ; //multiply(-1,2)
        assertEquals(-2, produto);
    }
    @Test
    @DisplayName("Deve calcular a divisao dos fatores")
    public void test3(){
        Calculadora calculadora = new Calculadora();
        assertEquals(1,calculadora.divisao(2, 2));
        assertEquals(4,calculadora.divisao(4, 1));

        assertThrows(ArithmeticException.class, ()->{
            assertEquals(1, calculadora.divisao(2,0));
        });



    }
    @Test
    @DisplayName("Deve testar se o numero é par")
    public void test4(){
        Calculadora calculadora = new Calculadora();
        boolean ehPar = calculadora.isOdd(2);
        boolean naoEhPar = calculadora.isOdd(3);
        boolean surpresa = calculadora.isOdd(0);
        boolean surpresa1 = calculadora.isOdd(-1);
        boolean surpresa2 = calculadora.isOdd(-2);

        assertTrue(ehPar);
        assertFalse(naoEhPar);
        assertTrue(surpresa);
        assertFalse(surpresa1);
        assertTrue(surpresa2);
    }
}

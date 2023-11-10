package br.com.infnet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculadora {
    private static final Logger LOGGER = LoggerFactory.getLogger(Calculadora.class);

    public int soma(int a, int b){
        LOGGER.info("Iniciando MEtodo de Soma");
        return a + b;
    }
    public int produto(int a, int b){
        return a * b;
    }
    public boolean isOdd(int a){
        if(a % 2 == 0) return true;
        else return false;
    }
    public int divisao(int a, int b){
        return a / b;
    }
}

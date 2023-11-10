package br.com.infnet;

public class Calculadora {
    public int soma(int a, int b){
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

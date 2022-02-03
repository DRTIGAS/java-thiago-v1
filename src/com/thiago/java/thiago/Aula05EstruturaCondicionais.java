package com.thiago.java.thiago;

public class Aula05EstruturaCondicionais {

    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Pode comprar");
        }
        else
        System.out.println("Não pode");
    }
}

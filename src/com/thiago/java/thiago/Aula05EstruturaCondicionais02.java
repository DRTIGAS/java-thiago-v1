package com.thiago.java.thiago;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int idade;
        idade = 14;

        if(idade < 15){
            System.out.println("Categoria Infantil");
        }
        else if(idade >= 15 && idade <= 18){
            System.out.println("Categoria Juvenil");
}
        else {
            System.out.println("Categoria Adulto");
        }
    }
}

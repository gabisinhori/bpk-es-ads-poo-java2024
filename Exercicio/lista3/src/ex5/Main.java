package ex5;

import ex4.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", "Labrador", 3);

        System.out.println(cachorro);

        cachorro.Latir();
        cachorro.Correr();
    }
}
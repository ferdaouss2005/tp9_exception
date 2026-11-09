package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXERCICE 3 : GESTION AVEC FINALLY ===");

        FileReaderUtil reader = new FileReaderUtil();

        reader.readFileSafely("test.txt");

        System.out.println("=== FIN DU PROGRAMME ===");
    }
}
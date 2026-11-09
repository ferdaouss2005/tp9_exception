package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXERCICE 4 : TRY-WITH-RESOURCES ===");

        FileReaderUtil reader = new FileReaderUtil();

        reader.readFileModern("test.txt");

        System.out.println("=== FIN DU PROGRAMME ===");
    }
}
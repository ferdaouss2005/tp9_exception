package com.example.tp9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXERCICE 2 : LECTURE DE FICHIER ===");

        FileReaderUtil reader = new FileReaderUtil();

        try {
            reader.readFile("test.txt");

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }

        System.out.println("=== FIN DU PROGRAMME ===");
    }
}
package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== DÉBUT DU PROGRAMME TP9 ===");

        // Test de la calculatrice
        Calculator calc = new Calculator();

        System.out.println("\n--- Test Addition ---");
        System.out.println("5 + 3 = " + calc.add(5, 3));

        System.out.println("\n--- Test Division Valide ---");

        try {
            System.out.println("10 / 2 = " + calc.divide(10, 2));

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n--- Test Division par Zéro ---");

        try {
            System.out.println("10 / 0 = " + calc.divide(10, 0));

        } catch (IllegalArgumentException e) {
            System.err.println("Erreur interceptée : " + e.getMessage());
            LoggerUtil.logError(e.getMessage());
        }

        // Test de création d'un utilisateur invalide
        System.out.println("\n--- Test Utilisateur ---");

        try {
            User user = new User("", 150);

        } catch (InvalidUserException e) {
            System.err.println(
                "Échec de création utilisateur : " + e.getMessage()
            );

            LoggerUtil.logError(e.getMessage());
        }

        // Test de lecture d'un fichier inexistant
        System.out.println("\n--- Test Lecture Fichier ---");

        FileReaderUtil readerUtil = new FileReaderUtil();

        readerUtil.readFileModern("inexistant.txt");

        System.out.println("\n=== FIN DU PROGRAMME TP9 ===");
    }
}
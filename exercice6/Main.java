package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXERCICE 6 : JOURNALISATION ===");

        try {

            User user = new User("", 150);

        } catch (InvalidUserException e) {

            System.err.println("Échec de création utilisateur : " + e.getMessage());

            LoggerUtil.logError(e.getMessage());
        }

        System.out.println("Erreur enregistrée dans error.log");
        System.out.println("=== FIN DU PROGRAMME ===");
    }
}
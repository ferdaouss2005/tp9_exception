package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXERCICE 5 : EXCEPTION PERSONNALISÉE ===");

        try {
            User user = new User("", 150);

            System.out.println("Utilisateur créé : " + user.getUsername());

        } catch (InvalidUserException e) {

            System.err.println("Erreur : " + e.getMessage());
        }

        System.out.println("=== FIN DU PROGRAMME ===");
    }
}
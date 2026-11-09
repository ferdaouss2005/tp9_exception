# tp9_exception
# TP9 – Gestion des exceptions en Java

## Exercice 1 – Calculatrice sécurisée

<img width="776" height="368" alt="image" src="https://github.com/user-attachments/assets/67092fa4-adef-432d-9028-2599bf5a3eab" />


J'ai créé une calculatrice qui permet d'effectuer des additions et des divisions. J'ai utilisé `IllegalArgumentException` pour gérer la division par zéro.

## Exercice 2 – Lecture de fichiers et Throws

<img width="397" height="199" alt="image" src="https://github.com/user-attachments/assets/59953bca-afd1-42e4-b5a9-2eaf35125f50" />


J'ai créé une classe qui permet de lire un fichier texte avec `FileReader` et `BufferedReader`. J'ai utilisé `throws IOException` pour propager les erreurs à la méthode appelante.

## Exercice 3 – Gestion des ressources avec Finally
J'ai amélioré la lecture des fichiers en utilisant `try`, `catch` et `finally`. J'ai utilisé le bloc `finally` pour garantir la fermeture du fichier même en cas d'erreur.

## Exercice 4 – Try-With-Resources
J'ai simplifié la gestion des fichiers avec `try-with-resources`. Cette méthode permet de fermer automatiquement les ressources après leur utilisation.

## Exercice 5 – Exceptions personnalisées
J'ai créé une exception personnalisée appelée `InvalidUserException`. Je l'ai utilisée pour vérifier les informations d'un utilisateur, notamment son nom et son âge.

## Exercice 6 – Journalisation des erreurs
J'ai créé une classe `LoggerUtil` pour enregistrer les erreurs dans un fichier `error.log`. J'ai utilisé `BufferedWriter` pour écrire les messages avec leur date et leur heure.

## Conclusion
À travers ce TP, j'ai appris à gérer les exceptions en Java, à propager les erreurs, à créer mes propres exceptions et à utiliser différentes méthodes de gestion des ressources.

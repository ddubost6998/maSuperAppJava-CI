package com.maventdd.app;

public class App {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java com.maventdd.app.App <nombre1> <nombre2>");
            System.exit(1); // Indique une erreur lors de l'exécution
        }

        try {
            int nombre1 = Integer.parseInt(args[0]);
            int nombre2 = Integer.parseInt(args[1]);

            Calculatrice calc = new Calculatrice();
            int resultat = calc.additionner(nombre1, nombre2);

            System.out.println("Le résultat de l'addition de " + nombre1 + " et " + nombre2 + " est : " + resultat);

        } catch (NumberFormatException e) {
            System.err.println("Erreur : Les arguments doivent être des nombres entiers valides.");
            System.exit(1); // Indique une erreur lors de l'exécution
        }
    }
}
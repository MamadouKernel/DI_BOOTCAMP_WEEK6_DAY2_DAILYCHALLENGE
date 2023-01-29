/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicedailychallenge.dailychallenge;

import java.util.Random;

/**
 *
 * @author KONATE-MK
 */
public class Dailychallenge {

    public static void main(String[] args) {
        
        // Création d'un objet pour générer des nombres aléatoires
        
        Random rand = new Random();
        
        // Choisir un nombre aléatoire entre 0 et 1
        
        int n = rand.nextInt(2);
        
        // Afficher le nombre choisi
        
        System.out.println("Valeur aléatoire choisie: " + n);

        // Si n est égal à 0, afficher "Pile"
        if (n == 0) {
            System.out.println("Pile");
        }
            // Sinon, afficher "Tail"
        else {
            System.out.println("Tail");
        }
    }
}
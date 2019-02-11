package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ecrire une fonction à laquelle si on passe une phrase elle retourne le mot le plus long de la phrase.

        System.out.println("Veuillez saisir une phrase :");
        //création du scanner pour la saisie de la phrase
        Scanner scUt = new Scanner(System.in);
        String saisieUt = scUt.nextLine();

        //decoupe de la saisie utilisateur grace à la methode split
        String[] decoupe = saisieUt.split(" ");


//combien de caractères est composé chaque mot
        int i;
        String grandMot = "";

//trouve le mot le plus long sut tte la longeur de la chaine de caractère
        for (i = 0; i < decoupe.length; i++) {

//si la taille du "grand mot" est strictement inférieur à la taille de l'index [i]
            if (grandMot.length() < decoupe[i].length()) {
                //grand mot devient le mot le plus grand de la chaine
                grandMot = decoupe[i];

            }
        }
        System.out.println("le mot le plus long est : " + grandMot);
    }}








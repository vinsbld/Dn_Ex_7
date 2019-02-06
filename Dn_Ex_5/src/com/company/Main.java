package com.company;

public class Main {

    public static void main(String[] args) {


        int[] tabFizz = {3, 6, 9, 12, 15, 18, 21};
        //le fizz doit revoyer les multiples de 3



        //premiere boucle fait le tour du tableau
        for (int i = 0 ; i<= tabFizz.length; i++) {
            int div = 3 / tabFizz[i];
            int resultatDeDiv = div;
            resultatDeDiv++;

            //si la valeur dans l'index i divisée par 3  = 1  resultatDeDiv++;
            while (div <tabFizz.length) {
                    System.out.println("la valeur à la position " + i + " du tableau correspondand au chiffre " + tabFizz[i] + " est un multiple de 3");
                }

            }
            }
        }


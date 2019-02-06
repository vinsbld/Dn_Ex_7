package com.company;

public class Tableau {

    int monTableau() {

        int[] tab = {1, 2, 3, 4, 5, 6, 9, 8, 7};

        int i;
int resultat = 0;

        for (i = 0; i < tab.length; i++) {
            if (resultat < tab[i]){
                resultat = tab[i];
            }
        }
        return resultat;

    }
}

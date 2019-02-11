package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ecrire une fonction isPalindrome qui permets de dire true ou false si une chaine est un palindrome

        System.out.println("Saisissez un mot : ");

        //définir un Scanner qui permet à l'utilisateur de saisir une chaine
        Scanner ut = new Scanner(System.in);
        String saisieUt = null;
        saisieUt = ut.nextLine();

        //renvoi la valeur true ou false
        boolean reponse;//par défaut c'est faux...

/**transforme la saisi utilisateur en le renvoyant à l'envers, grace à cela,
 * on peut vérifier si la saisi utilisateur est un palindrome ou pas
 */StringBuffer resultatAlenvers = (new StringBuffer(saisieUt).reverse());

 //transformation du StringBuffer en String
String result = new String(resultatAlenvers);

        //si le resultat du scan est égale à l'inverse de celui ci alors
if (saisieUt.equalsIgnoreCase(result)) {
    //si la condition est remplie alors la reponse est true
    reponse = true;
    System.out.println(reponse);
}
else{
    reponse = false;
    System.out.println(reponse);
}



System.out.println(resultatAlenvers);}


        }





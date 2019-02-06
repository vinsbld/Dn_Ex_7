package com.company;

public class Main {

    public static void main(String[] args) {


        int[] tabFizz = {3, 6, 9, 12, 15, 18, 21};
        //le fizz doit renvoyer les multiples de 3
        int fizz = 3;

//premiere boucle fait le tour du tableau
        for (int i = 0; i <= tabFizz.length; i++) {
            //pour chaque valeur[i] du tableau divisée par 3 sur tout le tableau j est égale à toutes les valeurs divisées par trois
            for (int j = fizz / tabFizz[i]; j <= tabFizz.length; i++) {
                //if (3/tabFizz[i]==1){//est un multiple de 3 donc = 3/n == 1,2,3,4,5)
                for (int k= 0;fizz<=tabFizz[j];k++){
                //si 3 divisées par chaque index est égale 1* lui même ou 2* lui même etc
                if (tabFizz[j]==) {
                    System.out.println("la valeur à la position " + i + " du tableau correspondand au chiffre" + tabFizz[i] + " est un multiple de 3");
                }
                }
                }
        }
            else{
                System.out.println("ce n'en est pas un");
            }
        }
    }
}

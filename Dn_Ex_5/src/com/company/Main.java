package com.company;

public class Main {

    public static void main(String[] args) {


        int[] tabFizz = {3, 6, 9, 12, 15, 18, 21};
        //le fizz doit revoyer les multiples de 3

        int calKul;
        calKul = tabFizz.length/3;




        for (int i = 0; i <= tabFizz.length; i++) {
            if (3/tabFizz[i]==1){//est un multiple de 3 donc = 3/n == 1,2,3,4,5) {
                System.out.println("la valeur à la position " + i + " du tableau correspondand au chiffre" + tabFizz[i] + " est un multiple de 3");
            }
            else{
                System.out.println("ce n'en est pas un");
            }
        }
    }
}

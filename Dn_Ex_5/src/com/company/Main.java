package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {


        int[] tabFizz = {3,5, 15,9, 8,13,10,1};

int div3;
int div5;
int i;
        // boucle fait le tour du tableau
        for (i=0; i< tabFizz.length; i++) {

            //div doit diviser tous les nombres du tableau par lui même
            div3 = tabFizz[i]%3;
div5=tabFizz[i]%5;

//si il n'y a pas de résidus à div 3
            if (div3 == 0){
                System.out.println("Fizz");
            }

            //si il n'y a pas de résidus à div 5
            else if (div5 == 0){
                System.out.println("Buzz");
            }
//si div3 et div 5 retournent 0
            else if (div3 ==0 && div5==0){
                System.out.println("FizzBuzz");
            }
            //sinon return "Nul"
            else{
                System.out.println("Null");
            }

                }

            }
          }



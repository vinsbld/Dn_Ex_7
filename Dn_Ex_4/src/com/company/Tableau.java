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

    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[5];
    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Please enter number");
        numbers[i] = input.nextDouble(); }
}



class Array { public static void main(String a[]){
    Scanner input = new Scanner(System.in);

System.out.println("Enter the size of an Array");

int num = input.nextInt();
System.out.println("Enter the Element "+num+" of an Array");

double[] numbers = new double[num];

for (int i = 0; i < numbers.length; i++) {
    System.out.println("Please enter number");
    numbers[i] = input.nextDouble(); }
for (int i = 0; i < numbers.length; i++) {
    if ( (i%3) !=0){ System.out.print("");
    System.out.print(numbers[i]+"\t"); }
    else { System.out.println("");
    System.out.print(numbers[i]+"\t"); } } }
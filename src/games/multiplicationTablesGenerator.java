package games;

import java.util.Scanner;

public class multiplicationTablesGenerator { // class decoration where we define our class. Class is a structure or blue print of an object.

    Scanner myScanner = new Scanner(System.in);

    public static  void main(String[] args) {
        multiplicationTablesGenerator mdd = new multiplicationTablesGenerator();
        mdd.geValues();
    }

    private void  geValues() { // method decoration with return type of void.
        System.out.println("What number would you like the multiplication table for?");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the maximum multiplication you wish to calculate?");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        calculate(number, multiplier);
    }

    private void calculate(int number, int multiplier) { // this is the method signature.
        for (int i = 1; i <= multiplier; i++) { // passing the value of a variable across. Then sends to this multiplier here. for stands for 'for loop'. Int stands for initialise.
            System.out.println(i + "times " + number + " is " + i * number);
        }
    }
}

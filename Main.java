package BottlesOfBeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner initialBottle = new Scanner(System.in);
    System.out.println("Please enter how many bottles of beer you will start with: ");
    int bottles = initialBottle.nextInt();

    final int restockBottles = bottles;
    int newBottles = bottles - 1;

    while (bottles > 2){
        System.out.println(bottles + " bottles of beer on the wall, " +
        bottles + " bottles of beer. Take one down and pass it around, " +
        newBottles + " bottles of beer on the wall.");

        bottles = bottles - 1;
        newBottles = newBottles - 1;
    }

    while (bottles == 2){
        System.out.println(bottles + " bottles of beer on the wall, " +
        bottles + " bottles of beer. Take on down and pass it around, " +
        newBottles + " bottle of beer on the wall.");

        bottles = bottles - 1;
        newBottles = newBottles - 1;
    }

    while (bottles == 1) {
        System.out.println(bottles + " bottle of beer on the wall, " +
        bottles + " bottle of beer. Take one down and pass it around, " +
        newBottles + " bottles of beer on the wall.");

        bottles = bottles - 1;
        newBottles = newBottles - 1;
    }

    while (bottles == 0) {
        System.out.println(bottles + " bottles of beer on the wall, " +
        bottles + " bottles of beer. Go to the store and buy some more, " +
        restockBottles + " bottles of beer on the wall.");
        break;
    }
}

}

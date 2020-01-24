package com.practicehouse.numbers;

import java.util.Scanner;

/**
 *
 * @author arifur.rahman
 */
public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inputNumber = scanner.nextInt();

        int squareNumber = inputNumber * inputNumber;

        // Convert Number To String in easy way
        String inputNumberAsString = inputNumber + "";
        String squareNumberAsString = squareNumber + "";

        if (squareNumberAsString.endsWith(inputNumberAsString)) {
            System.out.println(inputNumber + " is Automorphic Number");
        } else {
            System.out.println(inputNumber + " is Not an Automorphic number");
        }
    }

}

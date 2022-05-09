// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_2_3
// File Name: BMICalculator.java

// This function asks for the height of weight and height of the user and
// outputs the BMI (Body Mass Index) of that user

import java.util.Scanner;                                                       // Imports the scanner object that listens to the input of the user.

public class BMICalculator {

    public static void main(String[] args) {

        int weight;                                                             // Tells the program that that the input for the variable 'weight' it is accepting is a integer.
        int height;                                                             // Tells the program that that the input for the variable 'height' it is accepting is a integer.

        Scanner scan = new Scanner(System.in);                                  // Creates a scanner object that listens to the inputs of the user.

        System.out.print("Enter Weight in Pounds: ");                           // Where the user inputs the 'weight' and where the next line of code scans

        weight = scan.nextInt();                                                // Scans the input of the user (Denoted here as 'weight') on the line where the print statement is

        System.out.print("Enter Height in Inches: ");                           // Where the user inputs the 'height' and where the next line of code scans

        height = scan.nextInt();                                                // Scans the input of the user (Denoted here as 'height') on the line where the print statement is

        System.out.println("Your BMI (Body Mass Index) is: " //Prints the results of the BMI formula taking into consideration the inputs of the user. (I used float values, because decimals are important in BMI and I felt that double would have felt to big for the user to understand.)
                + (float) weight * 703 / ((float) height * (float) height));
    }

}

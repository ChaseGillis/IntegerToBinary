/* 
 * Homework 4, Problem 4
 * Chase Gillis 09/26/2023
 * Decimal To Binary Computer
 * Prompts the user to enter a decimal integer and displays
 * its corresponding binary value as a string.
 */

import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        // Declarations
        Scanner kb = new Scanner(System.in);
        int num;

        // Input
        System.out.print("Enter an integer: ");
        num = kb.nextInt();

        // Convert the decimal integer to binary by calling my other method
        String binary = decimalToBinary(num);

        // Output
        System.out.println("Binary representation: " + binary);

    }

    public static String decimalToBinary(int num)
    {
        //Declare a string to store the result
        String binary = "";

        //set the range in for loop as an 8 bit binary number
        for (int i = 7; i >= 0; i--) {
            //declare the integer bit
            //move over from left to right changing 1s and 0s
            //use >> to make it a signed bit in order to handle negatives
            int bit = (num >> i) & 1;
            //store the bit into binary for each cycle of the for loop
            binary += bit;
        }

        //return the result
        return binary;
    }
}

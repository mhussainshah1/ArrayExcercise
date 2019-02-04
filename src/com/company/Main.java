package com.company;

import java.util.Scanner;

/**
 *  Write a program to print a string in reverse:
 * Eg: Welcome
 * emocleW
 *
 * Write a program that will find the length of an input string without using the library function.
 *
 * Prompt the user to input 10 values and store them into an array. If there are any duplicate values in that array,
 * remove them and print out the remaining values.
 *
 * Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
 * Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
 * Expected output:
 * (6,7)
 *
 * (9,4)
 *
 * Prompt the user to input 10 values and store them into an array. Output the total number of odd and even values in
 * the array.
 *
 */
public class Main {

    public static void main(String[] args) {
        //1
	    StringBuilder string = new StringBuilder("Welcome");
        System.out.println(string.reverse());

        //2
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = keyboard.next();
        System.out.println(input.length());

        //3
        String[] strArr1 = {"","","","","","","","","",""};
        boolean isDuplicate;
        System.out.print("Enter input : ");
        int count = 0;
        for (int i = 0; i <strArr1.length ; i++) {
            isDuplicate = false;
            input =keyboard.next();
            for(String s : strArr1){
                if(input.equals(s)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                strArr1[count] = input;
                count++;
            }
        }

        for (String str: strArr1) {
            System.out.print(str + ", ");
        }

        //4


    }
}

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
        //1 Write a program to print a string in reverse:
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
	    StringBuilder string = new StringBuilder(keyboard.next());
        System.out.println("Reverse order: "+string.reverse());

        //2 Write a program that will find the length of an input string without using the library function.
        System.out.print("Enter a word: ");
        String input = keyboard.next();
        char[] charArr = input.toCharArray();
        int length;
        for (length = 0; length < charArr.length; length++);
        System.out.println("length :  " +length);

        //3 Prompt the user to input 10 values and store them into an array. If there are any duplicate values in that array,
        //  remove them and print out the remaining values.
        String[] strArr = {"","","","","","","","","",""};
        boolean isDuplicate;
        System.out.print("Enter input : ");
        int count = 0;
        //for (int i = 0; i <strArr1.length ; i++) {
        for(String strO : strArr){
            isDuplicate = false;
            input =keyboard.next();
            for(String strI : strArr){
                if(input.equals(strI)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                strArr[count++] = input;
            }
        }

        for (String str: strArr) {
            System.out.print(str + ", ");
        }
        System.out.println();

        //4
        int arr1[] = {1,7,6,5,9};
        int arr2[] = {2,7,6,3,4};

        for(int i: arr1){
            for (int j : arr2) {
                if(i + j == 13){
                    System.out.println("("+i+","+j+")");
                }
            }
        }

        //5 Prompt the user to input 10 values and store them into an array. Output the total number of odd and even values in
        //  the array.

        int arr[] = new int[10];
        System.out.println("Enter 10 Values");
        for(int i = 0; i < arr.length ; i++){
            arr[i] =keyboard.nextInt();
        }

        int sumOdd = 0, sumEven = 0;
        for (int i  : arr) {//= 0; i < arr.length; i++) {
            if(i%2 == 0){
                sumEven += i;
            } else{
                sumOdd += i;
            }
        }
        System.out.println("Total number of Even values =" + sumEven);
        System.out.println("Total number of Odd Values ="+ sumOdd);
    }
}

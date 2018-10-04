package com.company;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //boolean iIndex = false;
        System.out.println("Enter a word: ");
        String text = sc.nextLine();
        System.out.println("Enter a number as an index: ");
        int index = sc.nextInt();

        System.out.println("The length of alphabet is : " + text.length());

        if (index > text.length()) {

            System.out.println("Index is larger than length.");
        }else
            System.out.println("The substring from 0 to " + index + " is: " +
                    text.substring(0, index));
        }
    }


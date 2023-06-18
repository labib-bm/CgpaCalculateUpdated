package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputValidityChecker {
    private static Scanner sc = new Scanner(System.in);
    public static int getValidInput(String text){
        int number = -1;
        boolean validInput = false;
        while (!validInput){
            try {
                System.out.print(text);
                number = sc.nextInt();
                validInput = true;
            }
            catch (InputMismatchException e){
                System.out.print("Invalid Input. Please Enter a valid Number: ");
                sc.nextLine();
            }
        }
        return number;
    }
    public static int getValidCreditInput(String text){
        int number = -1;
        boolean validInput = false;
            while (!validInput){
                try {
                    System.out.print(text);
                    number = sc.nextInt();
                    if(number==1 || number==3){
                        validInput = true;
                    }
                    else{
                        System.out.println("Enter valid Credit Number 1 or 3");
                    }
                }
                catch (InputMismatchException e){
                    System.out.print("Invalid Input. Please Enter a valid Number: ");
                    sc.nextLine();
                }
            }
        return number;
    }
    public static int getValidMarkInput(String text, int range){
        int number = -1;
        boolean validInput = false;
            while (!validInput){
                try {
                    System.out.print(text);
                    number = sc.nextInt();
                    if(number>=0 && number<=range){
                        validInput = true;
                    }
                    else{
                        System.out.println("Enter valid Number between 0 to "+ range);
                    }
                }
                catch (InputMismatchException e){
                    System.out.print("Invalid Input. Please Enter a valid Number: ");
                    sc.nextLine();
                }
            }
        return number;
    }
}

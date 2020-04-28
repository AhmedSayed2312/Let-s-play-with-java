package com.mmrproduct;

import java.util.Scanner;

public class Main {
    static Scanner myScanner=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("give -1 to exit");
        System.out.print("Give the length of pascal's triangle's length: ");
        int userInput=myScanner.nextInt();
        while (userInput != -1){
            if(userInput < -1 || userInput>20){
                System.out.println("please enter something between -1 ~ 20");
                userInput=myScanner.nextInt();
                continue;
            }
            printPascalTriangle(userInput);
            System.out.println("\n\n");
            System.out.println("please enter something between -1 ~ 20");
            userInput=myScanner.nextInt();
        }
    }


    static void printPascalTriangle(int length){
        int [][] pascal=new int[length][length];

        for(int i =0; i < length; i++){
            pascal[0][i] = 1;
            pascal[i][0] = 1;
        }
        for (int row = 1; row < length ; row++) {
            for (int column = 1; column < length-row ; column++) {
                pascal[row][column] = pascal[row][column-1]+pascal[row-1][column];
            }

        }

        for (int row = 0; row < length ; row++) {
            for (int column = 0; column < length-row ; column++) {
                System.out.print(pascal[row][column]+"\t");
            }
            System.out.println("\n");
        }

    }
}

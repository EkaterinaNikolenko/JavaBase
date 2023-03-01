package com.hillel.nikolenko.homeworks.homework11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        System.out.println("Please enter the first number:");
        while(true){
            if(scanner.hasNextInt()){
                m = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        int n = 0;
        System.out.println("Please enter the second number:");
        while(true){
            if(scanner.hasNextInt()){
                n = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
        }
//        System.out.println(m);
//        System.out.println(n);

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println();
        System.out.println("Matrix");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transposed matrix");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
    }
}

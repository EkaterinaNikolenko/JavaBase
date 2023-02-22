package com.hillel.nikolenko.homeworks.homework9;

public class Main {
    public static void main(String[] args) {
        int[] firstTeam = new int[25];
        int[] secondTeam = new int[25];
        int sumAgeFirstTeam = 0;
        int sumAgeSecondTeam = 0;

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            sumAgeFirstTeam += firstTeam[i];
        }
        for (int i = 0; i < secondTeam.length; i++) {
            secondTeam[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            sumAgeSecondTeam += secondTeam[i];
        }

        System.out.print("First Team: ");
        for (int i = 0; i < firstTeam.length; i++) {
            if(i == firstTeam.length - 1){
                System.out.print(firstTeam[i]);
            } else{
                System.out.print(firstTeam[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Second team: ");
        for (int i = 0; i < secondTeam.length; i++) {
            if(i == secondTeam.length - 1){
                System.out.print(secondTeam[i]);
            } else{
                System.out.print(secondTeam[i] + ", ");
            }
        }

        System.out.println();
        double averageAgeFirstTeam = (double) sumAgeFirstTeam / firstTeam.length;
        double averageAgeSecondTeam = (double) sumAgeSecondTeam / secondTeam.length;
        System.out.println("Average age of the first team: " + averageAgeFirstTeam);
        System.out.println("Average age of the second team: " + averageAgeSecondTeam);
    }
}

package com.hillel.nikolenko.homeworks.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int warriorsLi = 860;
        int warriorsMin = (int) (warriorsLi * 1.5);

        int warriorAttackLi = scanner.nextInt();
        int archerAttackLi = scanner.nextInt();
        int riderAttackLi = scanner.nextInt();

        int warriorAttackMin = scanner.nextInt();
        int archerAttackMin = scanner.nextInt();
        int riderAttackMin = scanner.nextInt();

        int totalAttackLi = warriorsLi * (warriorAttackLi + archerAttackLi + riderAttackLi);
        int totalAttackMin = warriorsMin * (warriorAttackMin + archerAttackMin + riderAttackMin);

        System.out.println("Загальний показник атаки династії Лі: " + totalAttackLi);
        System.out.println("Загальний показник атаки династії Мін: " + totalAttackMin);
    }
}

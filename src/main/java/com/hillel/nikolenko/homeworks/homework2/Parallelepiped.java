package com.hillel.nikolenko.homeworks.homework2;

public class Parallelepiped {
    public static void main(String[] args) {
        int firstSide = 3;
        int secondSide = 2;
        int thirdSide = 4;
        int volume = firstSide * secondSide * thirdSide;
        int length = 4 * (firstSide + secondSide + thirdSide);
        System.out.println("Об'єм паралелепіпеда: " + volume);
        System.out.println("Сума всіх сторін: " + length);
    }
}

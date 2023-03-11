package com.hillel.nikolenko.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Steve", 1, 3, 2000, "user1@gmail.com", "0123456789", "Johnson", 73.5, 120, 10000);
        User user2 = new User("John", 13, 5, 1994, "user2@gmail.com", "9876543210", "Smith", 81.2, 125, 12500);
        User user3 = new User("Robert", 26, 7, 2011, "user3@gmail.com", "1357924680", "Williams", 35.0, 117, 15000);

        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();
        System.out.println();

        user1.setSteps(11350);
        user3.setWeight(38.0);

        user1.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();
    }
}

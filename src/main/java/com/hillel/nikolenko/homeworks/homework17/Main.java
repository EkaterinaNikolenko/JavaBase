package com.hillel.nikolenko.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        order();
        System.out.println("Всього видано " + NumberOFDrinks.counter + " напоїв");
        System.out.println("Всього до сплати: " + TotalSum.sum + " грн");
    }

    static void order(){
        Scanner scanner = new Scanner(System.in);

        DrinksMachine[] listOfDrinks = DrinksMachine.values();
        DrinksMachine userDrinks = null;

        while (true) {
            boolean isStop = false;
            while (true) {
                System.out.println("Please enter drink: " + Arrays.toString(listOfDrinks));
                String userChoice = scanner.nextLine();

                if (userChoice.toUpperCase().equals("NO")) {
                    isStop = true;
                    break;
                }

                userChoice = userChoice.toUpperCase();
                for (DrinksMachine drink : listOfDrinks) {
                    userDrinks = null;
                    if (userChoice.equals(drink.toString())) {
                        userDrinks = DrinksMachine.valueOf(userChoice);
                        new NumberOFDrinks();
                        break;
                    }
                }

                if (userDrinks != null) {
                    break;
                } else {
                    System.out.println("Wrong data, try again");
                }
            }

            if (isStop) {
                break;
            }

            switch (userDrinks) {

                case COFFEE: {
                    System.out.println("Напой " + DrinksMachine.COFFEE + " коштує " + Drinks.COFFEE + "грн");
                    makeCoffee();
                    new TotalSum(Drinks.COFFEE);
                    break;
                }
                case TEA: {
                    System.out.println("Напой " + DrinksMachine.TEA + " коштує " + Drinks.TEA + "грн");
                    makeTea();
                    new TotalSum(Drinks.TEA);
                    break;
                }
                case LEMONADE: {
                    System.out.println("Напой " + DrinksMachine.LEMONADE + " коштує " + Drinks.LEMONADE + "грн");
                    makeLemonade();
                    new TotalSum(Drinks.LEMONADE);
                    break;
                }
                case MOJITO: {
                    System.out.println("Напой " + DrinksMachine.MOJITO + " коштує " + Drinks.MOJITO + "грн");
                    makeMojito();
                    new TotalSum(Drinks.MOJITO);
                    break;
                }
                case WATER: {
                    System.out.println("Напой " + DrinksMachine.WATER + " коштує " + Drinks.WATER + "грн");
                    makeWater();
                    new TotalSum(Drinks.WATER);
                    break;
                }
                case COCA_COLA: {
                    System.out.println("Напой " + DrinksMachine.COCA_COLA + " коштує " + Drinks.COCA_COLA + "грн");
                    makeCocaCola();
                    new TotalSum(Drinks.COCA_COLA);
                    break;
                }
            }
        }
    }
    static void makeCoffee(){
        System.out.println("Water, coffee, milk");
    }
    static void makeTea(){
        System.out.println("Water, tea");
    }
    static void makeLemonade(){
        System.out.println("Water, lemon, mint, sugar, ice");
    }
    static void makeMojito(){
        System.out.println("Water, mint, lime, rum, syrup, ice");
    }
    static void makeWater(){
        System.out.println("Bottle of Water");
    }
    static void makeCocaCola(){
        System.out.println("Bottle of Coca Cola");
    }
}

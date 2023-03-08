package com.hillel.nikolenko.homeworks.homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("bun with sesame", "beef", "cheddar cheese", "cabbage", "mayonnaise");
        Burger burger2 = new Burger("bun with sesame", "beef", "cheddar cheese", "cabbage");
        Burger burger3 = new Burger("bun with sesame", "beef", 2, "cheddar cheese", "cabbage");
        Burger burger4 = new Burger("bun with sesame", "beef", 2, "cheddar cheese", "cabbage", "mayonnaise");

    }
}

package com.hillel.nikolenko.homeworks.homework17;

public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    WATER("Мінералка"),
    COCA_COLA("Кока кола");

    private String drink;

    DrinksMachine(String drink) {
        this.drink = drink;
    }
}

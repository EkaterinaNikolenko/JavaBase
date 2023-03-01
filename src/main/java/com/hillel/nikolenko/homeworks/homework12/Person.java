package com.hillel.nikolenko.homeworks.homework12;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }
    static String personInfo(String name, String surname, String city, String telephone){
        String string = "Зателефонувати громадянину " + name + " " + surname + " із міста "
                + city + " можна за номером " + telephone;
        return string;
    }
}

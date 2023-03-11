package com.hillel.nikolenko.homeworks.homework14;

public class User {
    private String firstname;
    private int day;
    private int month;
    private int year;
    private String email;
    private String telephoneNumber;
    private String lastname;
    private double weight;
    private int pressure;
    private int steps;
    private int age;

    public User(String firstname, int day, int month, int year, String email, String telephoneNumber, String lastname, double weight, int pressure, int steps) {
        this.firstname = firstname;
        this.day = day;
        this.month = month;
        this.year = year;
        age = 2023 - year;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.lastname = lastname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void printAccountInfo(){
        System.out.println("first name: " + firstname);
        System.out.println("last name: " + lastname);
        System.out.println("date of birth: " + day + "." + month + "." + year);
        System.out.println("age: " + age);
        System.out.println("email: " + email);
        System.out.println("telephone: " + telephoneNumber);
        System.out.println("weight: " + weight);
        System.out.println("pressure: " + pressure);
        System.out.println("steps: " + steps);
    }

    public String getFirstname() {
        return firstname;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}

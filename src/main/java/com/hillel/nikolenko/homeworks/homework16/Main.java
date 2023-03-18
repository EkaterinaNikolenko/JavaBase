package com.hillel.nikolenko.homeworks.homework16;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.getVersionOS();

        System.out.println();

        Iphones iphone = new Iphones();
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.getVersionOS();
    }
}

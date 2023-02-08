package com.hillel.nikolenko.homeworks.homework3;

public class Coordinates {
    public static void main(String[] args) {
        int latDeg = 41;
        int latMin = 53;
        int latSec = 25;
        int longDeg = 12;
        int longMin = 29;
        int longSec = 32;
        char charDeg= '\u00B0';
        char charPrime = '\u2032';
        char charDoublePrime = '\u2033';
        System.out.println("Colosseum coordinates");
        System.out.println("DSM Lat: " + latDeg + charDeg + ' ' + latMin + charPrime + ' ' + latSec + charDoublePrime + " N");
        System.out.println("DSM Long: " + longDeg + charDeg + ' ' + longMin + charPrime + ' ' + longSec + charDoublePrime + " W");
    }
}

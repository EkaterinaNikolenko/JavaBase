package com.hillel.nikolenko.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        int count = 0;

        // first version
        for (int i = 1; count != 100; i++) {
            if (i / 10 != 4 && i / 10 != 9 && i % 10 != 4 && i % 10 != 9 &&
                    i % 100 % 10 != 4 && i % 100 % 10 != 9 && i % 100 / 10 != 4 && i % 100 / 10 != 9) {
                System.out.println(i);
                count++;
            }
        }

        // second version
//        for (int i = 1; count != 100; i++) {
//            int number1 = i;
//            int number2 = i;
//            int number3 = i;
//            while(number1 / 10 != 0){
//                number1 /= 10;
//                number2 %= 10;
//            }
//            while(number3 / 10 != 0){
//                number3 /= 10;
//                number3 %= 10;
//            }
//            if(number1 == 4 || number1 == 9 || number2 == 4 || number2 == 9 || number3 == 4 || number3 == 9){
//                continue;
//            }
//            count++;
//            System.out.println(i);
//        }
    }
}

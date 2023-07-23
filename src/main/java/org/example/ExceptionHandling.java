package org.example;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String x;

            System.out.print("Input ur number : ");
            x = scanner.nextLine();
            try {
                int y =Integer.parseInt(x);
                if (isPrime(y)) {
                    System.out.println("ur number is prime number");
                } else {
                    System.out.println("ur number is not prime number");
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("u need to provide number");
            }
        }
    }

    private static boolean isPrime(int x) {
        if (x<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(x);i++ ){
            if (x%i==0){
                return false;
            }
        }
       return true;
    }

//    private static void firstExcercise() {
//        Scanner scanner = new Scanner(System.in);
//        int x;
//        int y;
//
//        System.out.print("Input first number : ");
//        x = scanner.nextInt();
//        System.out.print("Input the second number : ");
//        y = scanner.nextInt();
//        try {
//            System.out.println(x / y);
//        } catch (ArithmeticException ae) {
//            System.out.println("the divison cannot operate because it's divided by zero");
//        }
//    }
}

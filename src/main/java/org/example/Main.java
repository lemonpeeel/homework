package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator calculator = new Calculator ();

        System.out.println("Please enter the first number");
        var firstNumber = scan.nextLine();

        System.out.println("Please choose a calculation");
        String operator = scan.nextLine();

        System.out.println("Please enter the second number");
        var secondNumber = scan.nextLine();

        switch (operator) {
            case "+" -> {
                double result = calculator.addDoubleToDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);


            }
            case "-" -> {
                double result = calculator.subtractDoubleFromDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);

            }
            case "/" -> {
                double result = calculator.divideDoubleByDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);

            }
            case "*" -> {
                double result = calculator.multiplyDoubleByDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);

            }
            default -> {
                System.out.println("You Jerk!");

            }

        }









    }
}

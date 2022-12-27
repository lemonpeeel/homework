package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator myCal = new Calculator ();

        System.out.println("Please enter the first number");
<<<<<<< HEAD
        var x = scan.nextLine();

        System.out.println("Please choose a calculation");
        String op = scan.nextLine();

        System.out.println("Please enter the second number");
        var y = scan.nextLine();

        if(op.equals("+")) {
            double a = myCal.plus(x, y);
            System.out.println("result is : " + a);

        }
        else if(op.equals("-")) {
            double a = myCal.minus(x, y);
            System.out.println("result is : " + a);

        }
        else if(op.equals("/")) {
            double a = myCal.divide(x, y);
            System.out.println("result is : " + a);

        }
        else if(op.equals("*")){
            double a = myCal.multi(x, y);
            System.out.println("result is : " + a);

        }
        else{
            System.out.println("wrong");
            return;
=======
        var firstNumber = scan.nextLine();

        System.out.println("Please choose a calculation");
        String operator = scan.nextLine();

        System.out.println("Please enter the second number");
        var secondNumber = scan.nextLine();

        switch (operator) {
            case "+" -> {
                double result = myCal.addDoubleToDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);


            }
            case "-" -> {
                double result = myCal.subtractDoubleFromDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);

            }
            case "/" -> {
                double result = myCal.divideDoubleByDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);

            }
            case "*" -> {
                double result = myCal.multiplyDoubleByDouble(firstNumber, secondNumber);
                System.out.println("result is : " + result);

            }
            default -> {
                System.out.println("not support!");

            }
>>>>>>> a1ef8b6 (Lazy commit)
        }









    }
}

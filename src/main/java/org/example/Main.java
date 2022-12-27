package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator myCal = new Calculator ();

        System.out.println("Please enter the first number");
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
        }









    }
}

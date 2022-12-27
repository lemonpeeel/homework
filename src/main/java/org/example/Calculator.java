package org.example;

public class Calculator {




    double plus (double x, double y) {
       return x + y;
    }

    double plus (String x, String y) {
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);

        return a + b;
    }

    double minus ( double x, double y) {
        return x - y;
    }

    double minus ( String x, String y) {
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        return a - b;
    }

    double multi (double x, double y) {
        return x * y;
    }

    double multi (String x, String y) {
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        return a * b;
    }

    double divide (double x, double y) {
        return x / y;

    }

    double divide (String x, String y) {
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        return a / b;
    }



}
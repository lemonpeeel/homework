package org.example;

public class Calculator {



<<<<<<< HEAD

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
=======
    public double addDoubleToDouble (double firstDouble, double secondDouble) {
        return firstDouble + secondDouble;
    }

    public double addDoubleToDouble (String firstString, String secondString) {
        double firstStringToDouble = Double.parseDouble(firstString);
        double secondStringToDouble = Double.parseDouble(secondString);

        return firstStringToDouble + secondStringToDouble;
    }

    public double subtractDoubleFromDouble (double firstDouble, double secondDouble) {
        return firstDouble - secondDouble;
    }

    public double subtractDoubleFromDouble (String firstString, String secondString) {
        double firstStringToDouble = Double.parseDouble(firstString);
        double secondStringToDouble = Double.parseDouble(secondString);
        return firstStringToDouble - secondStringToDouble;
    }

    public double multiplyDoubleByDouble (double firstDouble, double secondDouble) {
        return firstDouble * secondDouble;
    }

    public double multiplyDoubleByDouble (String firstString, String secondString) {
        double firstStringToDouble = Double.parseDouble(firstString);
        double secondStringToDouble = Double.parseDouble(secondString);
        return firstStringToDouble * secondStringToDouble;
    }

    public double divideDoubleByDouble (double firstDouble, double secondDouble) {
        return firstDouble / secondDouble;

    }

    public double divideDoubleByDouble (String firstString, String secondString) {
        double firstStringToDouble = Double.parseDouble(firstString);
        double secondStringToDouble = Double.parseDouble(secondString);
        return firstStringToDouble / secondStringToDouble;
>>>>>>> a1ef8b6 (Lazy commit)
    }



}
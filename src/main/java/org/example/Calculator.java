package org.example;

public class Calculator {




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
    }



}
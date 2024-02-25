package com.ignateva.test1;

import static java.lang.System.out;

public class Calculation {
    double a;
    double b;
    double c;

    public double getResult() {
        return result;
    }

    double result;

    public Calculation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculation(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public double max(double a, double b, double c) {

        double max = Math.max(a, b);
        if (max < c) {
            max = c;
        }
        return result = max;

    }

    public double min(double a, double b, double c) {

        double min = Math.min(a, b);
        if (min > c) {
            min = c;
        }
        return result = min;
    }

    public double avg(double a, double b, double c) {
        return result = (a + b + c) / 3;
    }

    public double add(double a, double b) {
        return result = a + b;
    }

    public double sub(double a, double b) {
        return result = a - b;
    }

    public double mult(double a, double b) {
        return result = a * b;
    }

    public double div(double a, double b) {
        result = a / b;
        return result;
    }

    public double pow(double a, double b) {
        result = Math.pow(a, b);
        return result;
    }

    public double percent(double a, double b) {
        result = b / 100 * a;
        return result;
    }
}

package com.codegym;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return delta;
    }

    public double getRoot1(){
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return (-this.b+Math.sqrt(delta)) / (2*this.a);
    }

    public double getRoot2(){
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return (-this.b-Math.sqrt(delta)) / (2*this.a);
    }

}

package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a");
        a = scanner.nextDouble();
        System.out.println("Enter number b");
        b = scanner.nextDouble();
        System.out.println("Enter number c");
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has 1 root : " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has 2 roots : " + "Root1 :" + quadraticEquation.getRoot1() + "," + " Root2: " + quadraticEquation.getRoot2());
        }
    }
}

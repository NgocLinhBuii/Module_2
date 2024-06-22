package ss4_OOP.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

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
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta > 0) {
            return Double.NaN;
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return Double.NaN; // No real root
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation " +
                "a= " + a +
                ", b= " + b +
                ", c= " + c + " = 0"
                ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation);
        System.out.println("Discriminant: " + equation.getDiscriminant());
        System.out.println("Root 1: " + equation.getRoot1());
        System.out.println("Root 2: " + equation.getRoot2());
    }
}

package com.bl.functions;
import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a");
        double a = scan.nextDouble();
        System.out.println("Enter value of b");
        double b = scan.nextDouble();
        System.out.println("Enter value of c");
        double c = scan.nextDouble();
        double delta = (b*b-4*a*c);
        System.out.println(delta);
        double root1 = -b+(Math.sqrt(delta))/(2*a);
        System.out.println(root1);
        double root2 = -b-(Math.sqrt(delta))/(2*a);
        System.out.println(root2);
    }

}


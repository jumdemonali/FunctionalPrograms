package com.bl.functions;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double distance=  Math.sqrt(Math.pow(x,2+Math.pow(y,2)));
        System.out.println(distance);
    }

}

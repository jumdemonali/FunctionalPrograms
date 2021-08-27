package com.bl.functions;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        double t = sc.nextDouble();
        System.out.println("Enter y ");
        double v = sc.nextDouble();
        if (t <= 50 && v < 3 && v > 120) {
            double windchill = 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println(+windchill);
        }
        else
            System.out.println("The value of t should not be greater than 50 while value of v should be greater than 120 and less then 3");
    }
}

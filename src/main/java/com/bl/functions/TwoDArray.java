package com.bl.functions;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] table = new int[row][column];
        System.out.println("Enter " + row * column + " values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = sc.nextInt();
                System.out.print(table[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}


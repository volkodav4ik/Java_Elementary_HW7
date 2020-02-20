package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW7T1 {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        System.out.print("Please, enter quantity of line of matrix M = ");
        int m = SCANNER.nextInt();
        System.out.print("Please, enter quantity of column of matrix N = ");
        int n = SCANNER.nextInt();
        if (m < 1 || n < 1) {
            throw new IndexOutOfBoundsException("M and N should be at list more than 1");
        }
        int[][] matrix = new int[m][n];
        createAndInitMatrix(matrix);
        System.out.println("Unsorted matrix:");
        printMatrix(matrix);
        System.out.println("*********************");
        sortMatrix(matrix);
        System.out.println("Sorted matrix:");
        printMatrix(matrix);
    }

    private static void sortMatrix(int[][] matrix) {
        int[] tmp = new int[matrix.length * matrix[0].length];
        int desposition = 0;
        for (int[] ints : matrix) {
            System.arraycopy(ints, 0, tmp, desposition, ints.length);
            desposition += ints.length;
        }
        Arrays.sort(tmp);
        int tmpcounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = tmp[tmpcounter];
                tmpcounter++;
            }
        }
    }

    private static void createAndInitMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RANDOM.nextInt(MAX_VALUE);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}

package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 19.01.17.
 */
public class DiagonalDifference {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }



        int leftSum =  0;
        int rightSum =  0;

        for (int rows = 0; rows < n; rows++) {
           leftSum += matrix[rows][rows];
           rightSum += matrix[rows][matrix[rows].length - 1 - rows];
        }

        System.out.println(Math.abs(leftSum - rightSum));




    }

}

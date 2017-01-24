package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class SumMatrixElements {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        int sum = 0;


        for (int row = 0; row < rows; row++) {

            String[] reminder = scanner.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
                sum += matrix[row][col];
            }
        }


//
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }


        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);




    }

}

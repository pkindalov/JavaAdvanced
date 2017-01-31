package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 19.01.17.
 */
public class MaximalSum {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows ; row++) {
            String[] inp = scanner.nextLine().split(" ");
            for (int col = 0; col < cols ; col++) {
                matrix[row][col] = Integer.parseInt(inp[col]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int[] start = new int[2];


        for (int r = 0; r < rows - 2 ; r++) {
            for (int c = 0; c < cols - 2 ; c++) {
                int currentSum = 0;

                for (int r1 = r; r1 <= r + 2; r1++) {
                    for (int c1 = c; c1 <= c + 2; c1++) {
                        currentSum += matrix[r1][c1];
                    }
                }

                if(currentSum > maxSum){
                    maxSum = currentSum;
                    start[0] = r;
                    start[1] = c;
                }



            }
        }


        System.out.println("Sum = " +maxSum);

        for (int r = start[0]; r <= start[0] + 2; r++) {
            for (int c = start[1]; c <= start[1] + 2; c++) {
                if(c == start[1] + 2){
                    System.out.print(matrix[r][c]);
                }else {
                    System.out.print(matrix[r][c] + " ");
                }

            }
            System.out.println();
        }


//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//
//            System.out.println();
//        }




    }

}

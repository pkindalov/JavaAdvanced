package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class ReadingAndPrintingMatrix {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] matrixExample = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d][%d] =  ", row, col);
                matrixExample[row][col] = Integer.parseInt(scanner.nextLine());
            }
        }


        for (int[] ints : matrixExample) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }



    }

}

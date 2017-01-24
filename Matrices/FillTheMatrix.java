package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 18.01.17.
 */
public class FillTheMatrix {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int matrixRowsCols = Integer.parseInt(scanner.nextLine());
        //int patternB = Integer.parseInt(scanner.nextLine());

        int[][] matrixA = new int[matrixRowsCols][matrixRowsCols];
        int[][] matrixB = new int[matrixRowsCols][matrixRowsCols];
        int num = 0;
        int numB = 0;

        //pattern A
        for (int rows = 0; rows < matrixA.length ; rows++) {
            for (int cols = 0; cols < matrixA[rows].length; cols++) {
                num++;
                matrixA[cols][rows] = num;
            }
        }


        for (int[] ints : matrixA) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        //Pattern B
        for (int rows = 0; rows < matrixB.length; rows++) {

            if(rows % 2 == 0){
                for (int cols = 0; cols < matrixB[rows].length ; cols++) {
                    numB++;
                    matrixB[cols][rows] = numB;
                }
            }else {
                for (int rowsEven = matrixB[rows].length - 1; rowsEven >= 0 ; rowsEven--) {
                    numB++;
                    matrixB[rowsEven][rows] = numB;
                }
            }

        }


        for (int[] ints : matrixB) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }










    }


//    public static void drawPatternA(int numberRowsCols){
//
//        int[][] matrixA = new int[numberRowsCols][numberRowsCols];
//
//        for (int rows = 0; rows < matrixA.length; rows++) {
//            for (int cols = rows + 1; cols < matrixA[0].length; cols++) {
//                System.out.print(cols + " ");
//            }
//            System.out.println();
//        }
//
//    }
//
//
//    public static void drawPatternB(int numberRowsCols){
//
//    }

}

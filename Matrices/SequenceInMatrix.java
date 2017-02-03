package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 21.01.17.
 */
public class SequenceInMatrix {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        //now fill the matrix
        for (int i = 0; i < rows; i++) {
            String[] inp = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
               matrix[i][j] = inp[j];
            }
        }


        int maxCount = 0;
        String repeated = "";


        int rowMaxSeq = 0;

        //check row by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 1; j++) {
                //check row by row
                String currentElementByCol = matrix[i][j];
                String nextElementByCol = matrix[i][j + 1];

                if (currentElementByCol.equals(nextElementByCol)){
                    rowMaxSeq++;
                    if(rowMaxSeq > maxCount){
                        maxCount = rowMaxSeq;
                        repeated = currentElementByCol;
                    }

                }



            }
        }

        int leftDiagMaxSeq = 1;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                String currentDiagonalElement = matrix[i][j];
                String nextDiagonalElement = matrix[i + 1][i + 1];
                if(currentDiagonalElement.equals(nextDiagonalElement)){
                    leftDiagMaxSeq++;
                    if(leftDiagMaxSeq > maxCount){
                        maxCount = leftDiagMaxSeq;
                        repeated = currentDiagonalElement;
                    }
                }else {
                    leftDiagMaxSeq = 1;
                }
            }
        }



        //second way
        //now iterate matrix for second time , this time by diagonal
        for (int i = 0; i < rows - 1; i++) {
            String currentDiagonalElement = matrix[i][i];
            String nextDiagonalElement = matrix[i + 1][i + 1];

            if(currentDiagonalElement.equals(nextDiagonalElement)){
                leftDiagMaxSeq++;
                if(leftDiagMaxSeq > maxCount){
                    maxCount = leftDiagMaxSeq;
                    repeated = currentDiagonalElement;
                }
            }else {
                leftDiagMaxSeq = 1;
            }
        }










        int columnMaxSeq = 1;

        //now iterate column by column
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows - 1; j++) {
                String currentColumn = matrix[j][i];
                String nextColumn = matrix[j + 1][i];


                if(currentColumn.equals(nextColumn)){
                    columnMaxSeq++;
                    if(columnMaxSeq > maxCount){
                        maxCount = columnMaxSeq;
                        repeated = currentColumn;
                    }
                }else {
                    columnMaxSeq = 1;
                }

            }
        }


        for (int i = 0; i < maxCount ; i++) {
            System.out.printf("%s, ", repeated);
        }
//        System.out.println(maxCount);
//        System.out.println(repeated);


         //second variant to fill matrix
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = scanner.next();
//            }
//        }







        //check what is in matrix
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols ; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }



    }


}

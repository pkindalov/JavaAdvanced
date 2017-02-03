package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 19.01.17.
 */
public class SquaresMatrix2x2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        String[][] matrix = new String[num1][num2];

        for (int row = 0; row < num1 ; row++) {
            String[] inp = scanner.nextLine().split(" ");
            for (int col = 0; col < num2; col++) {
                matrix[row][col] = inp[col];
            }

        }

        int count = 0;

        for (int row = 0; row < num1 - 1; row++) {
            for (int col = 0; col < num2 - 1 ; col++) {
                if ((matrix[row][col].equals(matrix[row][col + 1])) &&
                        (matrix[row + 1][col].equals(matrix[row + 1][col + 1])) &&
                        (matrix[row + 1][col].equals(matrix[row][col+1]))){
                    count++;
                }
            }
        }

        System.out.println(count);



//        for (String[] strings : matrix) {
//            for (String string : strings) {
//                System.out.print(string + " ");
//            }
//            System.out.println();
//        }



    }


}

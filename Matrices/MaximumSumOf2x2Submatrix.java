package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 18.01.17.
 */
public class MaximumSumOf2x2Submatrix {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] numbers = new int[rows][cols];
        int sum = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;




        for (int row = 0; row < rows; row++) {
            String[] delimeter = scanner.nextLine().split(", ");
            for (int col = 0; col < cols ; col++) {
                numbers[row][col] = Integer.parseInt(delimeter[col]);
            }
        }


        for (int row = 0; row < numbers.length - 1; row++) {
            for (int col = 0; col < numbers[row].length - 1; col++) {
                if(numbers[row][col] + numbers[row][col + 1] + numbers[row + 1][col] + numbers[row + 1][col + 1] > sum){
                    sum = numbers[row][col] + numbers[row][col + 1] + numbers[row + 1][col] + numbers[row + 1][col + 1];
                    num1 = numbers[row][col];
                    num2 = numbers[row][col + 1];
                    num3 = numbers[row + 1][col];
                    num4 = numbers[row + 1][col + 1];
                }
//                System.out.print(numbers[row][col] + " ");
            }
//            System.out.println();
        }


        System.out.println(num1 + " " + num2);
        System.out.println(num3 + " " + num4);
        System.out.println(sum);




//        for (int[] number : numbers) {
//            for (int num : number) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }



    }


}

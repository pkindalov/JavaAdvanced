package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class MatricesLiveDemo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Filling a Jagged array
        int[][] jagged = new int[5][];

        for (int row = 0; row < jagged.length; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            //jagged[row] = new int[Integer.parseInt(numbers.length)];

            for (int col = 0; col < jagged[row].length; col++) {
                jagged[row][col] = Integer.parseInt(numbers[col]);

            }

        }



    }

}

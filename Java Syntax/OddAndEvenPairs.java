package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 24.01.17.
 */
public class OddAndEvenPairs {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        //fill the empty number array with parsed numbers
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }


        //check initial length of array
        if (numbers.length % 2 != 0){
            System.out.println("invalid length");
        }else {
            //now iterate new array numbers
            for (int i = 0; i < numbers.length; i += 2) {
                int currentNum = numbers[i];
                int nextNum = numbers[i + 1];

                if(currentNum % 2 == 0 && nextNum % 2 != 0){
                    System.out.printf("%d, %d -> different%n", currentNum, nextNum);
                }else if (currentNum % 2 != 0 && nextNum % 2 == 0){
                    System.out.printf("%d, %d -> different%n", currentNum, nextNum);
                }else if(currentNum % 2 == 0 && nextNum % 2 == 0){
                    System.out.printf("%d, %d -> both are even%n", currentNum, nextNum);
                }else if(currentNum % 2 != 0 && nextNum != 0){
                    System.out.printf("%d, %d -> both are odd%n", currentNum, nextNum);
                }


            }
        }






    }

}

package StacksAndQueus;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 20.01.17.
 */
public class BasicQueueOperations {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int elementsToPop = Integer.parseInt(input[1]);
        int numberToFind = Integer.parseInt(input[2]);
        int smallestNumber = Integer.MAX_VALUE;
        boolean findNumber = false;

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        //fill the stack

        String[] secondInput = scanner.nextLine().split(" ");
        for (int i = 0; i < secondInput.length ; i++) {
            int num = Integer.parseInt(secondInput[i]);
            numbers.addLast(num);
        }


        //pop numbers
        for (int a = 0; a < elementsToPop ; a++) {
            numbers.pollLast();
        }


        //now iterate stack to find number or if not the smallest number
        for (Integer number : numbers) {
            if(number == numberToFind){
                findNumber = true;
                break;
            }else {
                if(number < smallestNumber){
                    smallestNumber = number;
                }
            }
        }


        System.out.println();

        if(findNumber){
            System.out.println(findNumber);
        }else if(!findNumber && numbers.size() < 1 ){
            smallestNumber = 0;
            System.out.println(smallestNumber);
        }  else {
            System.out.println(smallestNumber);
        }



    }
}



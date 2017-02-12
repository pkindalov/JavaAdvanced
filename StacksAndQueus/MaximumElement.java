package StacksAndQueus;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 20.01.17.
 */
public class MaximumElement {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxElement = Integer.MIN_VALUE;
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Integer> maxNumbers = new ArrayDeque<>();



        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);

            if(command == 1){
                int numberToPush = Integer.parseInt(input[1]);

                if (numberToPush >= maxElement){
                    maxElement = numberToPush;
                    maxNumbers.push(maxElement);
                }

                numbers.push(numberToPush);

            }else if (command == 2){

                int deletedElement = numbers.pop();
                if(deletedElement == maxElement){
                    maxNumbers.pop();
                    if(!maxNumbers.isEmpty()){
                        maxElement = maxNumbers.peek();
                    }else {
                        maxElement = Integer.MIN_VALUE;
                    }

                }


            }else  if(command == 3){
                System.out.println(maxNumbers.peek());

            }



        }


    }

}

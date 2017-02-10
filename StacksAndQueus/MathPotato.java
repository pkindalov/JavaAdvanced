package StacksAndQueus;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 19.01.17.
 */
public class MathPotato {

    public static void main(String[] args){


            Scanner scanner = new Scanner(System.in);
            String[] children = scanner.nextLine().split("\\s+");
            int n = Integer.parseInt(scanner.nextLine());

            ArrayDeque<String> queue = new ArrayDeque<>();

//            for(String child : children){
//                queue.offer(child);
//            }

            Collections.addAll(queue, children);

            int counter = 1;
            while (queue.size() > 1){
                for (int i = 1; i < n; i++) {
                    queue.offer(queue.poll());
                }


                if(isPrime(counter)){
                    System.out.println("Prime " + queue.peek());
                }else {
                    System.out.println("Removed " + queue.poll());
                }

                counter++;

            }

        System.out.println("Last is " + queue.poll());


        }

    private static boolean isPrime(int counter) {


        if(counter <= 1){
           return false;
        }

        for (int i = 2; i <= Math.sqrt(counter) ; i++) {
            if(counter % i == 0){
                return false;
            }
        }


        return true;

    }


}



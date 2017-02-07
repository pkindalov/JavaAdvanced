package StacksAndQueus;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 19.01.17.
 */
public class DecimalToBinary {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> reminder = new ArrayDeque<>();

        if(num == 0){
            System.out.println(0);
        }

        while (num != 0){
            reminder.push(num % 2);
            num /= 2;
        }


        for (Integer integer : reminder) {
            System.out.print(integer);
        }


    }


}

package StacksAndQueus;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 20.01.17.
 */
public class PalindromChecker {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            queue.offer(c);
        }


        boolean isPalindrom = true;
        while (queue.size() > 1){
            char firstChar = queue.poll();
            char lastChar = queue.pollLast();
            if(firstChar != lastChar){
                isPalindrom = false;
                break;
            }
        }

        System.out.println(isPalindrom);

    }

}

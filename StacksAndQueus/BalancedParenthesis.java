package StacksAndQueus;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 21.01.17.
 */
public class BalancedParenthesis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] braces = scanner.nextLine().toCharArray();
        if (braces.length % 2 != 0){
            System.out.println("NO");
            return;
        }
        Deque<Character> openBraces = new ArrayDeque<>();
        boolean isBalanced = true;

        for (char brace : braces) {

            if (brace == '{' || brace == '[' || brace == '('){
                openBraces.push(brace);
            }else {
                char currentBrace = openBraces.pop();
                if (brace == '}'){
                    brace = '{';
                }

                if (brace == ']'){
                    brace = '[';
                }

                if (brace == ')'){
                    brace = '(';
                }

                if(brace != currentBrace){
                    isBalanced = false;
                    System.out.println("NO");
                    break;
                }
            }


        }

        if(isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

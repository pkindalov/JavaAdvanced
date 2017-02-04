package StacksAndQueus;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by r3v3nan7 on 04.01.17.
 */
public class StacksAndQueues {

    public static void main(String[] args) {
//        LinkedList<Integer> stacksForNumbers = new LinkedList<>();
//        System.out.println(stacksForNumbers.peek());
//
//        stacksForNumbers.add(5);
//        stacksForNumbers.add(14);
//        stacksForNumbers.add(21);
//        stacksForNumbers.add(22);
//
//
//        System.out.println(stacksForNumbers.size());
//
//        System.out.println();
//
//        System.out.println(stacksForNumbers.contains(5));
//
////        System.out.println(stacksForNumbers.peek());
////        System.out.println(stacksForNumbers.peekLast());
//
//        for(int i = 0; i < stacksForNumbers.size(); i++){
//            System.out.println(stacksForNumbers.get(i));
//        }
//
//        System.out.println();
//        stacksForNumbers.pop();
//
//        System.out.println(stacksForNumbers.contains(5));
//        for(Integer numbersInStack : stacksForNumbers){
//            System.out.println(numbersInStack);
//        }
//
//
//        System.out.println(stacksForNumbers.getClass().getName());
//        System.out.println(stacksForNumbers.toArray().getClass().getName());


        Stack<Integer> realStack = new Stack<>();
        Scanner input = new Scanner(System.in);

        int howManyNumbers = input.nextInt();

        for (int n = 0; n < howManyNumbers; n++){
            int num = input.nextInt();
            realStack.add(num);
        }


        for(int n2 = 0; n2 < realStack.size(); n2++){
//            System.out.println(realStack.pop());
            System.out.println(realStack.get(realStack.size() - n2 - 1));
        }

//        for (Integer numbers: realStack
//             ) {
//            System.out.println(numbers);
//        }



    }
}

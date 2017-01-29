package Matrices;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 18.01.17.
 */
public class GroupNumbers {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(", ");

        ArrayList<ArrayList<Integer>> jaggedMatrix = new ArrayList<ArrayList<Integer>>();

        jaggedMatrix.add(0, new ArrayList<>());
        jaggedMatrix.add(1, new ArrayList<>());
        jaggedMatrix.add(2, new ArrayList<>());


        for (String s : input) {
            int currentNumber = Integer.parseInt(s);
            jaggedMatrix.get(Math.abs(currentNumber % 3)).add(currentNumber);

        }

        for (ArrayList<Integer> integers : jaggedMatrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

        
    }
    
}

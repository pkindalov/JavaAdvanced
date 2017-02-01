package Matrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class ReadSortPrintArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int arraySize = Integer.parseInt(scanner.nextLine());
        String[] names = new String[arraySize];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);

        //Reverse - first sort array and then read from back to begin.
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[names.length - i - 1]);
//        }

        for (String name : names) {
            System.out.println(name);
        }

    }

}

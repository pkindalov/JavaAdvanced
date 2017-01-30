package Matrices;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 18.01.17.
 */
public class MatrixOfPalindromes {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
//        String[] letters = {"a", "b", "c", "d", "e",
//                            "f", "g", "h", "i", "j",
//                            "k", "l", "m", "n", "o",
//                            "p", "q", "r", "s", "t",
//                            "u", "v", "w", "x", "y",
//                            "z"
//                            };


        int[][] lettersMatrix = new int[r][c];


        char a = 'a';
        char b = 'a';
        char cc = 'a';


        for (int rows = 0; rows < lettersMatrix.length; rows++) {
            for (int cols = 0; cols < lettersMatrix.length; cols++) {
                System.out.print(a + "" + b + cc  + " ");
                b++;
            }
            a++;
            b = a;
            cc = a;
            System.out.println();


        }


    }


}

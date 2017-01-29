package Matrices;

/**
 * Created by r3v3nan7 on 18.01.17.
 */
public class GroupNumbersSecondVersion {

    public static void main(String[] args){

        int[] numbers = {1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2 };
        int[] sizes = new int[3];
        int[] offsets = new int[3];

        for (int number : numbers) {
            int reminder = number % 3;
            sizes[reminder]++;
        }

        int[][] numbersByRemainder = { new int[sizes[0]], new int[sizes[1]], new int[2]};

        for (int number : numbers) {
            int remainder = number % 3;
            int index = offsets[remainder];
            numbersByRemainder[remainder][index] = number;
            offsets[remainder]++;
        }



    }

}

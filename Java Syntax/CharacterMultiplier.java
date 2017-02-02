package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 24.01.17.
 */
public class CharacterMultiplier {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        long sum = charMultiply(input[0], input[1]);

        System.out.println(sum);
    }


    private static long charMultiply(String str1, String str2){
        long sum = 0;
        int str1Length = str1.length();
        int str2Length = str2.length();
        int biggerStr = Math.max(str1Length, str2Length);




        for (int i = 0; i < biggerStr; i++) {
            if (i < str1Length){
                sum += str1.charAt(i) * str2.charAt(i);
            }else {
                if(str1Length > str2Length){
                    sum += str1.charAt(i);
                }else {
                    sum += str2.charAt(i);
                }

            }
        }



        return sum;

    }


}

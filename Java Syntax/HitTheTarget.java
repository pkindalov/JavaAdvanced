package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 24.01.17.
 */
public class HitTheTarget {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());


        int num2 = 0;
        if(target - 1 > 0){
            num2 = target - 1;
        }

        for (int i = 1; i < 21 ; i++) {
            int num1 = i;


            if(num1 + num2 == target){
                System.out.printf("%d + %d = %d%n", num1, num2, target);
            }else if (num2 + num1 == target){
                System.out.printf("%d + %d = %d%n", num2, num1, target);
            }

            if(num2 > 1){
                num2--;
            }


        }



        //substract
        for (int i = 1; i < 21 ; i++) {
            int n2 = 20;
            for (int j = i; j < 21 ; j++) {
                if(n2 - j == target){
                    System.out.printf("%d - %d = %d%n", n2, j, target);
                }

                if(n2 > 1){
                    n2--;
                }else {
                    continue;
                }
            }
//            if((n2 - i) == target){
////                (i - target) - target == target
//                System.out.printf("%d - %d  = %d%n", n2, i, target);
//            }



        }




    }

}

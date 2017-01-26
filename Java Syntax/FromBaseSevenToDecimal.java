package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 23.01.17.
 */
public class FromBaseSevenToDecimal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        Integer toDecimal = Integer.valueOf(number, 7);

        System.out.println(toDecimal);

    }


}

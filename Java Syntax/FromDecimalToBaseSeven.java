package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 23.01.17.
 */
public class FromDecimalToBaseSeven {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long x = Long.parseLong(scanner.nextLine());
        String numberInBase7 = Long.toString(x, 7);
        int baseToConvertTo = 7;
        System.out.println(Long.toString(x, baseToConvertTo));


    }

}

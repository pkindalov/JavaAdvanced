package JavaSyntax;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class FormattingNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");

        int a = Integer.parseInt(nums[0]);
        double b = Double.parseDouble(nums[1]);
        double c = Double.parseDouble(nums[2]);


        String hex = Integer.toHexString(a).toUpperCase();
        String binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');


        System.out.printf("|%-10s", hex);
        System.out.printf("|%s", binary);
        System.out.printf("|%10.2f", b);
        System.out.printf("|%-10.3f|", c);



    }

}

package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 16.01.17.
 */
public class AverageOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double avg = (num1 + num2 + num3) / 3;

        System.out.printf("%.2f", avg);
    }
}

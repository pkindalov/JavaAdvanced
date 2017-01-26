package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 23.01.17.
 */
public class CalculateExpression {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

       // double formula1 = (Math.pow(a, 2) + Math.pow(b, 2) / Math.pow(a, 2) - Math.pow(b, 2));
        double formula1A = ((a * a) + (b * b)) / ((a * a) - (b * b));
        double formula1B = (a + b + c) / Math.sqrt(c);
        double formula1 = Math.pow(formula1A, formula1B);

//        double formula2A = ((a * a) + (b * b) - (c * c * c));
        double formula2A = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3));
        double formula2B = (a - b);
        double formula2 = Math.pow(formula2A, formula2B);

        double difference = Math.abs((a + b + c) / 3 - (formula1 + formula2) / 2);


        System.out.printf("F1 result: %.2f; ", formula1);
        System.out.printf("F2 result: %.2f; ", formula2);
        System.out.printf("Diff: %.2f", difference);
    }

}

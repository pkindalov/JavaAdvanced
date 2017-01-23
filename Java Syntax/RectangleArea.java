package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class RectangleArea {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        double area = num1 * num2;

        System.out.printf("%.2f", area);
    }

}

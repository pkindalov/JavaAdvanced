package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class CalculateTriangleAreaMethod {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Area = %.2f", triangleArea(base, height));

    }


    public static  double triangleArea(double base, double height){
        return (base * height) / 2;
    }

}

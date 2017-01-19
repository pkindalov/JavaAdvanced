package JavaSyntax;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 16.01.17.
 */
public class EuroTrip {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double quntity = Double.parseDouble(scanner.nextLine());
        double pricePerKg = 1.20;

        BigDecimal priceInLv = new BigDecimal(pricePerKg * quntity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal neededMarks = exchangeRate.multiply(priceInLv);

        System.out.printf("%.2f marks", neededMarks);


    }

}

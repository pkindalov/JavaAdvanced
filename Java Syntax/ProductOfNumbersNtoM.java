package JavaSyntax;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class ProductOfNumbersNtoM {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        BigInteger product = new BigInteger("1");
        int count = n;

        do{
            BigInteger bigNumber = new BigInteger("" +count);
            product = product.multiply(bigNumber);
            count++;
        }while (count <= m);


        System.out.printf("product[%d..%d] = %d", n, m, product);

    }

}

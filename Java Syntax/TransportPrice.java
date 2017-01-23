package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 17.01.17.
 */
public class TransportPrice {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine().toLowerCase();

        double taxiTariff = 0.90;

        if(daytime.equals("day")){
            taxiTariff = 0.79;
        }

        if(km < 20){
            System.out.printf("%.2f", 0.70 + (km * taxiTariff));
        }else if(km < 100){
            System.out.printf("%.2f", km * 0.09);
        }else {
            System.out.printf("%.2f", km * 0.06);
        }

    }

}

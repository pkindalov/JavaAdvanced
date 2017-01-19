package JavaSyntax;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 16.01.17.
 */
public class Greeting {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        if(firstName != null && firstName.isEmpty()){
            firstName = "*****";
        }

        if( lastName != null &&  lastName.isEmpty()){
             lastName = "*****";
        }

        System.out.println("Hello, " +firstName + " " + lastName + "!");


    }


}

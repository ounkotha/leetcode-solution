package class_task;

import java.util.*;

public class Palindrome {

    public static void main(String[] arg){

        String strr, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        strr = in.nextLine();
        int length = strr.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + strr.charAt(i);
        if (strr.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }

}

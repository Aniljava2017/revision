package justforPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original , reverse = "";
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a String/Number to check if it is Palindrome");
        original=in.nextLine();
        int length=original.length();
        for (int i=length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);
        }
            if (original.equals(reverse))
                System.out.println("String/Number is Palindrome");

            else
                System.out.println("String/Number is Not Palindrome");
    }
}

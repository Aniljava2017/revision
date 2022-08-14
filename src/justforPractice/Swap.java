package justforPractice;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter the B Value : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping Output : "+a+" "+b);
    }
}

package justforPractice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int orgi , reme , result=0;
        orgi=num;
        while (orgi!=0){
            reme = orgi % 10 ;
            result += Math.pow(reme,3);
            orgi /= 10;
        }
        if (result == num){
            System.out.println(num+" is an Armstrong Number");
        }
        else
            System.out.println(num+" is not Armstrong Number");
    }
}

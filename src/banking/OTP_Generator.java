package banking;

import java.util.Random;

public class OTP_Generator {
    static char[] OTP(int len){
        System.out.println("Generating OTP Using Random(): ");
        System.out.println("You OTP is : ");
        String number= "0123456789";
        Random ran_method = new Random();
        char [] otp = new char[len];
        for (int i=0;i<len;i++){
            otp[i]=number.charAt(ran_method.nextInt(number.length()));
        }
        return otp;
    }
    public static void main(String[] args) {
        int length =5;
        System.out.println(OTP(length));

    }
}

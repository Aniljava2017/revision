package banking;

import java.util.Random;

public class Password_Generator {
    public static void main(String[] args) {
        int length=10;
        System.out.print(geek_Password(length));
    }
    static char[] geek_Password(int len){
        System.out.println("Generating Random Password  ");
        System.out.print("Your New Password Is : ");
        String Capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXY";
        String Small_chars="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$%^&*()_-+=./?<>";
        String values = Capital_chars + Small_chars + numbers + symbols;
        Random rndm_method = new Random();
        char[] password = new char[len];
        for (int i=0; i<len;i++){
            password[i]=values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
    }
}

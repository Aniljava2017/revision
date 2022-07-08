package stringExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCheck {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        // Array List
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);

        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("A");
        List2.add("A");
        List2.add("A");

        System.out.println("List2: " + List2);
        // Copy List2 to List1
        Collections.copy(List1, List2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);

    }
}

package CollectionsExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("Anil");
        array.add("Sunil");
        array.add("Bunty");
        array.add("Munesh");
        System.out.println(array);
        for (String var: array){
            System.out.println(var);
        }
        Collections.sort(array);
        System.out.println(array);
        array.add(1,"Rinku");//Position First
        System.out.println(array);
        System.out.println(array.size());
        ArrayList<String> array1=new ArrayList<>();
        array1.add("Sambhu");
        array1.add("Sanket");
        array1.add("Babalu");
        array1.add("Lokesh");
        System.out.println(array1);
        array.addAll(array1);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        System.out.println(array.size());
        array.remove(6);
        System.out.println(array);
    }
}

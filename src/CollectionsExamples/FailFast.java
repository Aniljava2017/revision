package CollectionsExamples;

import java.util.HashMap;

public class FailFast {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Anil");
        map.put(2,"Bunty");
        map.put(3,"Lokesh");
        map.put(4,"Rahul");
        for (Object var:map.entrySet()){
            System.out.println("Key and value pair is :: " +var);
            map.put(5,"ramesh");
        }
    }
}

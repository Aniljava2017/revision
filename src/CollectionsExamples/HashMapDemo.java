package CollectionsExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("abc",1);
        hm.put("xyz",1);
        hm.put("",10);
        for (Map.Entry<String, Integer> var:hm.entrySet()){
            System.out.println(var);
        }
        System.out.println(hm.get(""));
       // Integer result = hm.get("pqr");
       // System.out.println(result);
    }
}

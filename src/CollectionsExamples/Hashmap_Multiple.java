package CollectionsExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap_Multiple {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap= new HashMap<>();
        //Create list one and store values
        List<String> list1=new ArrayList<>();
        list1.add("Anil");
        list1.add("Kumar");
        //Create list Second and store values
        List<String> list2=new ArrayList<>();
        list2.add("Bunty");
        list2.add("Babu");
        //Create list Third and store values
        List<String> list3=new ArrayList<>();
        list3.add("Munesh");
        list3.add("Singh");
        // Add Hashmap
        hashMap.put("A",list1);
        hashMap.put("B",list2);
        hashMap.put("C",list3);
        System.out.println("Hashmap : "+hashMap +"\n");
        for (Map.Entry<String,List<String>> entry : hashMap.entrySet()){
            System.out.print("Key : "+entry.getKey());
            System.out.println(" , Value : "+entry.getValue());
//            String key = entry.getKey();
//            List<String> value= entry.getValue();
//            System.out.print("Key : "+key);
//            System.out.println(" , Value : "+value);
        }
    }
}

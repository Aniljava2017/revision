package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapExamp {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Shivam");
        list.add("Kumar");
        list.add("Munesh");
        list.add("Singh");
        list.add("Anil");
        list.add("Kumar");

//        List<String> list1 = list.stream().distinct().collect(Collectors.toList());
//        for (String var:list1){
//            System.out.println(var);
//        }
        List<String> list2=list.stream().filter(t-> Collections.frequency(list,t)>1).collect(Collectors.toList());
        list2.forEach(System.out::println);
    }

}

package CollectionsExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.System.*;

public class Iterator_Example {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> m = new ConcurrentHashMap<>();
        m.put("One",1);
        m.put("Two",2);
        m.put("Three",3);
        m.put("Four",4);

        Iterator it =m.keySet().iterator();
        while (it.hasNext()) {
            String k = (String)it.next();
           // out.println(k + " : " + m.get(k));
            System.out.println(k + " : " + m.get(k));
            m.put("Seven",7);
            m.put("Ten", 10);
            m.put("Five", 5);
            m.put("Six",6);

        }
    }
}

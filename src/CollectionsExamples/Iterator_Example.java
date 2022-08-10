package CollectionsExamples;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Iterator_Example {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> m = new ConcurrentHashMap<>();
        m.put("ONE",1);
        m.put("TWO",2);
        m.put("THREE",3);
        m.put("FOUR",4);
        m.put("five", 5);
        m.put("six",6);
        Iterator it =m.keySet().iterator();
        while (it.hasNext()) {
            String k = (String)it.next();
           // out.println(k + " : " + m.get(k));
            System.out.println(k + " : " + m.get(k));
            m.put("Seven",7);
            m.put("Ten", 10);

        }
    }
}

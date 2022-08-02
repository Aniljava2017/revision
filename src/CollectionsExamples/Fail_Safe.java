package CollectionsExamples;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_Safe {
        public static void main(String[] args)
        {
            // Initializing a ConcurrentHashMap
            ConcurrentHashMap<String, Integer> m
                    = new ConcurrentHashMap<>();
            m.put("ONE", 1); //Adding values
            m.put("SEVEN", 7);
            m.put("FIVE", 5);
            m.put("EIGHT", 8);
            // Getting an iterator using map
            Iterator it = m.keySet().iterator();
            while (it.hasNext()) {
                String key = (String)it.next();
                System.out.println(key + " : " + m.get(key));
                // This will reflect in iterator.
                // This means it has not created separate copy of objects
                m.put("TEN", 10);
            }
        }
    }

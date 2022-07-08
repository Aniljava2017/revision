package CollectionsExamples;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        List<Integer> integers=new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (Integer a : integers) {
            integers.remove(a);
        }
        System.out.println("Final Result :: "+integers);
        integers.add(6);
        System.out.println("Add Values :: "+integers);

    }

}

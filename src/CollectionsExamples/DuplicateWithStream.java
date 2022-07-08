package CollectionsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateWithStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

// Get list without duplicates
        List<String> distinctItems = list.stream()
                .distinct()
                .collect(Collectors.toList());

// Let's verify distinct elements
        System.out.println(distinctItems);
        System.out.println("***********************************");

        List<Integer> lis1= Arrays.asList(2,5,6,7,8,2,5,6,7);

        List<Integer> distnictItem1 = lis1.stream().distinct()
                .collect(Collectors.toList());
        System.out.println(distnictItem1);
        System.out.println("***********************************");

        List<Integer> list2=Arrays.asList(7,8,9,7,8,9,10,5,9);
        List<Integer> disnictItem2 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(disnictItem2);
    }
}

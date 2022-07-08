package CollectionsExamples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args){
            String intArray[][]= {{"A,B,C"},{"1,2,3"}};
            String cloneArray[][] = intArray.clone();
        //System.out.println("Original Array "+Arrays.deepToString(intArray));
// will print false
      /*  for (int i = 0; i < intArray.length; i++) {
            System.out.print(Arrays.deepToString(intArray[i]) + "");
        }
        System.out.println("");
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(Arrays.deepToString(cloneArray[i]) + "");
        }*/
       /* will print true as shallow copy is created
       i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
       */
        Arrays.stream(intArray).map(Arrays::toString).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(cloneArray).map(Arrays::toString).forEach(System.out::print);
    }
}

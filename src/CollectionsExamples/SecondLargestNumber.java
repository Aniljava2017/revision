package CollectionsExamples;

import java.util.Arrays;

public class SecondLargestNumber {

    public static int secondLargest(int[] a, int total){
        Arrays.sort(a);
        return a[total-2];
    }

    public static void main(String[] args) {
        int[] a ={10,2,9,44,50,6,35};
        System.out.println("Second Largest Number :: "+secondLargest(a,7));
    }
}

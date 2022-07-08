package CollectionsExamples;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] a ={4,2,3,6,5,6,7,8,2,4,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] == a[j]){
                    System.out.print(" "+a[j]);
                }
            }
        }
    }
}

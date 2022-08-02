package justforPractice;

public class SecondHighest {
    public static void main(String[] args) {
        int a[]={19,52,23,58,69,87,45,68};
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[1]);
    }
}

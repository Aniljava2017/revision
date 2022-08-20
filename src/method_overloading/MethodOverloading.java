package method_overloading;

public class MethodOverloading {
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int myInt1= plusMethod(5,4);
        double myInt2= plusMethod(5.5,6.6);
        System.out.println(myInt1);
        System.out.println(myInt2);
    }
}

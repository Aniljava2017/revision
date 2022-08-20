package justforPractice;

import java.io.IOException;

public class SubClass extends SuperClass {
    void methode()  {
        System.out.println("SubClass");
    }

    public static void main(String[] args) {
        SuperClass s = new SubClass();
        s.method();
    }

}

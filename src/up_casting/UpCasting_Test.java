package up_casting;

public class UpCasting_Test {
    public static void main(String[] args) {
        Parent p = (Parent) new Child();
        Parent p1= (Parent) new Child();
        p.printData();
        p1.printData();

    }
}

package down_casting;



public class DownCasting_Test {
    public static void main(String[] args) {
        ParentDown pdown = new ChildDown();
        pdown.name="Anil";

        ChildDown c = (ChildDown) pdown;
        c.age=18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.printDown();
    }
}

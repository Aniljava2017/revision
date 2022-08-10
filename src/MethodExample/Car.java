package MethodExample;

public class Car extends Engine {
    public void alto(){
        System.out.print("Car Name Alto :- ");
    }

    public static void main(String[] args) {
        Car obj1= new Car();
        obj1.alto();

        Engine obj=new Engine();
        obj.start();
    }
}

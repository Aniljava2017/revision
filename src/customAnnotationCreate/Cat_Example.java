package customAnnotationCreate;

public class Cat_Example {
    public static void main(String[] args) {
        Cat myCat= new Cat("Stella");
        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is VeryImportant");
        }else {
            System.out.println("This thing is not Important");
        }
    }
}

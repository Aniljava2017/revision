package SingletonExample;

public class SingleObject {

    //create a object of SingleObject class

    private static SingleObject object=new SingleObject();

    // make the constructor private so that this class con not be instantiated

    private SingleObject(){}

    //get the only object available
    public static SingleObject get_instance(){
        return object;
    }

    public void showMessage() {
        System.out.println("hello singleton");
    }

}

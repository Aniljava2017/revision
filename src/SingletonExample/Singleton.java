package SingletonExample;

public class Singleton {
    private static Singleton obj=new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return obj;
    }
    public void message(){
        System.out.println("This is Called Singleton");
    }
}

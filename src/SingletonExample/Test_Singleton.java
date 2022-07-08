package SingletonExample;

public class Test_Singleton {
    public static void main(String[] args) {
        Singleton singleton;
        singleton =Singleton.getInstance();
        singleton.message();
    }
}

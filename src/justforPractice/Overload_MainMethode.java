package justforPractice;

public class Overload_MainMethode {
    public static void main(String[] args) {
        //Overload_MainMethode mmo=new Overload_MainMethode();
        main();
        main("Cow");
        Overload_MainMethode.main(630);
        Overload_MainMethode.main("Hi");
        Overload_MainMethode.main(true);
    }

    public static void main() {
        System.out.println("Hello I am Anil");
    }

    public static void main(int args) {
        System.out.println("Integer Methode Overload");
        System.out.println(args);
    }

    public static void main(String str) {
        System.out.println("String Methode Overload");
        System.out.println(str);
    }

    public static void main(boolean args) {
        if (args) {
            System.out.println("Boolean Methode Overload");
            System.out.println(args);
        }
    }
}

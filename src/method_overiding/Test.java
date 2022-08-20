package method_overiding;

public class Test {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Pnb p = new Pnb();
        Axis a = new Axis();
        System.out.println("State Bank getInterest : "+s.getInterest());
        System.out.println("Pnb Bank getInterest : "+p.getInterest());
        System.out.println("Axis Bank getInterest : "+a.getInterest());
    }
}

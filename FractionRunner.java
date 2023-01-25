public class FractionRunner {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(7, 7);
        Fraction f2 = new Fraction(7, 7);
        System.out.println(f1);
        System.out.println(f2);
        f1.add(f2);
        System.out.println(f1);
        f1.reduce();
        System.out.println(f1);
    }
}
package main.topFifty.sqrt;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(getSqrt(8));
    }
    //по Ньютону
    private static double getSqrt(int a) {
        double t;
        double root = a / 2;

        do {
            t = root;
            root = (t + a / t) / 2;
        } while ((t - root) != 0);
        return root;
    }
}

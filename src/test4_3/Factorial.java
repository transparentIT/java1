package test4_3;

public class Factorial {
    public static void main(String[] args) {
        //
    }

    static long factorial(long n) {
        return (n == 0 ? 1 : n * factorial(n-1));
    }
}

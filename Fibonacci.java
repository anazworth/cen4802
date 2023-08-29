public class Fibonacci {
    public static void main(String[] args) {
        final int N = 10;
        int fib = fibonacci(N);

        System.out.println("The " + N + "th Fibonacci number is " + fib + ".");
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

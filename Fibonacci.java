public class Fibonacci {
    public static void main(String[] args) {
        final int N = 10;
        int fib = fibonacci(N);

        System.out.println("The " + N + "th Fibonacci number is " + fib + ".");
    }

    /**
     * Returns the nth Fibonacci number using recursion.
     * 
     * @precondition n >= 0
     * @param n, the nth Fibonacci number to return
     * @return the nth Fibonacci number (0, 1, 1, 2, 3, 5, 8, 13, 21, ...)
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

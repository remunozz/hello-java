public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 100;
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Termino " + (i + 1) + ": " + fibonacci[i]);
        }
    }
}
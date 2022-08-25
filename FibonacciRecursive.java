import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayisini Giriniz: ");
        int sayi = input.nextInt();

        System.out.println(fibonacci(sayi));
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

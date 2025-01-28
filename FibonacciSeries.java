import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}




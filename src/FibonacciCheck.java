import java.util.Scanner;

public class FibonacciCheck {

    public static boolean pertenceFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true; // 0 e 1 estão na sequência
        }

        int a = 0, b = 1;
        int fib = a + b;

        while (fib < num) {
            a = b;
            b = fib;
            fib = a + b;
        }

        return fib == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
        int num = scanner.nextInt();

        if (pertenceFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
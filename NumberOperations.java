package number_operations;

public class NumberOperations {

    // Task a: Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Task b: Generate Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 1, b = 2;
        System.out.print("First " + terms + " terms of Fibonacci sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Task c: Sum of even-valued terms in Fibonacci sequence up to four million
    public static int sumEvenFibonacci(int limit) {
        int a = 1, b = 2, sum = 0;
        while (a <= limit) {
            if (a % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Task a: Display prime numbers between 1 and 500
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Task b: Generate and display first 10 terms of Fibonacci sequence
        generateFibonacci(10);

        // Task c: Sum of even-valued terms in Fibonacci sequence whose values do not exceed four million
        int limit = 4000000;
        int sum = sumEvenFibonacci(limit);
        System.out.println("Sum of even-valued Fibonacci terms not exceeding " + limit + ": " + sum);
    }
}

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // Taking 15 integer inputs from the user
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        // a) Printing the values stored in the array
        System.out.println("Values in the array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // b) Checking if a number is present in the array
        System.out.println("Enter a number to check if it is in the array:");
        int number = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (array[i] == number) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // c) Creating another array with elements in reverse order
        int[] reverseArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reverseArray[i] = array[14 - i];
        }
        System.out.println("Values in the reversed array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();

        // d) Getting the sum and product of all elements in the array
        int sum = 0;
        long product = 1;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
}

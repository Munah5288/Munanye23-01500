package mypackage;

public class MyClass {
    private int number;

    // Constructor
    public MyClass(int number) {
        this.number = number;
    }

    // Non-static method
    public void displayNumber() {
        System.out.println("The number is: " + number);
    }

    // Static method 1
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Static method 2
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass(42);
        
        // Calling the non-static method using the object
        obj.displayNumber();

        // Calling static methods
        MyClass.printMessage("Hello, world!");
        int sum = MyClass.addNumbers(5, 7);
        System.out.println("The sum of 5 and 7 is: " + sum);
    }
}

package triangle_area;

import java.util.Scanner;

public class TriangleAreaCalculator {
    private double base;
    private double height;

    public void getDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }

    public double computeArea() {
        return 0.5 * base * height;
    }

    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.getDimensions();
        double area = calculator.computeArea();
        calculator.displayArea(area);
    }
}

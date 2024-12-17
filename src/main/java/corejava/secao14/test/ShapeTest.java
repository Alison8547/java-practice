package corejava.secao14.test;

import corejava.secao14.domain.Circle;
import corejava.secao14.domain.Rectangle;
import corejava.secao14.domain.Shape;
import corejava.secao14.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        System.out.println("Enter the number of shapes: ");
        int numberOfShapes = scannerInt.nextInt();

        for (int i = 1; i <= numberOfShapes; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            String rectangleOrCircle = scanner.nextLine().toLowerCase();
            System.out.println("Color (BLACK/BLUE/RED)?");
            Color color = Color.valueOf(scanner.nextLine().toUpperCase());

            if (rectangleOrCircle.charAt(0) == 'r') {
                System.out.println("Width: ");
                Double width = scannerDouble.nextDouble();
                System.out.println("Height: ");
                Double height = scannerDouble.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.println("Radius: ");
                Double radius = scannerDouble.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }
    }
}

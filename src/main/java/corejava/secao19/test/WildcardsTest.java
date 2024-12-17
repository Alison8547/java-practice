package corejava.secao19.test;

import corejava.secao19.domain.Circle;
import corejava.secao19.domain.Rectangle;
import corejava.secao19.domain.Shape;

import java.util.ArrayList;
import java.util.List;

public class WildcardsTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        System.out.println(totalArea(shapes));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;

        for (Shape shape : list) {
            sum += shape.area();
        }

        return sum;
    }
}

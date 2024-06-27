package secao20.test;

import secao19.domain.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StreamExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path file:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Product> products = new ArrayList<>();
            while (line != null) {
                String[] lines = line.split(",");
                String name = lines[0];
                Double price = Double.parseDouble(lines[1]);
                products.add(new Product(name, price));
                line = br.readLine();
            }

            double average = products.stream()
                    .mapToDouble(Product::getPrice)
                    .average()
                    .getAsDouble();

            List<String> namesOrder = products.stream()
                    .filter(p -> p.getPrice() < average)
                    .sorted(Comparator.reverseOrder())
                    .map(Product::getName)
                    .toList();

            System.out.printf("Average price: %.2f\n", average);
            for (String name : namesOrder) {
                System.out.println(name);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


package secao19.test;

import secao19.domain.Product;
import secao19.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Alison\\Downloads\\test.txt";
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String csv = br.readLine();

            while (csv != null) {
                String[] csvLines = csv.split(",");
                products.add(new Product(csvLines[0], Double.parseDouble(csvLines[1])));
                csv = br.readLine();

            }

            System.out.println("Most expensive: ");
            System.out.println(CalculationService.max(products));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

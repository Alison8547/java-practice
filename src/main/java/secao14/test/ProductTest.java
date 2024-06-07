package secao14.test;

import secao14.domain.ImportedProduct;
import secao14.domain.Product;
import secao14.domain.UsedProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);
    private static final DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int numberOfProducts = scannerInt.nextInt();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            String escolha = scanner.nextLine();

            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Price: ");
            double price = scannerDouble.nextDouble();

            if (escolha.charAt(0) == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = scannerDouble.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (escolha.charAt(0) == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate localDate = LocalDate.parse(scanner.nextLine(), dtf1);
                products.add(new UsedProject(name, price, localDate));
            } else {
                products.add(new Product(name, price));
            }

        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

    }
}

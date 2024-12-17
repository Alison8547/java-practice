package corejava.secao13.test;

import corejava.secao13.domain.Client;
import corejava.secao13.domain.Order2;
import corejava.secao13.domain.OrderItem;
import corejava.secao13.domain.Product;
import corejava.secao13.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderTest2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter cliente data:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Birth date (DD/MM/YYYY):");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), dtf1);
        System.out.println("Enter order data:");
        System.out.println("Status: " + OrderStatus.PROCESSING);
        System.out.println("How many items to this order? ");
        int count = scannerInt.nextInt();
        Order2 order = new Order2(LocalDateTime.now(), OrderStatus.PROCESSING, new Client(name, email, birthDate));

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            System.out.println("Product price: ");
            Double productPrice = scannerDouble.nextDouble();
            System.out.println("Quantity: ");
            int quantity = scannerInt.nextInt();
            order.addItem(new OrderItem(quantity, new Product(productName, productPrice)));

        }

        System.out.println(order);

    }
}

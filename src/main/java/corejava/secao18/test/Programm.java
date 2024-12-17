package corejava.secao18.test;

import corejava.secao18.domain.BrazilTaxService;
import corejava.secao18.domain.CarRental;
import corejava.secao18.service.RentalService;
import corejava.secao18.domain.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programm {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.println("Retirada (dd/MM/yyyy HH:mm:ss): ");
        LocalDateTime retirada = LocalDateTime.parse(scanner.nextLine(), dtf3);
        System.out.println("Retorno (dd/MM/yyyy HH:mm:ss): ");
        LocalDateTime retorno = LocalDateTime.parse(scanner.nextLine(), dtf3);
        System.out.println("Enter price per hour: ");
        Double pricePerHour = scannerDouble.nextDouble();
        System.out.println("Enter price per day: ");
        Double pricePerDay = scannerDouble.nextDouble();

        CarRental carRental = new CarRental(retirada, retorno, new Vehicle(modelo));
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);


        System.out.println("INVOICE: ");
        System.out.printf("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Total payment: %.2f%n", carRental.getInvoice().totalPayment());
    }
}

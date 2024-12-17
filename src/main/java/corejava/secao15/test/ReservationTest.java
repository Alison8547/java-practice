package corejava.secao15.test;

import corejava.secao15.domain.Reservation;
import corejava.secao15.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReservationTest {
    private static final DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("Room number: ");
            Integer roomNumber = scannerInt.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy):");
            LocalDate checkin = LocalDate.parse(scanner.nextLine(), dtf3);
            System.out.println("Check-out date (dd/MM/yyyy):");
            LocalDate checkout = LocalDate.parse(scanner.nextLine(), dtf3);
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy):");
            LocalDate updateCheckin = LocalDate.parse(scanner.nextLine(), dtf3);
            System.out.println("Check-out date (dd/MM/yyyy):");
            LocalDate updateCheckout = LocalDate.parse(scanner.nextLine(), dtf3);
            reservation.updateDate(updateCheckin, updateCheckout);
            System.out.println(reservation);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }

    }
}

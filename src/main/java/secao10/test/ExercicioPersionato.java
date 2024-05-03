package secao10.test;

import secao10.domain.Rent;

import java.util.Scanner;

public class ExercicioPersionato {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many rooms will be rented? ");
        int rooms = scannerInt.nextInt();
        int count = 0;
        Rent[] rents = new Rent[10];

        for (int i = 0; i < rooms; i++) {
            System.out.println("Rent #" + (++count));
            Rent rent = new Rent();
            System.out.println("name: ");
            rent.setName(scanner.nextLine());
            System.out.println("Email: ");
            rent.setEmail(scanner.nextLine());
            System.out.println("Room: ");
            rent.setRoom(scannerInt.nextInt());

            rents[rent.getRoom()] = rent;
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.printf("%d: %s, %s%n", rents[i].getRoom(), rents[i].getName(), rents[i].getEmail());
            }
        }


    }
}

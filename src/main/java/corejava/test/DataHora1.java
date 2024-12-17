package corejava.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora1 {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        LocalDate data4 = LocalDate.parse("2023-02-11");
        LocalDateTime date5 = LocalDateTime.parse("2023-02-22T13:40:22");
        Instant date6 = Instant.parse("2023-02-23T13:22:43Z");
        Instant date7 = Instant.parse("2023-02-24T13:22:43-03:00");


        LocalDate date8 = LocalDate.parse("25/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime date9 = LocalDateTime.parse("25/05/2024 14:38", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate date10 = LocalDate.of(2024, 5, 25);
        LocalDateTime date11 = LocalDateTime.of(2024, 5, 25, 15, 1, 0);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

        System.out.println(data4);
        System.out.println(date5);
        System.out.println(date6);
        System.out.println(date7);
        System.out.println(date8);
        System.out.println(date9);
        System.out.println(date10);
        System.out.println(date11);


    }
}

package corejava.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
        Instant instant = Instant.now();
        Instant instant2 = Instant.parse("2020-01-02T02:15:30Z");

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println(ld.format(dtf1));
        System.out.println(ldt.format(dtf2));
        System.out.println(dtf3.format(instant));
        System.out.println(dtf3.format(instant2));
        System.out.println(ldt.format(dtf4));
        System.out.println(dtf5.format(instant2));
    }
}

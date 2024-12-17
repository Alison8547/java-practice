package corejava.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();


        LocalDate pastWeekLocalDate = localDate.minusDays(7);
        LocalDate pastMonthLocalDate = localDate.minusMonths(1);
        LocalDate pastYearLocalDate = localDate.minusYears(1);

        LocalDateTime futureHoursLocalDateTime = localDateTime.plusHours(3);
        LocalDateTime futureMinutesLocalDateTime = localDateTime.plusMinutes(3);

        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        Instant futureWeekInstant = instant.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekLocalDate);
        System.out.println(pastMonthLocalDate);
        System.out.println(pastYearLocalDate);

        System.out.println();

        System.out.println(futureHoursLocalDateTime);
        System.out.println(futureMinutesLocalDateTime);

        System.out.println();

        System.out.println(pastWeekInstant);
        System.out.println(futureWeekInstant);

        Duration d1 = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());
        Duration d2 = Duration.between(localDateTime, futureMinutesLocalDateTime);
        Duration d3 = Duration.between(pastWeekInstant, instant);


        System.out.println("dia = " + d1.toDays());
        System.out.println("minutos = " + d2.toMinutes());
        System.out.println("dia = " + d3.toDays());

    }
}

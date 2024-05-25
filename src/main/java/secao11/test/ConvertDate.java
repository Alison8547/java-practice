package secao11.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();


        LocalDate ld = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate ld2 = LocalDate.ofInstant(instant, ZoneId.of("Japan"));
        LocalDateTime ldt1 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime ldt2 = LocalDateTime.ofInstant(instant, ZoneId.of("Japan"));


        System.out.println(instant);
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println(ldt1);
        System.out.println(ldt2);

        System.out.println("---");

        System.out.println("dia = " + localDate.getDayOfMonth());
        System.out.println("mes = " + localDate.getMonthValue());
        System.out.println("ano = " + localDate.getYear());

        System.out.println("hora = " + localDateTime.getHour());
        System.out.println("minuto = " + localDateTime.getMinute());
        System.out.println("segundo = " + localDateTime.getSecond());


//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
    }
}

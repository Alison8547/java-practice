package secao14.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProject extends Product {
    private LocalDate manufactureDate;
    private final DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProject(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProject() {
        super();
    }

    @Override
    public String priceTag() {
        String date = "(Manufacture date: " + manufactureDate.format(dtf3) + ")";
        String format = String.format("%s (used) $ %.2f ", name, price);

        return format + date;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}

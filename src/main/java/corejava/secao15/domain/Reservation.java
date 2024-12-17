package corejava.secao15.domain;

import corejava.secao15.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    private static final DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
        LocalDate now = LocalDate.now();

        if (checkin.isBefore(now)) {
            throw new DomainException("Error in reservation: date check-in cannot be before the current date! ");
        }

        if (checkout.isEqual(checkin) || checkout.isBefore(checkin)) {
            throw new DomainException("Error in reservation: date check-out cannot be before check-in or date check-out equals check-in! ");
        }

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Reservation() {
    }

    public long duration() {
        return checkout.toEpochDay() - checkin.toEpochDay();
    }

    public void updateDate(LocalDate checkin, LocalDate checkout) throws DomainException {
        if (checkin.isBefore(this.checkin) || checkout.isBefore(this.checkout)) {
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        }
        if (checkout.isEqual(checkin) || checkout.isBefore(checkin)) {
            throw new DomainException("Error in reservation: date check-out cannot be before check-in or date check-out equals check-in! ");
        }
        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber +
                ", check-in: " + dtf3.format(checkin) +
                ", check-out: " + dtf3.format(checkout) +
                ", " + duration() + " night(s)";
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }


    public LocalDate getCheckout() {
        return checkout;
    }


}

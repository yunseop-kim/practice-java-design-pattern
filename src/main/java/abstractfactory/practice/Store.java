package abstractfactory.practice;

import java.util.ArrayList;

public class Store {
    private String name;
    private String telephoneNumber;
    private ArrayList<Reservation> reservations;

    Store(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.reservations = new ArrayList<Reservation>();
    }

    public ArrayList<Reservation> getReservations() {
        for (Reservation r : reservations) {
            System.out.println(name + "의 예약: " + r.getReserveDate() + "시에 " + r.getGuest().getName() + "손님 예약");
        }
        return reservations;
    }

    public boolean validate(Reservation reservation) {
        System.out.println(reservation + "에 예약 가능한지 확인합니다.");
        return true;
    }

    public void putReservation(Reservation reservation) throws Exception {
        if (!this.validate(reservation)) {
            throw new Exception("예약이 불가능합니다.");
        }
        this.reservations.add(reservation);
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
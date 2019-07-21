package abstractfactory.practice;

import java.util.Date;

public class Reservation {
    protected Date reserveDate;
    protected Guest guest; 
    
    Reservation(Date reserveDate, Guest guest) {
        this.reserveDate = reserveDate;
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public Date getReserveDate() {
        return reserveDate;
    }
}
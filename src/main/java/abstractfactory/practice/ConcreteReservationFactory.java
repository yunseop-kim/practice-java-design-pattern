package abstractfactory.practice;

import java.util.Date;

public class ConcreteReservationFactory implements AbstractReservationFactory {
    private Store store;
    private Reservation reservation;

    ConcreteReservationFactory(Store store, Date date, Guest guest) {
        this.store = store;
        this.reservation = new Reservation(date, guest);
    }

    @Override
    public void register() throws Exception {
        this.store.putReservation(reservation);
    }

}
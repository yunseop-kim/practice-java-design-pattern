package abstractfactory.practice;

public class ConcreteEnQueueFactory implements AbstractReservationFactory {
    private Store store;
    private QueueReservation reservation;

    ConcreteEnQueueFactory(Store store, QueueingGuest guest) {
        this.store = store;
        this.reservation = new QueueReservation(guest);
    }

    @Override
    public void register() throws Exception {
        this.store.putReservation(reservation);
    }

}
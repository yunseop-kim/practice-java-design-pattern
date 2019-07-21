package abstractfactory.practice;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        try {
            Store store1 = new Store("음식점", "02-123-1234");
            Store store2 = new Store("줄서는 음식점2", "02-123-4321");
            ReserveGuest guest1 = new ReserveGuest("김철수", "010-1234-1234", null, null);
            QueueingGuest guest2 = new QueueingGuest("김민수", "010-1234-1234", null, null);
            
            ConcreteReservationFactory factory1 = new ConcreteReservationFactory(store1, new Date(2019, 7, 30), guest1);
            ConcreteEnQueueFactory factory2 = new ConcreteEnQueueFactory(store2, guest2);
            factory1.register();
            factory2.register();

            store1.getReservations();
            store2.getReservations();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
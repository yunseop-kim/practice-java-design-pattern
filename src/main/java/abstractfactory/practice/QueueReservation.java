package abstractfactory.practice;

import java.util.Date;

public class QueueReservation extends Reservation {

    QueueReservation(QueueingGuest guest) {
        // 현재 시간을 등록한다.
        super(new Date(), guest);
	}
}
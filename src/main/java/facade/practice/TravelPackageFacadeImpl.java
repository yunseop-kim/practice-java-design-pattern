package facade.practice;

public class TravelPackageFacadeImpl implements TravelPackageFacade {

    @Override
    public void book() {

        TrasferBooking trasferBooking = new TrasferBookingImpl();
        trasferBooking.book();

        HotelBooking hotelBooking = new HotelBookingImpl();
        hotelBooking.book();

        FlightBooking flightBooking = new FlightBookingImpl();
        flightBooking.book();

        System.out.println("Travel package booked successfully");
    }

}

public class Guest extends User{
    BookingService booking;
    Search search;

    public boolean bookticket(){
        return true;
    }
    public boolean cancelBooking(){
        return true;
    }
}

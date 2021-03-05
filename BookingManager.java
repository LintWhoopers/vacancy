import java.util.ArrayList;

public class BookingManager {
    ArrayList<Booking> b = new ArrayList<>();

    public static BookingManager bookingManagerInstance;

    private BookingManager() {
    }

    public static BookingManager getInstanceOfBookingManager() {
        if (bookingManagerInstance == null)
            bookingManagerInstance = new BookingManager();
        return bookingManagerInstance;
    }

    void addBooking(Booking obj) {
        b.add(obj);
    }

    void confirmBooking(int bookingID) {
        int i;
        for (i = 0; i < b.size(); i++) {
            if (b.get(i).getBookingID() == bookingID) {
                b.add(b.get(i));
            }
        }
        if (i == b.size())
            System.out.println("Booking not found");
    }

    void denyBooking(int bookingID) {
        int i;
        for (i = 0; i < b.size(); i++) {
            if (b.get(i).getBookingID() == bookingID) {
                b.remove(b.get(i));
            }
        }
        if (i == b.size())
            System.out.println("Booking not found");
    }

}



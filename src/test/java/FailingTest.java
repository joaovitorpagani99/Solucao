import org.junit.Test;
import static org.junit.Assert.*;

    public class FailingTest {
        @Test
        public void test1() throws ParseException {
            HotelReservation Hotel = new HotelReservation();
            assertEquals("Lakewood", Hotel.getCheapestHotel("Regular: 16/03/2009, 17/03/2009, 18/03/2009"));
        }
        @Test
        public void test2() throws ParseException {
            HotelReservation Hotel = new HotelReservation();
            assertEquals("Bridgewood", Hotel.getCheapestHotel("Regular: 20/03/2009, 21/03/2009, 22/03/2009"));
        }
        @Test
        public void test3() throws ParseException {
            HotelReservation Hotel = new HotelReservation();
            assertEquals("Ridgewood", Hotel.getCheapestHotel("Reward: 26/03/2009, 27/03/2009, 28/03/2009"));
        }
    }   





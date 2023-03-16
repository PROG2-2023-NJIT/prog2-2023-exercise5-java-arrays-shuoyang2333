package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        String departureDate = "2023-03-12";
        LocalDate departureDate1 = LocalDate.parse(departureDate);
        String returnDate = "2023-03-14";
        LocalDate returnDate1 = LocalDate.parse(returnDate);
        String random = "FOFO"+Math.random()+"IN";
        String substring = random.substring(random.length()-4);
        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT" ;
        String destinationAirport = "OULU AIRPORT";
        FlightBooking fb = new FlightBooking("John Doe", departureDate1, returnDate1, 1, 3);
        int expResult = 4;
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        fb.setPassengerFullName("John Doe");
        fb.setTicketNumber("MU759435");
        fb.setTripSource("NanJing") ;
        fb.setTripDestination("OULU");
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartingDate(LocalDate.parse("2023-03-12"));
        fb.setReturnDate(LocalDate.parse("2023-03-14"));
        fb.setTotalTicketPrice(5500);


        System.out.println("Dear"+" "+fb.getPassengerFullName() + "."+"Thank you for booking your flight with"+" "+fb.getFlightCompany());
        System.out.println("Following are the details of your booking and the trip:");        
        System.out.println("Ticket Number: "+fb.getTicketNumber());        
        System.out.println("From"+" "+fb.getTripSource()+" to "+fb.getTripDestination());        
        System.out.println("Date of departure:" + fb.getDepartingDate());
        System.out.println("Date of return: " + fb.getReturnDate());        
        System.out.println("Total passengers: " + fb.getTotalPassengers());       
        System.out.println("Total ticket price in Euros: "+fb.getTotalTicketPrice());       
    }
}


    
}

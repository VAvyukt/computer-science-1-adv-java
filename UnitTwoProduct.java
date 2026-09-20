//Name: Vivaan Agrawal
//Period: 3A
public class UnitTwoProduct {
    public static void main(String[] args) {   
        String beginningSpace = "# ";
        System.out.println("#".repeat(51));

        //Border Creation

        System.out.println(String.format("%-41s", "#") + String.format("%-9s", "#") + "#");

        //Declaration of Airline Name

        String airlineName = "Air Zephyr";

        //Printing of the overall structure of the boarding pass

        System.out.println(beginningSpace + "   " + airlineName.toUpperCase() + "     " + "Boarding Pass".toUpperCase() + "        #" + "  Seat  #".toUpperCase());
        System.out.println(String.format("%-41s", "#") + String.format("%-9s", "#") + "#");
        System.out.println("#".repeat(51));

        //Declaration of the seat number of the passenger

        String seatNumber = "1A";

        //Printing the seat number

        System.out.println(String.format("%-41s", "#") + "#   " + seatNumber +"   #");

        //Declaring all of the passenger/flight information in variables
        String passengerName = "Vivaan Agrawal";
        String routeCode = "dfw-lax";
        String flightNumber = "az 108";
        String passengerClass = "First";
        int hoursInFlight = 3;
        int minutesInFlight = 15;
        int taxiTime = 20;
        double bagWeight = 40.5;
        double domesticFlightBagFee = 50;
        int routeCodeLength = flightNumber.length();

        //Printing out all of the passenger/flight information on the boarding pass.

        System.out.println(beginningSpace + String.format("%-12s", "Passenger".toUpperCase()) + passengerName.toUpperCase());
        System.out.println(beginningSpace + String.format("%-12s", "Route".toUpperCase()) + routeCode.toUpperCase());
        System.out.println(beginningSpace + String.format("%-12s", "Flight".toUpperCase()) + flightNumber.toUpperCase());
        System.out.println(String.format("%-41s", "#") + "#--------#");
        System.out.println(String.format(beginningSpace + "%-12s", "Duration".toUpperCase()) + hoursInFlight + " hr " + (minutesInFlight + 2*taxiTime) + " min");
        System.out.println(beginningSpace + " " + "(includes " + taxiTime + "m taxi both airports) #");
        System.out.println(beginningSpace + String.format("%-12s", "Bag".toUpperCase()) + bagWeight + " lb");
        System.out.println(beginningSpace + String.format("%-12s", "Bag Fee".toUpperCase()) + String.format("$%,.2f", domesticFlightBagFee));
        System.out.println(beginningSpace + String.format("%-12s", "Flight Num".toUpperCase()) + routeCodeLength + " characters");
        System.out.println(String.format("%-41s", "#") + "# " + passengerClass.toUpperCase() +" #");
        System.out.println("#".repeat(51));
    }
}
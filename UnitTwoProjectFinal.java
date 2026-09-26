//Name: Vivaan Agrawal
//Period: 3A
import java.util.Scanner;
public class UnitTwoProjectFinal
{
public static void main(String[] args)
{
// ========== SETUP ==========
Scanner keyboard = new Scanner(System.in);

// ========== CONSTANTS ==========
String beginningSpace = "# ";
final String AIRLINE_NAME = "Air Zephyr";
final int MINUTES_PER_HOUR = 60;
final double DOMESTIC_BAG_FEE_PER_POUND = 1.75;
int taxiTime = 20;
String flightNumber = "az 108";
int flightDuration = 195;

// ========== QUESTIONS / PROMPTS ==========
System.out.println("Welcome to Air Zephyr!");
System.out.println("");

System.out.print("Enter your full government name: ");
String passengerName = keyboard.nextLine();

System.out.println("Enter your seat number");
System.out.print("(1-2 numbers, followed by a letter; for example: 13A): ");

String seatNumber = keyboard.nextLine();
String seatSpace;

System.out.print("Enter your departure airport code (For example: Dfw): ");
String departureAirport = keyboard.nextLine();

System.out.print("Enter your arrival airport code (For example: Lax): ");
String arrivalAirport = keyboard.nextLine();

System.out.print("Enter the weight of your bag (in lbs): ");
double bagWeight = keyboard.nextDouble();
keyboard.nextLine();

System.out.println("Enter your class (First, Bus, or Econ): ");
String passengerClass = keyboard.nextLine();
String classSpace = "";

// ========== CALCULATIONS ==========
flightDuration += (2*taxiTime);
String routeCode = departureAirport + "-" + arrivalAirport;
int flightDurationHours = flightDuration/MINUTES_PER_HOUR;
int flightDurationMinutes = flightDuration%MINUTES_PER_HOUR;
double bagFee = DOMESTIC_BAG_FEE_PER_POUND*bagWeight;
int routeCodeLength = flightNumber.length();

// ========== CLEAR THE SCREEN ==========
// Wipes the questions so only the receipt shows.
System.out.print("\f");

// ========== OUTPUT ==========
//Border Creation
System.out.println("#".repeat(51));
System.out.println(String.format("%-41s", "#") + String.format("%-9s", "#")
+ "#");
System.out.println(beginningSpace + AIRLINE_NAME.toUpperCase() + "     " + "Boarding Pass".toUpperCase() + " #" + " Seat #".toUpperCase());
System.out.println(String.format("%-41s", "#") + String.format("%-9s", "#") + "#");
System.out.println("#".repeat(51));

//Passenger Info
if(seatNumber.length() == 2) {
    seatSpace = "   ";
}
else {
    seatSpace = "  ";
}
System.out.println(String.format("%-41s", "#") + "#   " + seatNumber.toUpperCase() + seatSpace + "#");
System.out.println(beginningSpace + String.format("%-12s", "Passenger".toUpperCase()) + passengerName.toUpperCase());
System.out.println(beginningSpace + String.format("%-12s", "Route".toUpperCase()) + routeCode.toUpperCase());
System.out.println(beginningSpace + String.format("%-12s", "Flight".toUpperCase()) + flightNumber.toUpperCase());
System.out.println(String.format("%-41s", "#") + "#--------#");
System.out.println(String.format(beginningSpace + "%-12s", "Duration".toUpperCase()) + (flightDurationHours) + " hr " + (flightDurationMinutes) + " min");
System.out.println(beginningSpace + " " + "(includes " + taxiTime + "m taxi both airports) #");
System.out.println(beginningSpace + String.format("%-12s", "Bag".toUpperCase()) + bagWeight + " lb");
System.out.println(beginningSpace + String.format("%-12s", "Bag Fee".toUpperCase()) + String.format("$%,.2f", (bagFee)));
System.out.println(beginningSpace + String.format("%-12s", "Flight Num".toUpperCase()) + routeCodeLength + " characters");
if(passengerClass.length() == 5) {
    classSpace = "  ";
}
else if(passengerClass.length() == 3) {
    classSpace = "    ";
}
else {
    classSpace = "   ";
}
System.out.println(String.format("%-41s", "#") + "# " + passengerClass.toUpperCase() + classSpace + "#");
System.out.println("#".repeat(51));
}
}
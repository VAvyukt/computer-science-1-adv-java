//Name: Vivaan Agrawal
//Period: 3A

public class UnitTwoLevelUp {
    public static void main (String[] args) 
    {
        //LU1
        int days = 100;
        int weeks = days / 7;
        int daysLeftOver = days % 7;
        System.out.print(days);
        System.out.print(" days is ");
        System.out.print(weeks);
        System.out.print(" weeks and ");
        System.out.print(daysLeftOver);
        System.out.println(" days.");
        System.out.println("");

        //LU2
        int totalSeconds = 7385;
        int hours = totalSeconds / 3600;
        int minutesLeftOver = (totalSeconds % 3600) / 60;
        int secondsLeftOver = totalSeconds % 60;
        System.out.print(hours);
        System.out.print(" hours, ");
        System.out.print(minutesLeftOver);
        System.out.print(" minutes, ");
        System.out.print(secondsLeftOver);
        System.out.println(" seconds.");
        System.out.println("");

        //LU3
        int totalPoints = 17;
        int numAssignments = 4;
        double average = (double)totalPoints/numAssignments;
        System.out.print("Average: ");
        System.out.println(average);
        System.out.println("");

        //LU4
        double mealCost = 47.85;
        int people = 4;
        double costPerPerson = mealCost / people;
        System.out.print("Each person owes ");
        System.out.println(costPerPerson); //To fix the $ rounding issue, we would have to truncate this value to two decimal places, which is not currently being done in this code.
        System.out.println("");

        //LU5
        int number = 472;
        System.out.println(number%10);
        System.out.println((number/10)%10);
        System.out.println(number/100);
        System.out.println("");

        //LU6
        int cents = 287;
        int quarters = cents / 25;
        int dimes = (cents % 25) / 10;
        int nickels = ((cents % 25) % 10) / 5;
        int pennies = (((cents % 25) % 10) % 5) / 1;
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println(pennies + " penny(s)");
    }
}

//Name: Vivaan Agrawal
//Period: 3A
 
public class JavaPractice2A
{
    public static void main(String[] args)
    {
        //Challenge 1, Cash Register
        double currentCash = 107.63;
        System.out.println("Initial amount of cash in register: $" + currentCash);
        double cashIn = 20.00;
        currentCash += cashIn;
        double changeReturned = 5.47;
        currentCash -= changeReturned;
        System.out.println("New amount of cash in register: $" + currentCash);
        System.out.println("");
       
        //Challenge 2, Clock Measurements
        int minutes = 1117;
        int hours = minutes/60;
        int minutesLeftOver = minutes%60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes left over: " + minutesLeftOver);
        int seconds = minutes*60;
        System.out.println("Total seconds: " + seconds);
    }
}
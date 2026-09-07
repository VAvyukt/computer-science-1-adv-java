//Name: Vivaan Agrawal
//Period: 3A

public class TacoWalk
{
    public static void main(String[] args)
    {
        //1
        double tacoCalories = 180;
 
        System.out.print("One Beef Soft Taco: ");
        System.out.println(tacoCalories);
        System.out.println("");
       
        //2
        int numTacos = 2;
        double tacoTotal = tacoCalories * numTacos;
 
        System.out.print("Beef Soft Tacos: ");
        System.out.println(tacoTotal);
        System.out.println("");
       
        //3
        int numRollUp = 1;
        double rollUpCalories = 180;
        double orderCalories = tacoTotal + rollUpCalories;
 
        System.out.print("Order so far: ");
        System.out.println(orderCalories);
        System.out.println("");
       
        //4
        double caloriesPerMile = 94.0;
        double miles = orderCalories / caloriesPerMile;
       
        System.out.print("Miles to walk: ");
        System.out.println(miles);
        System.out.println("");
       
        //5
        System.out.print("Items ordered >>> ");
        System.out.println(numTacos + numRollUp);
        System.out.print("Total calories >>> ");
        System.out.println(orderCalories);
        System.out.print("Miles to walk >>> ");
        System.out.println(miles);
        System.out.println("");
       
        //6
        double crunchwrapSupremeCals = 530;
        double beefyBurritoCals = 490;
        double cheeseChipsCals = 170;
        double mediumBajaBlastCals = 220;
        double boxCalories = crunchwrapSupremeCals + beefyBurritoCals + cheeseChipsCals + mediumBajaBlastCals;
        double fullOrder = boxCalories + orderCalories;
        miles = fullOrder / caloriesPerMile;
       
        System.out.print("Full order >>> ");
        System.out.println(fullOrder);
        System.out.print("Miles to walk >>> ");
        System.out.println(miles);
        System.out.println("");
       
        //7
       int walkTotalMinutes = 415;
       int walkHours = 415/60;
       int walkMinutes = 415%60;
       System.out.print("That is ");
       System.out.print(walkHours);
       System.out.print(" hours and ");
       System.out.print(walkMinutes);
       System.out.println(" minutes of walking.");
       System.out.println("");

       //8
       int totalCents = 1025;
       int people = 3;
       int centsPerPerson = totalCents / people;
       int centsLeftOver = totalCents % people;
       System.out.print("Each person owes ");
       System.out.print(centsPerPerson);
       System.out.println(" cents.");
       System.out.print("There are ");
       System.out.print(centsLeftOver);
       System.out.println(" cents left over.");
       System.out.println("");

       //9
       double fiestaPotatoesCals = 240;
       fullOrder += fiestaPotatoesCals;
       miles = fullOrder / caloriesPerMile;
       System.out.print("Full order with Fiesta Potatoes >>> ");
       System.out.println(fullOrder);
       System.out.print("Miles to walk >>> ");
       System.out.println(miles);
       System.out.println("");
       //Used fiesta potatoes calories from the Taco Bell website, which is 240 calories for a regular order of fiesta potatoes.

       //10
       double runningCalories = 540;
       System.out.println(runningCalories);
       runningCalories += 170;
       System.out.println(runningCalories);
       runningCalories -= 180;
       System.out.println(runningCalories);
       System.out.println("");
    }
}

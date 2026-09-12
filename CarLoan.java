//Name: Vivaan Agrawal
//Period: 3A
public class CarLoan
{
public static void main(String[] args)
{
//1
String carName = "Rivian R1T";
System.out.println("Car: " + carName);
System.out.println("");
//2
int nameLen = carName.length();
System.out.println("Characters in the name: " + nameLen);
System.out.println("");
//3
double price = 80000;
System.out.println("Sticker Price: " + price);
System.out.println("");
//4
double dealerFees = 2000;
System.out.println("With fees: " + (price + dealerFees));
System.out.println("Sticker price is still: " + price);
System.out.println("");
//5
price++;
System.out.println("After the document fee: " + (price));
System.out.println("");
//6
price -= 500;
System.out.println("After negotiating: " + price);
System.out.println("");
//7
double downPayment = 10000;
System.out.println("Down Payment: " + downPayment);
double financed = price - downPayment;
System.out.println("Amount financed: " + financed);
System.out.println("");
//8
/* Sales tax of two cars:
* This code is incorrect due to PEMDAS:
* price + price * 0.0625.
* The 0.0625 is muliplied by price first then added to the second car.
* This following implementation is correct: */
System.out.println("Sales tax of 2 cars: " + (price + price) * 0.0625);
System.out.println("");
//9
int months = 30;
double monthlyPayment = financed/months;
System.out.println("Monthly payment: " + monthlyPayment);
System.out.println("");
//10
int years = months/12;
int monthsLeftOver = months%12;
System.out.println("That is " + years + " years and " + monthsLeftOver + "months of payments.");
System.out.println("");
//11
System.out.println("The " + carName + " costs $" + price);
System.out.println("");
//12
System.out.println("The " + carName + " costs $" + price);
System.out.println("Financed: " + financed + " over " + months + "months");
System.out.println("That works out to " + monthlyPayment + " per month");
}
}
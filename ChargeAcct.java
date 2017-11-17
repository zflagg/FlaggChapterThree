import java.util.Scanner;

/**
 * Write a description of class ChargeAcct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChargeAcct
{
   static double previousBalance, additionalCharges, interest, newBalance, minPayment;
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
       findCharges();
       findNewBalance();
       findMinimum();
       System.out.println("Previous Balance: " + previousBalance);
       System.out.println("Additional Charges: " + additionalCharges);
       System.out.println("Interest: " + interest);
       System.out.println("New Balance: " + newBalance);
       System.out.println("Minimum Payment: " + minPayment);
    }
   public static void findCharges() {
       System.out.println("Enter previous balance: ");
       previousBalance = scan.nextDouble();
       System.out.println("Enter additional charges: ");
       additionalCharges = scan.nextDouble();
    }
   public static void findNewBalance() {
        interest = (previousBalance + additionalCharges)*0.02;
        newBalance = previousBalance + additionalCharges + interest;
    }
   public static void findMinimum() {
       if (newBalance < 50) {
           minPayment = newBalance;
        }
       else if (newBalance >= 50 && newBalance <= 300) {
           minPayment = 50;
        }
       else {
           minPayment = newBalance*0.2;
        }
    }
}

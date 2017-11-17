import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    static double currentSalary;
    static double raise;
    static double newSalary;
    static String rating;
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        getcurrentSalary();
        getraise();
        getnewSalary();
    }
    public static void getcurrentSalary() {
        System.out.print("Enter current salary: ");
        currentSalary = scan.nextDouble();
    }
    public static void getraise() {
        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        if (rating.equals("Excellent")) {
            raise = currentSalary*0.06;
        }
        else if (rating.equals("Good")) {
            raise = currentSalary*0.04;
        }
        else {
            raise = currentSalary*0.015;
        }
    }
    public static void getnewSalary() {
        newSalary = currentSalary + raise;
        System.out.println("Current Salary: " + currentSalary);
        System.out.println("Raise: " + raise);
        System.out.println("New Salary: " + newSalary);
    }
}

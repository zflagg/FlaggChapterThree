import java.util.Scanner;
/**
 * Write a description of class PowersOfTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowersOfTwo
{
    static Scanner scan = new Scanner (System.in);
    static int power, i;
    static int new = 1;
    static int previous = 1;
    public static void main(String[] args) {
        findPower();
        printPower();
    }
    public static void findPower() {
        System.out.println("What power of Two are you looking for?");
        power = scan.nextInt();
    }
    public static void printPower() {
        while (i<power) {
            if (i == 0) {
                System.out.println("2^" + i + " = " + previous);
                i++;
            }
            else {
                new = previous*2;
                System.out.println("2^" + i + " = " + new);
                i++;
                previous = new;
            }
        }
    }
}

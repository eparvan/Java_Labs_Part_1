package Ex2;
import java.util.Scanner;
/*
* 2.	Write a program that reads an integer angle
* (which may be positive or negative) and normalizes
* it to a value between 0 and 359 degrees.
* (Hint: try to use % then try with Math.floorMod )
* */
public class Normalizes {

    public static int transforma(int x)
    {
        return (x %= 360) >= 0 ? x : (x + 360);
    }

    public  static void main(String args[]) {
        int numar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdu un numar intreg: ");
        numar = scan.nextInt();
        System.out.println("Numarul "+numar+" transformat in grade este: " + transforma(numar));

    }
}

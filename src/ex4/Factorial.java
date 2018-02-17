package ex4;
import java.math.BigInteger;
import java.util.Scanner;
/*4.	Write a program that computes the factorial
N! = 1x2x…… xN using BigInteger.
Compute the factorial of 1000.
* */
public class Factorial {

    public static BigInteger factorial(int n)
    {
        BigInteger result = BigInteger.ONE;
        for ( int i=1;i<=n;i++)
        {
            result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }

    public  static void main(String args[]) {
        int numar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdu un numar intreg: ");
        numar = scan.nextInt();
        System.out.println(numar +" != "+factorial(numar));
    }
}

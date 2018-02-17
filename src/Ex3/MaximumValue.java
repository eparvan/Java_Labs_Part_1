package Ex3;
import java.util.Scanner;
/*3.	Using conditional operator, write a program that reads three integers and prints the largest.
Reapeat with Math.max.
* */

public class MaximumValue {

    public static int maximum(int x, int y, int z)
    {
        int max=x;
        if(max<y) max=y;
        else
            if(max<z) max=z;
        return max;
    }

    public  static void main(String args[]) {
        int numar1, numar2,numar3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu trei numare intregi: ");
        System.out.print("Numar1= ");
        numar1 = scan.nextInt();
        System.out.print("Numar2= ");
        numar2 = scan.nextInt();
        System.out.print("Numar3= ");
        numar3 = scan.nextInt();
        System.out.println("Maximum("+numar1+","+numar2+","+numar3+")=" + maximum(numar1,numar2,numar3));

    }
}

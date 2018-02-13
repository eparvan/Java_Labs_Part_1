package Ex1_Convertion;
import java.util.Scanner;
/*
 * 1.	Write a program that reads an integer and prints it
 * in binary, octal and hexadecimal format.
 * */
public class Conversiune_Ver2
{
    public static char cifre[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};


    public static String Convert(int n, int baza)
    {
        String rezultat="";
        int rest;
        while(n>0)
        {
            rest = n % baza;
            rezultat = cifre[rest]+rezultat;
            n = n / baza;
        }
        return rezultat;
    }
    public  static void main(String args[])
    {
        int numarzecimal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdu un numar zecimal:");
        numarzecimal=scan.nextInt();
        System.out.println("Numarul "+numarzecimal+"in baza 2="+Convert(numarzecimal, 2));
        System.out.println("Numarul "+numarzecimal+"in baza 8="+Convert(numarzecimal, 8));
        System.out.println("Numarul "+numarzecimal+"in baza 16="+Convert(numarzecimal, 16));

    }
}

package Ex1_Convertion;
import java.util.Scanner;
/*
* 1.	Write a program that reads an integer and prints it
* in binary, octal and hexadecimal format.
* */
public class Conversiune
{
public static char cifre[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

public static String ConvertBinary(int n)
{
    String rezultat="";
    int rest;
    while(n>0)
    {
        rest = n % 2;
        rezultat = cifre[rest]+rezultat;
        n = n / 2;
    }
    return rezultat;
}

    public static String ConvertOctal(int n)
    {
        String rezultat="";
        int rest;
        while(n>0)
        {
            rest = n % 8;
            rezultat = cifre[rest]+rezultat;
            n = n / 8;
        }
        return rezultat;
    }
    public static String ConvertHexadecimal(int n)
    {
        String rezultat="";
        int rest;
        while(n>0)
        {
            rest = n % 16;
            rezultat = cifre[rest]+rezultat;
            n = n / 16;
        }
        return rezultat;
    }
    public  static void main(String args[])
    {
        int numarzecimal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdu un numar zecimal:");
        numarzecimal=scan.nextInt();
        System.out.println("Numarul "+numarzecimal+"in baza 2="+ConvertBinary(numarzecimal));
        System.out.println("Numarul "+numarzecimal+"in baza 8="+ConvertOctal(numarzecimal));
        System.out.println("Numarul "+numarzecimal+"in baza 16="+ConvertHexadecimal(numarzecimal));

    }
}

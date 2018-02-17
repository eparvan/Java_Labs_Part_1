package Ex5;
/*5.	Write a program that reads a string and
prints all of its nonempty substrings (empty substring “_”).
* */

import java.util.Scanner;

public class Cuvinte{

    public static void afisaresiruri(String t)
    {
        for(int end=t.length(); end>0; end--)
        {
            for(int start=0; start<end; start++)
            {
               System.out.println(t.substring(start,end));
            }
        }
    }

        public  static void main(String args[]) {
            String  text;
            Scanner scan = new Scanner(System.in);
            System.out.print("Introdu textul: ");
            text = scan.next();
            System.out.println("Subsirurile obtinute:");
            afisaresiruri(text);

        }
}

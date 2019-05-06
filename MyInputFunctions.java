/**
 * Die Klasse "MyInputFunctions", welches Eingabe-Methoden
 * realisisert (auf Basis der Scanner-Klasse)
 */

import java.util.Scanner;

public class MyInputFunctions
{
                         
    /**
     * Konstruktor, der die Erzeugung eines Objektes dieser Klasse verhindert
     */
    private MyInputFunctions()
    {
    }

   /**
    * Eingabeaufforderungs-Texte werden ausgegeben
    * und liest aus dem jeweiligen Datentyp die erste Datentyp-Zahl
    * (danach ueberliest es bis zum Zeilenende alle weiteren Zeichen)
    */ 
   
   public static int readlnInt(Scanner in, String eingabeAufforderung)
   {
    System.out.print( eingabeAufforderung );
    int zahl = in.nextInt();
    in.nextLine();
    return zahl;
   }

   
   public static long readlnLong(Scanner in, String eingabeAufforderung)
   {
    
    System.out.print( eingabeAufforderung );
    long zahl = in.nextLong();
    in.nextLine();
    return zahl;
   }

   
   public static float readlnFloat(Scanner in, String eingabeAufforderung)
   {
    System.out.print( eingabeAufforderung );
    float zahl = in.nextFloat();
    in.nextLine();
    return zahl;
   }

   
   
   public static double readlnDouble(Scanner in, String eingabeAufforderung)
   {
    System.out.print( eingabeAufforderung );
    double zahl = in.nextDouble();
    in.nextLine();
    return zahl;
   }


   public static String readlnString(Scanner in, String eingabeAufforderung)
   {
    System.out.print( eingabeAufforderung );
    String zeile = in.nextLine();
    return zeile;
   }



   public static String readlnString(Scanner in)
   {
    String zeile = null;

    if ( in.hasNextLine() )
      {
        zeile = in.nextLine();
      }
    return zeile;
   }
   
   
   public static char readlnChar(Scanner in, String eingabeAufforderung)
   {
    System.out.print( eingabeAufforderung );
    String zeile = in.nextLine();
    char zeichen = zeile.toCharArray()[0];
    return zeichen;
   }

}

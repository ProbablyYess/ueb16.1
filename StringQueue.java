/**
 * Die Klasse "StringQueue" zum Implementieren mittels der Klasse "ObjectQueue"
 * Author: Abbas, Maass
 */

public class StringQueue 
       extends ObjectQueue

{
   private static final String  KEIN_STRING_OBJEKT = "Das angegebene Objekt ist kein String-Objekt.";


   /** 
    * Ein String-Element an der Queue anfuegen
    */
   public void addLast (Object o) 
   {
     if ( o instanceof String )
       {
        super.addLast( o );
       }
     else
       {
         throw new RuntimeException(KEIN_STRING_OBJEKT);
       }
   }


   /**
    * Erstes Element aus der Queue entfernen
    */
   public String removeFirst () 
   {
     return (String)super.removeFirst();
   }


   /** 
    * i-tes Element der Queue zurueckgeben
    */
   public String get ( int i ) 
   {
     return (String)super.get(i);
   }

}

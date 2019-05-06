/**
 * Die Klasse "ObjectQueue" zum Implmenetieren mittels Object-Array
 * Author: Abbas, MaaÃŸ
 *
 */

public class ObjectQueue 
       implements Queue
{


   public static final int QUEUE_STANDARD_LAENGE = 10;
   
   private static final String  QUEUE_IST_VOLL = "Die Queue ist vollstaendig belegt.";
   private static final String  QUEUE_IST_LEER = "Die Queue ist vollstaendig leer.";
   private static final String  INDEX_OUT_OFF_RANGE = "Der angegebene Index ist groesser als die Laenge der Queue!";

   /**
    * Queue-Array
    */
   private Object[] queue;
   private int size;

   /**
    * Konstruktor
    */
   
   public ObjectQueue() {
       queue = new Object[QUEUE_STANDARD_LAENGE];
       size = 0;
   }

   /** 
    * Ein Element an Queue anfuegen 
    */
   
   public void addLast (Object o) 
   {
     if ( full() )
       {
         throw new RuntimeException(QUEUE_IST_VOLL);
       }
    
     queue[size] = o;
     size++;
   }

   /** 
    * Erstes Element aus der Queue entfernen
    */
   
   public Object removeFirst () 
   {
     if ( empty() )
       {
         throw new RuntimeException(QUEUE_IST_LEER);
       }
    
     int i;
     Object helfer = queue[0];
     size--;
     for ( i = 0; i < size; i++ )
       {
        queue[i] = queue[i+1];
       }
     queue[i+1] = null;  
     return helfer;
   }


   /** 
    * i-tes Element der Queue zurueckgeben
    */
   public Object get ( int i ) 
   {
     if ( empty() )
       {
         throw new RuntimeException(QUEUE_IST_LEER);
       }
    
     if ( i > size )
       {
         throw new RuntimeException(INDEX_OUT_OFF_RANGE);
       }
    
     return queue[i-1];
   }


   /** 
    * Checken ob die Queue voll ist
    */
   public boolean full  () 
   {
     return ( size == 10 );
   }


   /** 
    * Checken ob die Queue leer ist
    */
   public boolean empty  () 
   {
     return ( size == 0 );
   }

   /** 
    * Checken wie viele Elemente die Queue enthaelt
    */
   public int size  () 
   {
     return size;
   }


   /** 
    * toString-Methode
    */
   public String toString() 
   {
     StringBuffer sb = new StringBuffer();

     for ( int index = 0; index < size; index++)
        {
           sb.append(queue[index] + " - ");
        }
     return sb.toString();
   }
}

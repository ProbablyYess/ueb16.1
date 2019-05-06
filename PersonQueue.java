
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Die Klasse "PersonQueue" zum Implementieren mittels der Klasse "ObjectQueue"
 * Author: Abbas, MaaÃŸ
 */


public class PersonQueue
        extends ObjectQueue {
    private static final String KEIN_PERSON_OBJEKT = "Das angegebene Objet ist kein Person-Objekt.";


    /**
     * Person-Element an Queue anfuegen
     */

    public void addLast(Object o) {
        if (o instanceof Person) {
            super.addLast(o);
        } else {
            throw new RuntimeException(KEIN_PERSON_OBJEKT);
        }
    }


    /**
     * Erstes Element aus der Queue entfernen
     */

    public Person removeFirst() {
        return (Person) super.removeFirst();
    }


    /**
     * i-tes Element der Queue zurueckgeben
     */
    public Person get(int i) {
        return (Person) super.get(i);
    }

    /**
     * Gesamte Queue wird mithilfe des Iterators ausgegeben
     */
    
    public void print() {
        Iterator iterator = new PersonQeueIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    /**
     * Person in der Queue mit dem lexikalisch kleinsten Vornamen
     * wird zurueckgeben (durch internen Iterator)
     */
    public String smallest() {

        PersonQeueIterator iterator = new PersonQeueIterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        Person smallest = iterator.next();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(NameIsSmaller(p, smallest)){
                smallest = p;
            }
        }
        return smallest.toString();
    }

    private boolean NameIsSmaller(Person newPerson, Person smallest){
        int count = 0;
        String newVorname = newPerson.vorname;
        String smallestVorname = smallest.vorname;
        while(count < newVorname.length() && count < smallestVorname.length()){
            if(newVorname.charAt(count) < smallestVorname.charAt(count)){
                return true;
            }
            count++;
        }
        return newVorname.length() < smallestVorname.length();
    }


    interface PersonIterator extends java.util.Iterator<Person> {
    }


    private class PersonQeueIterator implements PersonIterator {
        int counter = 1;


        @Override
        public boolean hasNext() {
            return this.counter <= PersonQueue.super.size();
        }

        @Override
        public Person next() {
            if (this.hasNext()) {
                return PersonQueue.this.get(counter++);
            }
            throw new NoSuchElementException();
        }
    }

}

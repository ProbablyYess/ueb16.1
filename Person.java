/**
 * Author: Hussein, Maass
 */

public class Person implements java.io.Serializable {
  public Person() {}

  public Person( String name, String vorname) {
      this.name = name;
      this.vorname = vorname;
  }

  /**
   * Person auf die Standardausgabe ausgeben
   */
  public void ausgeben() {
      System.out.print(name + ", " + vorname);
  }
  
  /**
   * Set-Methoden
   */
  public void setName(String n) {
      name = n;
  }

  public void setVorname(String vn) {
      vorname = vn;
  }

  public String getName() {
      return name;
  }

  public String getVorname() {
      return vorname;
  }
  
  public String toString() {
      return name + ", " + vorname;
  }
  
  /**
   * Nur im Package der deklarierenden Klasse ansprechbar
   */
  protected String name;
  protected String vorname;
}


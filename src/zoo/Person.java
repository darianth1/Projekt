
package zoo;

public class Person {
 String name;
 int alter;
public Person(String name, int alter) {
    this.name = name;
    this.alter = alter;
}

    public double getTicketPreis() {
        if (alter < 14) return 10.0;      // Kind
        if (alter < 65) return 20.0;      // Erwachsener
        return 15.0;                      // Senior
    }
    
public String getName() { 
    return name; 
}
    public int getAlter() {
        return alter;
    } 
}

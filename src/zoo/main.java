package zoo;

import java.util.ArrayList;
import java.util.List; 

public class main {
    public static void main(String[] args) {
    
        List<Person> gruppe = new ArrayList<>();
        gruppe.add(new Person("Lenny", 12));
        gruppe.add(new Person("Darian", 70));
        gruppe.add(new Person("Sonne", 42));
        
        List<Angebot> angebote = new ArrayList<>();
        angebote.add(new Angebot("Hirsche streicheln", 100.50));
        angebote.add(new Angebot("Bären-Show", 12.00));
        
        Parkticket park = new Parkticket(5.00);
        
        List<Bereich> bereich = List.of(
        new Bereich("Eurasien", 3.00),
        new Bereich("Nordamerika", 2.50)
        );
  Bestellung bestellung = new Bestellung(gruppe, angebote, bereich, park); 
  bestellung.printRechnung();
 }
}
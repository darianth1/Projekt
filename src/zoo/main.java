package zoo;

import java.util.ArrayList;
import java.util.List; 

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
  
        Scanner s = new Scanner(System.in);
       int i = 1;
List<Person> gruppe = new ArrayList<>();
while (i == 1) {
    System.out.println("Geben sie den Namen an:");
    String personen_name = s.nextLine();
    System.out.println("Geben sie das Alter an:");
    int personen_alter = s.nextInt();
    s.nextLine(); // Scanner fixen!
    gruppe.add(new Person(personen_name, personen_alter));
    System.out.println("Weitere Personen? (Ja/Nein)");
    String lol = s.nextLine();

    if (lol.equalsIgnoreCase("nein")) {
        i = 2;
    }
}
        
        
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
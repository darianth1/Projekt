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

    if (lol.equalsIgnoreCase("Nein")) {
        i = 2;
    }
}



List<Angebot> angebote = new ArrayList<>();

    System.out.println("Moechten sie das Angebot 'Hirsche streicheln' in anspruch nehmen dann drücken sie die '1'"
            + "Moechten sie das Angebot 'Bären-Show' in anspruch nehmen dann drücken sie die 2"
            + "Wenn sie beides beanspruchen wollen dann drücken sie die 3");
           int an_gebote = s.nextInt();
           
           switch (an_gebote) {
               case 1:
               angebote.add(new Angebot("Hirsche streicheln", 100.50));
                    break;
               case 2:
               angebote.add(new Angebot("Bären-Show", 12.00));
                    break;
               case 3:
               angebote.add(new Angebot("Hirsche streicheln", 100.50));
               angebote.add(new Angebot("Bären-Show", 12.00));
                    break;
               case 4:
                   System.out.println("Kein Angebot beansprucht");
                    break;
               default:
                   System.out.println("Keine gültige Wahl");
                    break;
           }
          
        
        Parkticket park = new Parkticket(5.00);
 
        List<Bereich> bereich = new ArrayList<>();
        System.out.println("Sie können ihr Erlebnis im Zoo konfigurieren in dem sie die Bereiche wählen");
        System.out.println("Eurasien 1 /n"
                + "Afrika 2 "
                + "Nordamerika 3 "
                + "Südamerika 4 "
                + "Australien und Ozeanien 5 "
                + "tropisches Zentrum 6 "
                + "Meereswelt 7 "
                + "Kein Angebot nutzen ");
        int be_reiche = s.nextInt();
        switch (be_reiche) {
               case 1:
               bereich.add(new Bereich("Eurasien", 9.00));
                    break;
               case 2:
               bereich.add(new Bereich("Afrika", 5.00));
                    break;
               case 3:
               bereich.add(new Bereich("Nordamerika", 7.50));
                    break;
               case 4:
               bereich.add(new Bereich("Südamerika", 8.00));
                    break;
               case 5:
               bereich.add(new Bereich("Australien und Ozeanien", 6.00));
                    break;
               case 6:
               bereich.add(new Bereich("tropisches Zentrum", 15.00));
                    break;
               case 7:
               bereich.add(new Bereich("Meereswelt", 20.00));
                    break;     
               case 8:
                   System.out.println("Kein Angebot beansprucht");
                    break;
               default:
                   System.out.println("Keine gültige Wahl");
                    break;
           }
              
        bereich.add(new Bereich("Eurasien", 9.00));
        bereich.add(new Bereich("Afrika", 5.00));
        bereich.add(new Bereich("Nordamerika", 7.50));
        bereich.add(new Bereich("Südamerika", 8.00));
        bereich.add(new Bereich("Australien und Ozeanien", 6.00));
        bereich.add(new Bereich("tropisches Zentrum", 15.00));
        bereich.add(new Bereich("Meereswelt", 20.00));

  Bestellung bestellung = new Bestellung(gruppe, angebote, bereich, park); 
  bestellung.printRechnung();
 }
}
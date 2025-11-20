package zoo;

import java.util.List;
import java.util.Random;

public class Bestellung {

    List<Person> personen;
    List<Angebot> angebote;
    List<Bereich> bereiche;
    double park;

    int auftragsNummer;

    public Bestellung(List<Person> personen, List<Angebot> angebote, 
                      List<Bereich> bereiche, double park) {

        this.personen = personen;
        this.angebote = angebote;
        this.bereiche = bereiche;
        this.park = park;

        this.auftragsNummer = generiereAuftragsNummer();
    }

    private int generiereAuftragsNummer() {
        Random r = new Random();
        return  + (100000 + r.nextInt(900000));
    }

    public double getGesamtPreis() {
        double sum = 0;

        for (Person p : personen)
            sum += p.getTicketPreis();

        for (Angebot a : angebote)
            sum += a.getPreis();

        for (Bereich b : bereiche)
            sum += b.getPreis();

        sum += park;

        return sum;
    }

    private String generiereBarcode() {
        return "|| | || ||| | || || | |||";
    }

    public void printRechnung() {
        System.out.println("========== ZOO RECHNUNG ==========");
        System.out.println("Auftragsnummer: " + auftragsNummer);
        System.out.println("Barcode: " + generiereBarcode());
        System.out.println("-----------------------------------");

        System.out.println("\nPersonen:");
        for (Person p : personen)
            System.out.println(p.getName() + " (" + p.getAlter() + "): " + p.getTicketPreis());

        System.out.println("\nZoo-Bereiche:");
        for (Bereich b : bereiche)
            System.out.println(b.getName() + ": " + b.getPreis());

        System.out.println("\nZusätzliche Angebote:");
        for (Angebot a : angebote)
            System.out.println(a.getName() + ": " + a.getPreis());

        System.out.println("\nParkticket: " + park);

        System.out.println("-----------------------------------");
        System.out.println("Gesamt: " + getGesamtPreis());
    }
}
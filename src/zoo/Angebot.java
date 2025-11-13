/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author 14247055
 */
public class Angebot {
String name;
double preis;
 public Angebot(String name, double preis) {
        this.name = name;
        this.preis = preis;
         System.out.println("Person erstellt: " + name + preis);
    }

    public String getName() {
        return name;
    }
    public double getPreis() {
        return preis;
    }

}

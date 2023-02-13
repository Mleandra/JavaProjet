package Exo1;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
       Voiture v1 = new Voiture("Mercedes","A1" , LocalDate.of(2012,05,6),260);
       v1.infos();
       Voiture v2 = new Voiture("Audi","M1" , LocalDate.of(2016,06,23),300);
       v2.infos();
       Voiture v3  = new Voiture("Ferari","F1" , LocalDate.of(2022,05,6),360);
       v3.infos();
       System.out.println("Le nombre de voiture cree est -> " + Voiture.nombreVoituresCree);
    }

}

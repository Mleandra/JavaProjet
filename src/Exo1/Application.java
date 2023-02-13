package Exo1;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
       /*
       Voiture v1 = new Voiture("Mercedes","A1" , LocalDate.of(2012,05,6),260);
       v1.infos();
       Voiture v2 = new Voiture("Audi","M1" , LocalDate.of(2016,06,23),300);
       v2.infos();
       Voiture v3  = new Voiture("Ferari","F1" , LocalDate.of(2022,05,6),360);
       v3.infos();

         */

        //Entrez les informations a partie du  clavier

        System.out.println("Entrez la marque de la voiture ->");
        Scanner sc = new Scanner(System.in);
        String marque = sc.nextLine();
        System.out.println("Entrez le modele de la voiture ->");
        String modele = sc.nextLine();
        System.out.println("Entrez la date d'immatriculation de la voiture  sous forme 'aaaa-mm-jj' ->");
        String dI= sc.nextLine();
        LocalDate dateImma = LocalDate.parse(dI);
        System.out.println("Entrez la vitesse max de la voiture ->");
        int vMax = sc.nextInt();

        Voiture a1 = new Voiture(marque,modele,dateImma,vMax);
        a1.infos();


       System.out.println("Le nombre de voiture cree est -> " + Voiture.nombreVoituresCree);
    }

}

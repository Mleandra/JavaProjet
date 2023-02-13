package Exo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static Voiture saisiDataVoiture(Scanner sc)
    {
        System.out.println("Entrez la marque de la voiture ->");
        String marque = sc.nextLine();
        System.out.println("Entrez le modele de la voiture ->");
        String modele = sc.nextLine();
        System.out.println("Entrez la date d'immatriculation de la voiture  sous forme 'aaaa-mm-jj' ->");
        String dI= sc.nextLine();
        LocalDate dateImma = LocalDate.parse(dI);
        System.out.println("Entrez la vitesse max de la voiture ->");
        int vMax = sc.nextInt();


        return new Voiture(marque,modele, dateImma, vMax);
    }
    public static void main(String[] args) {
       /*
       Voiture v1 = new Voiture("Mercedes","A1" , LocalDate.of(2012,05,6),260);
       v1.infos();
       Voiture v2 = new Voiture("Audi","M1" , LocalDate.of(2016,06,23),300);
       v2.infos();
       Voiture v3  = new Voiture("Ferari","F1" , LocalDate.of(2022,05,6),360);
       v3.infos();
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
        */
        ArrayList<Voiture> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien  de voitures voulez vous enregistrer ? -> ");
        int nbVoiture = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < nbVoiture; i++) {
            cars.add(saisiDataVoiture(sc));
            sc.nextLine();
        }

       System.out.println("Les voitures de ma liste  " );
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("----Voiture : "+ i);
            cars.get(i).infos();

        }

       System.out.println("Le nombre de voiture cree est -> " + Voiture.nombreVoituresCree);
    }

}

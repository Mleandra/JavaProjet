package Exo1;

import java.time.LocalDate;

public class Voiture {
    String marque;
    String modele;
    LocalDate dateImatriculaions;
    int vitesseMax;
    static int nombreVoituresCree = 0; // nombres  de voiture crée
    
    public Voiture(String marque,String modele, LocalDate dI , int vMax){ // constructeur   de la class
        System.out.println("Creation d'une voiture ...");
        this.marque = marque ;
        this.modele =modele ;
        this.dateImatriculaions =dI;
        this.vitesseMax = vMax;
        nombreVoituresCree++ ;   }

    public void infos(){ // affichage des informations d'une voiture
        System.out.println("Marque -> "+this.marque);
        System.out.println("Modele -> "+this.modele);
        System.out.println("Date d'imatriculation -> "+this.dateImatriculaions);
        System.out.println("Vitesse Max -> "+this.vitesseMax);
    }
}

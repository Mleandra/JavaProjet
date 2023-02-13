package Exo1;

/*
* Creer une classe voiture avec les attributs Marques , Modeles  ,date  d' immatriculations ,  vitesse max
* Ajouter le constructeur  pouvant faire l'initialisations
*Ajouter  Nombres de voiture cree
* afficher le nombre de voiture cree grace  a nombre de voiture creer
*
* */

import java.time.LocalDate;

public class Voiture {
    String marque;
    String modele;
    LocalDate dateImmatriculaions;
    int vitesseMax;
    static int nombreVoituresCree = 0; // nombres  de voiture crée
    
    public Voiture(String marque,String modele, LocalDate dI , int vMax){ // constructeur   de la class
        System.out.println("Creation d'une voiture ...");
        this.marque = marque ;
        this.modele =modele ;
        this.dateImmatriculaions =dI;
        this.vitesseMax = vMax;
        nombreVoituresCree++ ;   }

    public void infos(){ // affichage des informations d'une voiture
        System.out.println("Marque -> "+this.marque);
        System.out.println("Modele -> "+this.modele);
        System.out.println("Date d'immatriculation -> "+this.dateImmatriculaions);
        System.out.println("Vitesse Max -> "+this.vitesseMax);
    }
}

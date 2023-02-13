package Day1;

import java.time.LocalDate;

public class Animal {
// attributs d'instance
    String nom;
    int age;
    LocalDate dateNaissance;
    // attributs de classe :
    static int  AgeMax = 50;
    public  Animal(){ // constructeur sans paramétre de la classe  naimal
        System.out.println("Constructeur d'un animal");
    }
    public  Animal(String nom ,int age, LocalDate naissance){ // constructeur sans paramétre de la classe  naimal
        System.out.println("Constructeur  avec paramétre");
        this.nom = nom;
        this.age = age;
        this.dateNaissance = naissance;


    }




}

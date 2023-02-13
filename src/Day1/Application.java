package Day1;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args){
        //System.out.println("hello lind ");
        //System.out.println("on fait un petit recylage en java");


        // 1) Création d'une instance

        Animal a1 = new Animal(); // appel au contructeur par défaut

        Animal a2 = new Animal(); // appel au contructeur par défaut

        System.out.println(a1.nom);  //null
        System.out.println(a1.age);  // 0
        LocalDate naiss = LocalDate.of(23,02,11);
        Animal a3 = new Animal("tuttu", 0, naiss);
        System.out.println("Nom : " + a3.nom);
        System.out.println("Age : " + a3.age);
        System.out.println("Date de naissance: " + a3.dateNaissance);

        System.out.println(Animal.AgeMax);
        a3.info();



    }

}

package Exeption;
/*
* 
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println("Entrez le premier nombre : \n ->");

        int x = sc.nextInt();
        System.out.println("Entrez le second nombre : \n ->");
        int y = sc.nextInt();
        try {
            result = x/y ;
        }
        catch (Exception ex){
            System.out.println("!!!!!Erreur : !!!!"+ ex.getMessage());
            ex.printStackTrace();

        }
        finally {
            if(y !=0) {
                System.out.println(x + " : " + y + " = " + result);
            }else {
                System.out.println("impossible de faire le division");
            }
        }

    }

}


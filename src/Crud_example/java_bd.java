package Crud_example;

import java.sql.*;
import java.util.Scanner;

public class java_bd {

    public static void getData(Statement stmt) throws SQLException{

        System.out.println("ID------Nom-----------email----------------------Age ");
        ResultSet rs = null;
        String rq = "select * from etudiants";
        rs = stmt.executeQuery(rq);
        while (rs.next()){
            int id = rs.getInt("id");
            String nom = rs.getString("nom");
            String email = rs.getString("email");
            int age= rs.getInt("age");
            System.out.println(id+"|------"+nom+"|-----------"+email+"|----------------------"+age);
        }
    }

    public static int insertData(Statement stmt) throws SQLException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom : ->");
        String nom = sc.nextLine();
        System.out.println("Entrez votre age : ->");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Entrez votre addresse mail :->" );
        String email = sc.nextLine();
        System.out.println("creation d'une instance...");
        String sql ="insert into etudiants (nom,age,email) values('" +nom+"','" +age+"','" +email+"')";
        int res = stmt.executeUpdate(sql);
        if(res==1){
            System.out.println("Creation....");
        }
        else{
            System.out.println("Echec de creation ");
        }
        return res;

    }


    public static int deleteData(Statement stmt) throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez l'ID : ->");
        int id=sc.nextInt();
        System.out.println("Suppression en cours ...");
        String sql ="delete from etudiant where id ='"+id+"'";
        int res = stmt.executeUpdate(sql);

        if(res == 1)
        {
            System.out.println("Suppression avec succès");
        }
        else
        {
            System.out.println("Etudiant introuvable");
        }
        return res;
    }

    public static int updateData(Statement stmt) throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez l'ID : ->");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Entrez le nouveau nom : ->");
        String nom= sc.nextLine();
        System.out.println("Mise a jour en cour....");
        String rq = "update etudiants set nom = '"+nom+"' where id = '"+id+"'";
        int res = stmt.executeUpdate(rq);
        if (res ==1) {
            System.out.println("Mise a jour reussi");
        }else {
            System.out.println("Echec de mise a jour");
        }
        return res;
    }
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecoleit",
                    "root", "");
            Statement stmt = connection.createStatement();
            System.out.println("Votre base de données");
            getData(stmt);
            System.out.println("Quel traitement voulez vous ?");
            int cas = 0;
            System.out.println("1-Insertion");
            System.out.println("2- Suppression ");
            System.out.println("3- Modification");
            System.out.println("Entrez voitre choix");
            Scanner sc = new Scanner(System.in);
            cas= sc.nextInt();
            sc.nextLine();
            switch (cas){
                case 1:
                    System.out.println("1-Insertion");
                    insertData(stmt);
                    getData(stmt);
                    break;
                case 2:
                    System.out.println("2- Suppression ");
                    deleteData(stmt);
                    getData(stmt);
                    break;
                case 3:
                    System.out.println("3- Modification");
                    updateData(stmt);
                    getData(stmt);
                    break;
                default:
                    System.out.println("Choix incorrect");
                    getData(stmt);
                    break;
            }

        }
        catch (Exception ex ){
            System.out.println("!!! ERROR :"+ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            System.out.println("Traitement terminer ... merci ");
            if(connection!=null)
                connection.close();
        }
    }
}

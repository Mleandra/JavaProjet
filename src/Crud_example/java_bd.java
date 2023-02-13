package Crud_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class java_bd {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecoleit",
                    "root", "");
            Statement stmt = connection.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez votre nom : ->");
            String nom = sc.nextLine();
            System.out.println("Entrez votre age : ->");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Entrez votre addresse mail :->" );
            String email = sc.nextLine();

            String sql ="insert into etudiants (nom,age,email) values('" +nom+"','" +age+"','" +email+"')";
            int res = stmt.executeUpdate(sql);
            System.out.println(res);
        }
        catch (Exception ex ){
            System.out.println("!!! ERROR :"+ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            if(connection!=null)
                connection.close();
        }
    }
}

package loja;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
 
    public static Connection con = null;
    public Statement st = null;
 
    public conexao() {
    }
 
   public static void conectar() throws ClassNotFoundException, SQLException{
       System.out.println("Conectando ao banco de dados...");

       Class.forName("com.mysql.jdbc.Driver");
       con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/loja","root","root");
       System.out.println("Conectado");

   }
    
    
}

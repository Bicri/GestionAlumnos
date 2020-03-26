
package BasesDatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexiones {
    
        private static Connection con;
        PreparedStatement st = null;
        ResultSet result = null;
        
        public void conectar()
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/gestionalumnos", "root", "root");
            }catch(ClassNotFoundException | SQLException e)
            {
                System.out.println("Error al conectar \n"+e);
            }
        }
        
        public void desconectar()
        {
            try{
                con.close();
            }catch(SQLException ex)
            {
                System.out.println("ERROR AL DESCONECTAR "+ex);
            }
        }
        
}

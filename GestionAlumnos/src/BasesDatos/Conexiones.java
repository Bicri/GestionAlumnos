
package BasesDatos;

import Objetos.Alumno;
import com.mysql.jdbc.Connection;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Conexiones {
    
        private static Connection con;
        PreparedStatement st = null;
        ResultSet result = null;
        
        List <Alumno> listaAlumno = new ArrayList<>();
        int boleta; String nombre, pat, mat;
        
        public void conectar()
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionalumnos", "root", "root");
                System.out.println("CONECTADO");
            }catch(ClassNotFoundException | SQLException e)
            {
                System.out.println("Error al conectar \n"+e);
            }
        }
        
        public void desconectar()
        {
            try{
                con.close();
                System.out.println("DESCONECTADO");
            }catch(SQLException ex)
            {
                System.out.println("ERROR AL DESCONECTAR "+ex);
            }
        }
        
        public void muestra()
        {
            try{
                st = con.prepareStatement("select * from alumnos");
                result = st.executeQuery();
                while(result.next())
                {
                    boleta = result.getInt(1);
                    nombre = result.getString(2);
                    pat = result.getString(3);
                    mat = result.getString(4);
                    listaAlumno.add(new Alumno(boleta,nombre,pat,mat));
                }
                for(Alumno aux: listaAlumno)
                {
                    System.out.println(aux);
                }
            }catch(SQLException e)
            {
                System.out.println("Error al mostrar" + e);
            }
        }
        
}

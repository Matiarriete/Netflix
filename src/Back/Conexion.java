package Back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/netflix";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";    

    public static Connection getConexion() {//se conecta con la base de datos mediante los datos pre cargados
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);//Dice de donde conectarse su usuario y su pass
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }
    
}

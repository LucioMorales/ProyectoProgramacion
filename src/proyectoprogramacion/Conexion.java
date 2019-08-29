package proyectoprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection connect() {
        Connection conn = null;
        try {
            // Path db
            String url = "jdbc:sqlite:/home/lucio/Documents/Programacion/Java/ProyectoProgramacion/ProyectoProgramacion/DB/Proyecto.db";
            // Create connection to db
            conn = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return conn;
    }
    
    /*
    finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    */
}


package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Software_Max(JDV)
 */

public class conexion {
    
       Connection con;

    public conexion() {

        try {

            final String URL = "jdbc:mysql://localhost:3306/control_vehiculos";
            final String USERNAME = "root";
            final String PASSWORD = "";
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conection OK");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }
}

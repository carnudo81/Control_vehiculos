package clases;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import vistas.FrmRegVehiculos;

/**
 *
 * @author Software_Max(JDV)
 */
public class sqlGeneral {

//********************************************** PONER FECHA ACTUAL EN LBL O TXT *************************************************
    public static String FecActStr() {

        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        String fecAct = (formato.format(sistFecha));

        return fecAct;
    }

//*************************************************** LLENAR CBX  PLACA DISPONIBLES *******************************************************
    public static void llenarVehiDispon(JComboBox hbDisp) {
        PreparedStatement ps;
        ResultSet rs;
        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String est = "DISPONIBLE";

        String sql = "SELECT placa FROM vehiculos WHERE estado = '" + est + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                hbDisp.addItem(rs.getString("placa"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
//*************************************************** LLENAR CBX  PLACA DISPONIBLES *******************************************************
    public static void llenarTodosVehic(JComboBox hbDisp) {
        PreparedStatement ps;
        ResultSet rs;
        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "SELECT placa FROM vehiculos ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                hbDisp.addItem(rs.getString("placa"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

//*********************************************** CONVERTIR FECHA A STRING **********************************************************
    public static String convertFecDateAcadena(JDateChooser fecha) {

        int anio = fecha.getCalendar().get(Calendar.YEAR);
        int mes = fecha.getCalendar().get(Calendar.MONTH);
        int dia = fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes = mes + 1;
        String fecOk;
        return fecOk = String.valueOf(anio + "-" + mes + "-" + dia);

    }

//********************************************************************************************************************
    public static Date convtFecCadenaADate(String fec) {
        
        SimpleDateFormat formatFecha = new SimpleDateFormat("yyyy-MM-dd");
        
        Date fechaDate = null;

        try {
            fechaDate = formatFecha.parse(fec);

        } catch (ParseException ex) {

            Logger.getLogger(FrmRegVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaDate;

    }

}

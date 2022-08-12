package modelo.DAO;

import modelo.Util.JDBCUtilities;
import java.sql.*;

public class Consulta1DAO {

    public static ResultSet consulta(){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String query = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia ASC;";

        try{

            conn = JDBCUtilities.conexion();

            stmt = conn.createStatement();

            rs = stmt.executeQuery(query);

        }catch (Exception e){
            System.err.println(e);
        }
        return rs;
    }

}

package modelo.DAO;
import modelo.Util.JDBCUtilities;
import java.sql.*;

public class Consulta2DAO {

    public static ResultSet consulta(){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String query = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion LIKE 'Casa Campestre' AND (Ciudad LIKE 'Santa Marta' OR Ciudad LIKE 'Cartagena' OR Ciudad LIKE 'Barranquilla');";

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

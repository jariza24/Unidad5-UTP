package modelo.DAO;
import modelo.Util.JDBCUtilities;
import java.sql.*;

public class Consulta3DAO {

    public static ResultSet consulta(){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String query = "SELECT ID_Compra, Proyecto.Constructora, Proyecto.Banco_Vinculado FROM Compra JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE Compra.Proveedor LIKE 'Homecenter' AND Proyecto.Ciudad LIKE 'Salento';";

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

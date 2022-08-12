package modelo.VO;
import modelo.DAO.Consulta2DAO;
import modelo.DAO.Consulta3DAO;
import modelo.Util.JDBCUtilities;
import java.sql.*;

public class Consulta3VO {
    public static String valores(){

        ResultSet rs = null;
        String miSalida= "";
        miSalida=String.format("%15s %-20s %-20s\n", "ID_Compra", "Constructora", "Banco_Vinculado");
        try{
            rs = Consulta3DAO.consulta();

            while (rs.next()){
                int ID_Compra = rs.getInt("ID_Compra");
                String Constructora = rs.getString("Constructora");
                String Banco_Vinculado = rs.getString("Banco_Vinculado");
                miSalida +=String.format("%15s %-20s %-20s\n",ID_Compra, Constructora, Banco_Vinculado);

                //System.out.println(String.format("%5d %-15s %-15s %-15s",ID, nombre, apellido, ciudad));

            }

        }catch (Exception e){
            System.err.println(e);
        }
        return miSalida;
    }

    public static void main(String[] args) {
        System.out.println(Consulta3VO.valores());

    }
}

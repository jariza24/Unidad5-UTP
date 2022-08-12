package modelo.VO;
import modelo.DAO.Consulta2DAO;
import modelo.Util.JDBCUtilities;
import java.sql.*;


public class Consulta2VO {

    public static String valores(){

        ResultSet rs = null;
        String miSalida="";
        miSalida=String.format("%15s %-20s %-20s %-20s\n", "D_Proyecto", "Constructora", "Numero_Habitaciones", "Ciudad");
        try{
            rs = Consulta2DAO.consulta();

            while (rs.next()){
                int ID_Proyecto = rs.getInt("ID_Proyecto");
                String Constructora = rs.getString("Constructora");
                String Numero_Habitaciones = rs.getString("Numero_Habitaciones");
                String Ciudad = rs.getString("Ciudad");
                miSalida +=String.format("%15s %-20s %-20s %-20s\n",ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad);

                //System.out.println(String.format("%5d %-15s %-15s %-15s",ID, nombre, apellido, ciudad));

            }

        }catch (Exception e){
            System.err.println(e);
        }
        return miSalida;
    }

    public static void main(String[] args) {
        System.out.println(Consulta2VO.valores());

    }

}

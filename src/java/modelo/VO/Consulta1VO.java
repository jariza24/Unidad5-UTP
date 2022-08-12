package modelo.VO;


import modelo.DAO.Consulta1DAO;

import java.sql.*;
import java.util.ArrayList;

public class Consulta1VO {

    public static String valores(){

        ResultSet rs = null;
        String miSalida="";
        miSalida=String.format("%15s %-20s %-20s %-20s\n", "ID_Lider", "Nombre", "Primer_Apellido", "Ciudad_Residencia");
        try{
            rs = Consulta1DAO.consulta();

            while (rs.next()){
                int ID = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                miSalida +=String.format("%15s %-20s %-20s %-20s\n",ID, nombre, apellido, ciudad);

                //System.out.println(String.format("%5d %-15s %-15s %-15s",ID, nombre, apellido, ciudad));

            }

        }catch (Exception e){
            System.err.println(e);
        }
    return miSalida;
    }

    public static void main(String[] args) {
        System.out.println(Consulta1VO.valores());

    }
}

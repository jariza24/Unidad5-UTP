package modelo.VO;


import modelo.DAO.Consulta1DAO;

import java.sql.*;

public class Consulta1VO {

    public static void valores(){

        ResultSet rs = null;
        String salida = "";
        try{
            rs = Consulta1DAO.consulta();

            while (rs.next()){
                int ID = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");

                System.out.println(String.format("%5d %-15s %-15s %-15s",ID, nombre, apellido, ciudad));

            }

        }catch (Exception e){
            System.err.println(e);
        }

    }

    public static void main(String[] args) {
        Consulta1VO.valores();
    }
}

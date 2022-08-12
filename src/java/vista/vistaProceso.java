package vista;

import javax.swing.*;
import modelo.VO.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaProceso extends JFrame{

    private JPanel mainFrame;
    private JButton btnConsulta1;
    private JButton btnConsulta2;
    private JButton btnConsulta3;
    private JButton btnLimpiar;
    private JTextArea txtSalida;

    public vistaProceso(){
        setContentPane(mainFrame);
        setSize(900,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        btnConsulta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSalida.setText("");
                txtSalida.append(Consulta1VO.valores());
            }});
        btnConsulta2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSalida.setText("");
                txtSalida.append(Consulta2VO.valores());
            }});
        btnConsulta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSalida.setText("");
                txtSalida.append(Consulta3VO.valores());
            }});
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSalida.setText("");
            }});
    }

    public static void main(String[] args) {
        vistaProceso vista = new vistaProceso();

    }

}

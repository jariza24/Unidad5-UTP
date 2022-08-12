package vista;

import modelo.VO.Consulta1VO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaIngreso extends JFrame{
    private JPanel mainFrame;
    private JButton btnIngresar;
    private vistaProceso vistaProceso;

    public vistaIngreso(vistaProceso vistaProceso){
        setContentPane(mainFrame);
        setSize(1000,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        this.vistaProceso = vistaProceso;
        btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                vistaProceso.setVisible(true);
            }});

    }

    public static void main(String[] args) {


    }
}

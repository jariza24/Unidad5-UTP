package vista;

import javax.swing.*;
import java.awt.*;

public class vistaIngreso extends JFrame{
    private JPanel mainFrame;

    public vistaIngreso(){
        setContentPane(mainFrame);
        setSize(1000,600);
        setPreferredSize(new Dimension(1000,600));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        vistaIngreso vista = new vistaIngreso();

    }
}

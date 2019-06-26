package mensajepantallar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mensajepantallar extends JFrame implements ActionListener {

    private JButton boton;

    public static void main(String[] args) {
        Mensajepantallar marco = new Mensajepantallar();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n, m;
        n = 10;
        m = 5;
        while ((n > 0) || (m > 0)) {
            n = n - 1;
            m = m - 1;
        }
        JOptionPane.showMessageDialog(null,("n = " + Integer.toString(n) +
        " m = " + Integer.toString(m)));

    }
}

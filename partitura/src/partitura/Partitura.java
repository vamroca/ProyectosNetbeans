package partitura;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Partitura extends JFrame implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
        Partitura marco = new Partitura();
        marco.setSize(600, 700);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 600));
        panel.setBackground(Color.white);
        window.add(panel);
        boton = new JButton("aceptar");
        window.add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        int y;
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 250, 200);
        y = 10;
        for (int partitura = 1; partitura <= 8; partitura++) {
            for (int cont = 1; cont <= 5; cont++) {
                paper.setColor(Color.BLACK);
                paper.drawLine(10, y, 150, y);
                y = y + 12;
            }
            y = y + 15;
        }
    }
}

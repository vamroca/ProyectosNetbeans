package estrellas;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Estrellas extends JFrame implements ActionListener {

    private JButton boton;
    private JPanel panel;
    private Random aleatorio;

    public static void main(String[] args) {
        Estrellas marco = new Estrellas();
        marco.setSize(400, 320);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(202, 200));
        panel.setBackground(Color.WHITE);
        window.add(panel);

        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);
        
        aleatorio = new Random();
    }

    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.black);
        paper.fillRect(0, 0, 200, 200);
        paper.setColor(Color.white);
        for (int cont = 0; cont < 20; cont++) {
            int x, y, radio;
//            x = 10;
//            y = 20;
            x = aleatorio.nextInt(200);
            y = aleatorio.nextInt(200);
            radio = 5;
            paper.fillOval(x, y, radio, radio);
        }
    }

}

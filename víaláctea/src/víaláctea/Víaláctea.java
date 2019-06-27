package víaláctea;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Víaláctea extends JFrame implements ActionListener {

    private JButton boton;
    private JPanel panel;
    private Random aleatorio;
    private int x, y, c = 0, radio;

    public static void main(String[] args) {
        Víaláctea marco = new Víaláctea();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 250));
        panel.setBackground(Color.white);
        window.add(panel);

        boton = new JButton("click");
        window.add(boton);
        boton.addActionListener(this);

        aleatorio = new Random();
    }

    public void actionPerformed(ActionEvent e) {
//    dibujarestrella();
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 300, 250);
        paper.setColor(Color.black);
        for (int c = 0; c < 100; c++) {
            x = aleatorio.nextInt(300);
            y = aleatorio.nextInt(250);
            radio = aleatorio.nextInt(10);
            paper.fillOval(x, y, radio, radio);
        }
    }
}

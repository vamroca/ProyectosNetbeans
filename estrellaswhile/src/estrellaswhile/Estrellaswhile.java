package estrellaswhile;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Estrellaswhile extends JFrame implements ActionListener {

    private JButton boton;
    private JPanel panel;
    private Random aleatorio;
    private int x, y, cont = 0, radio = 5;

    public static void main(String[] args) {
        Estrellaswhile marco = new Estrellaswhile();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(202, 200));
        panel.setBackground(Color.white);
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
        while (cont < 20) {
            x = aleatorio.nextInt(200);
            y = aleatorio.nextInt(200);
            radio = 5;
            paper.fillOval(x, y, radio, radio);
            cont++;
        }
    }
}

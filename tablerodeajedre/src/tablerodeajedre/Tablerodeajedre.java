package tablerodeajedre;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Tablerodeajedre extends JFrame implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
        Tablerodeajedre marco = new Tablerodeajedre();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 150));
        panel.setBackground(Color.WHITE);
        window.add(panel);

        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();
        int x;
        int barra = 9;
        int y;
        int c;
        paper.setColor(Color.WHITE);
        paper.fillRect(0, 0, 180, 50);
        x = 10;
        c = 1;
        paper.setColor(Color.BLACK);
        while (c <= barra) {
            paper.drawLine(x, 0, x, 130);
            x = x + 15;
            c++;
        }
        y = 10;
        c = 1;
        paper.setColor(Color.BLACK);
        while (c <= barra) {
            paper.drawLine(0, y, 130, y);
            y = y + 15;
            c++;
        }

    }
}

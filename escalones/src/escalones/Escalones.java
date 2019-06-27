package escalones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Escalones extends JFrame implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
        Escalones marco = new Escalones();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        boton = new JButton("clickes");
        window.add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics paper = panel.getGraphics();

        int x;
        int y;
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 250, 200);
        y = 5;
        for (int escalones = 1; escalones <= 5; escalones++) {
            x = 5;
            for (int cont = 1; cont <= 5; cont++) {
                paper.setColor(Color.BLACK);
//                paper.drawRect(x - y + x - y, y + x + y + x, 20, 20);
                paper.drawRect(x, y + x + y + x, 20, 20);
                x = x + 19;
            }
            y = y + 19;

        }
    }
}

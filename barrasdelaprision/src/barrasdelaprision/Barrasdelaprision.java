package barrasdelaprision;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Barrasdelaprision extends JFrame implements ActionListener,
        ChangeListener {

    private JButton boton;
    private JPanel panel;
    private JSlider des;

    public static void main(String[] args) {
        Barrasdelaprision marco = new Barrasdelaprision();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        
        des = new JSlider(0, 5, 1);
        window.add(des);
        des.addChangeListener(this);

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
        int barra = 5;
        int c;
        paper.setColor(Color.WHITE);
        paper.fillRect(0, 0, 180, 50);
        x = 10;
        c = 1;
        paper.setColor(Color.BLACK);
        while (c <= barra) {
            paper.drawLine(x, 0, x, 150);
            x = x + 15;
            c++;
        }
    }

    public void stateChanged(ChangeEvent e) {
        Graphics paper = panel.getGraphics();
        int x, numboxs, c;
        numboxs = des.getValue();
        paper.setColor(Color.WHITE);
        paper.fillRect(0, 0, 180, 150);
        x = 10;
        c = 1;
        paper.setColor(Color.BLACK);
        while (c <= numboxs) {
            paper.drawLine(x, 0, x, 150);
            x = x + 15;
            c++;
        }
    }
}

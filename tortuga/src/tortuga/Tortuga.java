/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.AffineTransform;
//import javax.swing.;
//import javax.swing.JComponent;

public class Tortuga extends JFrame implements
        ActionListener,
        ChangeListener {

    private JPanel panel;
//    private JButton arriba;
//    private JButton abajo;
    private JButton left;
    private JButton rigth;
    private JLabel Hori;
    private JLabel Vertical;
    private JSlider moveh;
    private JSlider movev;
    private JTextField txtmove;
    private int h;
    private int v;
//    private int move = 0;

    public static void main(String[] args) {
        Tortuga marco = new Tortuga();
        marco.setSize(500, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        Hori = new JLabel("← o →");
        window.add(Hori);

        moveh = new JSlider(JSlider.HORIZONTAL, 1, 250, 1);
        window.add(moveh);
        moveh.addChangeListener(this);

        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(300, 200));
        window.add(panel);

        Vertical = new JLabel("↑ o ↓");
        window.add(Vertical);

        movev = new JSlider(JSlider.VERTICAL, 1, 150, 1);
        window.add(movev);
        movev.addChangeListener(this);

        left = new JButton("Girar a la izquierda");
        window.add(left);
        left.addActionListener(this);

        rigth = new JButton("Girar a la derecha");
        window.add(rigth);
        rigth.addActionListener(this);

        txtmove = new JTextField(10);
        window.add(txtmove);
    }

    public void actionPerformed(ActionEvent e) {

        Object click = e.getSource();
        if (click == rigth) {
            derecha();

        }
        if (click == left) {
            izquierda();

        }
    }

    public void stateChanged(ChangeEvent e) {

        Graphics papel = panel.getGraphics();
        h = moveh.getValue();
        v = movev.getValue();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        papel.setColor(Color.RED);
        dtorutuga(papel, h, v);

        txtmove.setText(" H " + h + " V " + v);

    }

    private void dtorutuga(Graphics dibujo, int h, int v) {
        dibujo.fillOval(h, v, 50, 50);

    }

    private void derecha() {

        Graphics papel = panel.getGraphics();
        h = moveh.getValue();
        v = movev.getValue();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        papel.setColor(Color.RED);
        dtorutuga(papel, h, v);
        papel.translate(h, h);

    }

    private void izquierda() {

        Graphics papel = panel.getGraphics();
        h = moveh.getValue();
        v = movev.getValue();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        papel.setColor(Color.RED);
        dtorutuga(papel, h, v);
        papel.translate(h, h);

    }

}

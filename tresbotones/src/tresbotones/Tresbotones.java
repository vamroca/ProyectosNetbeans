/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresbotones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Tresbotones extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel lblbutton;
    private JTextField txtbutton;
    private JPanel panel;

    public static void main(String[] args) {
        Tresbotones marco = new Tresbotones();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblbutton = new JLabel("El boton que presiono es el:");
        window.add(lblbutton);

        txtbutton = new JTextField(5);
        window.add(txtbutton);

        button1 = new JButton("1");
        window.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        window.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        window.add(button3);
        button3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == button1) {
            txtbutton.setText("Boton 1");
        }
        if (click == button2) {
            txtbutton.setText("Boton 2");
        }
        if (click == button3) {
            txtbutton.setText("Boton 3");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cine extends JFrame implements ActionListener {

    private JButton button;
    private JLabel lbledad;
    private JTextField txtedad;
    private JTextField txtrespuesta;

    public static void main(String[] args) {
        Cine marco = new Cine();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lbledad = new JLabel("Ingrese su edad");
        window.add(lbledad);

        txtedad = new JTextField(5);
        window.add(txtedad);

        txtrespuesta = new JTextField(10);
        window.add(txtrespuesta);

        button = new JButton("aceptar");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int edad;
        edad = Integer.parseInt(txtedad.getText());
        if (edad < 5) {
            txtrespuesta.setText("Funcion Gratis");
        } else {
            if ((edad >= 5) && (edad <= 12)) {

                txtrespuesta.setText("Paga la Mitad");
            } else {
                if ((edad >= 13) && (edad <= 54)) {
                    txtrespuesta.setText("Paga Completa");
                } else {
                    txtrespuesta.setText("Funcion Gratis");
                }

            }

        }

    }

}

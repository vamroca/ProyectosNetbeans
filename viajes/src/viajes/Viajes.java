/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Viajes extends JFrame implements ActionListener {

    private JLabel lbldatos;
    private JTextField txtedad;
    private JTextField txtbox;
    private JButton button;

    public static void main(String[] args) {
        Viajes marco = new Viajes();
        marco.setSize(250, 120);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lbldatos = new JLabel("Ingrese su edad para continuar");
        window.add(lbldatos);

        txtedad = new JTextField(5);
        window.add(txtedad);

        txtbox = new JTextField(10);
        window.add(txtbox);

        button = new JButton("Aceptar");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int edad;
        edad = Integer.parseInt(txtedad.getText());
        if ((edad >= 18) && (edad <= 30)) {
            txtbox.setText("Aceptado");
        } else {
            txtbox.setText("No Aceptado");

        }

    }

}

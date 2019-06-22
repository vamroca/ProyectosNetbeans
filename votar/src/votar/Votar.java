/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Votar extends JFrame implements ActionListener {
    
    private JTextField txtedad;
    private JTextField txtvoto;
    private JTextField txtcomentario;
    private JTextField txtcomentarios;
    private JLabel lbledad;
    private JButton button;

    public static void main(String[] args) {
        Votar marco = new Votar();
        marco.setSize(150, 200);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        lbledad = new JLabel("Ingrese su edad");
        window.add(lbledad);

        txtedad = new JTextField(5);
        window.add(txtedad);

        button = new JButton("Verificar");
        window.add(button);
        button.addActionListener(this);

        txtvoto = new JTextField(10);
        window.add(txtvoto);

        txtcomentario = new JTextField(10);
        window.add(txtcomentario);

        txtcomentarios = new JTextField(10);
        window.add(txtcomentarios);

    }

    public void actionPerformed(ActionEvent e) {
        int edad;

        edad = Integer.parseInt(txtedad.getText());
        if (edad > 17) {
            txtvoto.setText("puede votar");
            txtcomentario.setText("felicidades");
        } else {
            txtvoto.setText("no puede votar");
            txtcomentario.setText("lo siento");
        }
        txtcomentarios.setText("le deseo lo mejor");
    }

}

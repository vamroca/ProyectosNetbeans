/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cartas extends JFrame implements ActionListener {

    private JButton button;
    private JLabel lbltexto;
    private JTextField txttexto;
    private JTextField txttexto2;
    private int carta;
    private String nombrecarta;

    public static void main(String[] args) {
        Cartas marco = new Cartas();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lbltexto = new JLabel("Ingrese su carta");
        window.add(lbltexto);

        txttexto = new JTextField(10);
        window.add(txttexto);

        txttexto2 = new JTextField(10);
        window.add(txttexto2);

        button = new JButton("aceptar");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        carta = Integer.parseInt(txttexto.getText());
        txttexto2.setText(nombrecarta);
        cartasl();
    }

    private void cartasl() {
        switch (carta) {
            case 1:
                nombrecarta = "Diams";
                carta = Integer.parseInt(txttexto.getText());
                txttexto.setText(nombrecarta);
                break;
                
            case 2:
                nombrecarta = "Cora";
                carta = Integer.parseInt(txttexto.getText());
                txttexto.setText(nombrecarta);
                break;
                
            case 3:
                nombrecarta = "Tre";
                carta = Integer.parseInt(txttexto.getText());
                txttexto.setText(nombrecarta);
                break;
                
            case 4:
                nombrecarta = "Espa";
                carta = Integer.parseInt(txttexto.getText());
                txttexto.setText(nombrecarta);
                break;

            default:
                nombrecarta = "gg";
                break;

        }

    }

}

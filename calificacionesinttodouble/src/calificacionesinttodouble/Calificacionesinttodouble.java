/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesinttodouble;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calificacionesinttodouble extends JFrame implements ActionListener {

    private JButton button;

    public static void main(String[] args) {
        Calificacionesinttodouble marco = new Calificacionesinttodouble();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button = new JButton("Haga click");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int primerparcial;
        int segundoparcial;
        int tercerparcial;
        String primerparcials;
        String segundoparcials;
        String tercerparcials;
        double promedio;

        primerparcials = JOptionPane.showInputDialog("Ingrese el Primer Parcial");
        primerparcial = Integer.parseInt(primerparcials);
        segundoparcials = JOptionPane.showInputDialog("Ingrese el Segundo Parcial");
        segundoparcial = Integer.parseInt(segundoparcials);
        tercerparcials = JOptionPane.showInputDialog("Ingrese el Tercer Parcial");
        tercerparcial = Integer.parseInt(tercerparcials);
        promedio = primerparcial + segundoparcial + tercerparcial / 3;
        JOptionPane.showMessageDialog(null, "el promedio general es " + promedio);
    }
}

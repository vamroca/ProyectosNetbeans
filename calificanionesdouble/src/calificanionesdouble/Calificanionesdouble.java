/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificanionesdouble;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calificanionesdouble extends JFrame implements ActionListener {

    private JButton button;

    public static void main(String[] args) {
        Calificanionesdouble marco = new Calificanionesdouble();
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
        double primerparcial;
        double segundoparcial;
        double tercerparcial;
        double promedio;
        String primerparcials;
        String segundoparcials;
        String tercerparcials;

        primerparcials = JOptionPane.showInputDialog("Ingrese el Primer Parcial");
        primerparcial = Double.parseDouble(primerparcials);
        segundoparcials = JOptionPane.showInputDialog("Ingrese el Segundo Parcial");
        segundoparcial = Double.parseDouble(segundoparcials);
        tercerparcials = JOptionPane.showInputDialog("Ingrese el Tercer Parcial");
        tercerparcial = Double.parseDouble(tercerparcials);
        promedio = primerparcial + segundoparcial + tercerparcial / 3;
        JOptionPane.showMessageDialog(null, "el promedio general es " + promedio);
    }

}

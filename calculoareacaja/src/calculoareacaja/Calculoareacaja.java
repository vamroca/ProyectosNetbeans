/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoareacaja;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculoareacaja extends JFrame implements ActionListener {

    private JButton button;

    public static void main(String[] args) {
        Calculoareacaja marco = new Calculoareacaja();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        button = new JButton("Haga clic");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double area;
        double longitud;
        double anchura;
        double altura;
        String longituds;
        String anchuras;
        String alturas;

        longituds = JOptionPane.showInputDialog("Longitud:");
        longitud = Double.parseDouble(longituds);
        anchuras = JOptionPane.showInputDialog("Ancho:");
        anchura = Double.parseDouble(anchuras);
        alturas = JOptionPane.showInputDialog("Altura:");
        altura = Double.parseDouble(alturas);
        area = longitud * anchura / 1.000;
        JOptionPane.showMessageDialog(null, "el area es de la caja es: " + area);
        
    }
}

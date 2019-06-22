/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intereses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intereses extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Intereses marco = new Intereses();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        button = new JButton("Haz click");
        window.add(button);
        button.addActionListener((ActionListener) this);
    }

    public void actionPerformed(ActionEvent e) {

        double interes;
        interes = resultadosCincoanios(500,1.5)*5;
        JOptionPane.showMessageDialog(null, "El dinero depositado es: " + interes);
    }

    public double resultadosCincoanios(double c, double i) {
        double cantidad;
        cantidad = c * (1 + i / 100);
        return cantidad;

    }

}

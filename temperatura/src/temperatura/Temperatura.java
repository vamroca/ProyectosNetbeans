/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperatura extends JFrame implements ActionListener {

    private JButton button;

    public static void main(String[] args) {
        Temperatura marco = new Temperatura();
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
    
    public void actionPerformed (ActionEvent e){
    int f;
    int c;
    String fs;
    
    fs = JOptionPane.showInputDialog("Ingrese la temperatura Fahrenheit a convertir a Celsius");
    f = Integer.parseInt(fs);
    c = (f - 32) * 5 / 9;
    JOptionPane.showMessageDialog(null, "La temperatura equilavente a Celsius es: " + c);
    
    }

}

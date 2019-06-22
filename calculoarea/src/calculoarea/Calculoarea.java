/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoarea;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calculoarea extends JFrame implements ActionListener{

    private JButton button;


    public static void main(String[] args) {
        Calculoarea marco = new Calculoarea();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        button = new JButton ("Haga clic");
        window.add(button);
        button.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e){
    int area;
    int longitud;
    int anchura;
    longitud = 20;
    anchura = 10;
    area = longitud * anchura;

    JOptionPane.showMessageDialog(null,"el area es: " + area);
//    JOptionPane.showMessageDialog(null,"5" + "5" + 5 + 5);
//    JOptionPane.showMessageDialog(null,"5" + "5" + (5 + 5));
    }
    
}

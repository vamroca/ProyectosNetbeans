/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleotiempocompleto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Empleotiempocompleto extends JFrame implements ActionListener {

    private JLabel lblaño;
    private JTextField txtaño;
    private JButton button;

    public static void main(String[] args) {
        Empleotiempocompleto marco = new Empleotiempocompleto();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
        lblaño = new JLabel("Ingrese su edad");
        window.add(lblaño);
        
        txtaño = new JTextField(7);
        window.add(txtaño);
        
        button = new JButton("Aceptar");
        window.add(button);
        button.addActionListener(this);
    } 
    
    public void actionPerformed(ActionEvent e){
            int edad;

        edad = Integer.parseInt(txtaño.getText());
        if ((edad >= 16) && (edad < 65)) {
            txtaño.setText("Aceptado");
            JOptionPane.showMessageDialog(null, "Cumple con los requisitos");
         } else {
            txtaño.setText("No Aceptado");
            JOptionPane.showMessageDialog(null, "No cumple con los requisitos");

        }
    
    }

}

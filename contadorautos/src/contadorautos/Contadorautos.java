/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorautos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Contadorautos extends JFrame implements ActionListener {
    private int ca = 0;
    private JButton button;
    private JTextField campo;
    
    public static void main(String[] args) {
        Contadorautos marco = new Contadorautos();
        marco.setSize(400,300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        campo = new JTextField(7);
        window.add(campo);
        


        
        button = new JButton("Ingresa un auto");
        window.add(button);
        button.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
    ca = ca + 1;
    campo.setText(Integer.toString(ca));
//    JOptionPane.showMessageDialog(null, "Autos: " + ca);
    }

 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unaclase;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Unaclase extends JFrame implements ActionListener {

    private int n = 8;
    private JButton button;

            
    public static void main(String[] args) {
        Unaclase marco = new Unaclase();
        marco.setSize(400,300);
        marco.createGUI();
        marco.setVisible(true);
    }
        private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        button = new JButton(" ");
        window.add(button);
        button.addActionListener(this);
        
    }
        
           
        private void mimetodo(){
        int n;
        n = 3;      
    }

        public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Auida" + n);
        }
}

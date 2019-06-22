/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarnombre;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mostrarnombre extends JFrame implements  ActionListener{

    private JButton button;
    private JPanel panel;
    
    
    public static void main(String[] args) {
        Mostrarnombre marco = new Mostrarnombre();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    
    private void createGUI(){
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
    
    public void actionPerformed(ActionEvent e){
        String na;
        na = mostrarnombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        JOptionPane.showMessageDialog(null,"Su nombre es: " + na);
        
    }
    private String mostrarnombre(String name){
        String n;
        n = name;
        return n;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulgadasacentimetrois;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pulgadasacentimetrois extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args) {
    Pulgadasacentimetrois marco = new Pulgadasacentimetrois();
    marco.setSize(400,300);
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
    
    public void actionPerformed(ActionEvent e) {
        double as;
//        String es;
//        es = equivalentePulgadas(JOptionPane.showInputDialog("Ingrese el valor en centimetros:")
//                ,(JOptionPane.showMessageDialog(null,"Su conversion a pulgadas es: " + e)));
//        e = Double.parseDouble(es);
        as = equivalentePulgadas(10.5);
        JOptionPane.showMessageDialog(null,"En centimetros es: " + as);
//        e 
    }
    
    public double equivalentePulgadas(double centimetros){
        double conversion;
        double pulgadas = 0.394;
        conversion = centimetros * pulgadas;
        return conversion;
    }


}

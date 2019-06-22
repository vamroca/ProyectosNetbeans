/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Areacirculo extends JFrame implements ActionListener{
    
    private JButton button;
    private JPanel panel;
    
    
    public static void main(String[] args) {
        Areacirculo marco = new Areacirculo();
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
        double as;
        as = areacirculo(1.25);
        JOptionPane.showMessageDialog(null,"El area de un criculo es: " + as);
    }
    
    public double areacirculo(double radio){
        double area;
        area = (Math.PI * radio) * radio * radio;
//        perimetro = (2 * Math.PI * radio);
        return area;
    }
}

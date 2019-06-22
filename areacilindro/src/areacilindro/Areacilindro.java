/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacilindro;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Areacilindro extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Areacilindro marco = new Areacilindro();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    
    private  void createGUI(){
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
        double ac;
        double acspeinf;
        ac = areacirculo(1.25);
        acspeinf = perimetro(1.25);
        JOptionPane.showMessageDialog(null,"El area de un criculo es: " + ac + 
                "\nEl area de un cilindro de la parte superior es: " + acspeinf +
                "\nEl area de un cilindro de la parte inferior es: "+ acspeinf);
    
    }
    
    public double areacirculo(double radio){
        double area;
        area = (Math.PI * radio) * radio * radio;
        return area;
    }
    
    public double perimetro(double radio){
        double areasup;
        areasup =(2 * Math.PI * radio);
        return areasup;
    }
}

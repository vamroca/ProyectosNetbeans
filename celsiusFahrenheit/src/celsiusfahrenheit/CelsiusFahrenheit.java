/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfahrenheit;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class CelsiusFahrenheit extends JFrame implements 
//       ActionListener, 
        ChangeListener {

    private int celsius = 0;
    private JPanel panel;
    private JTextField txtcelsius, txtfa;
    private JLabel lblcelsius, lblfa;
    private JSlider desliable;
//    private JButton button;

    public static void main(String[] args) {
        CelsiusFahrenheit marco = new CelsiusFahrenheit();
        marco.setSize(300, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 212));
        panel.setBackground(Color.white);
        window.add(panel);



//        lblcelsius = new JLabel("Ingrese los grados celsius ");
//        window.add(lblcelsius);
//        
//        txtcelsius = new JTextField(5);
//        window.add(txtcelsius);
//        
//        button = new JButton("Convertir");
//        window.add(button);
//        button.addActionListener(this);
        lblfa = new JLabel("Celsius equivalente a Fahrenheit es: ");
        window.add(lblfa);

        txtfa = new JTextField(5);
        window.add(txtfa);

        desliable = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        window.add(desliable);

        desliable.addChangeListener(this);
        txtfa.setText(Integer.toString(desliable.getValue()));

    }
//
//    public void actionPerformed(ActionEvent e) {
//        
//    
//////        int ca = Integer.parseInt(txtcelsius.getText());
//////        txtfa.setText(Integer.toString((ca * 9) / 5 + 32));
////
////////        int x, y, tamaño;
////////        Graphics papel = panel.getGraphics();
////////        x = desliable.getExtent();
////////        y = desliable.getHeight();
////////        tamaño = desliable.getValue();
////////        papel.fillRect(x, y, tamaño, tamaño);
////
////
//    }

    public void stateChanged(ChangeEvent e) {
        int timegap;
//                ,x, y;
   
        

                        
        Graphics papel = panel.getGraphics();
        timegap = desliable.getValue();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 200, 212);
        papel.setColor(Color.yellow);
        papel.fillRect(0, 0, timegap / 2, ((timegap * 9) / 5 + 32 ));
        papel.setColor(Color.green);
        papel.fillRect(100, 0, timegap / 2, timegap);
        
        

        
        
        
//
//        x = desliable.getExtent();
//        y = desliable.getHeight();
//        papel.setColor(Color.ORANGE);
//        papel.fillRect(x, y, timegap / 2, ((timegap * 9) / 5 + 32 ));
//        papel.setColor(Color.RED);
//        papel.fillRect(x, y, timegap / 2, timegap);


        txtfa.setText(Integer.toString(timegap));
        
    }

}

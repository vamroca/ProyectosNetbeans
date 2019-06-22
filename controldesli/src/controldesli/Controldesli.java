/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldesli;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Controldesli extends JFrame implements ActionListener,
        ChangeListener{
        
    private JSlider des;
    private JButton button;
    private JTextField txtfield;
    private int max = 0;

    public static void main(String[] args) {
        Controldesli marco = new Controldesli();
        marco.setSize(200, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
//        this.setLocationRelativeTo(null);        
        des = new JSlider(JSlider.VERTICAL, 0,100,0);
        des.setMajorTickSpacing(10);
        des.setPaintTicks(true);
        des.addChangeListener(this);
        window.add(des);
        
        txtfield = new JTextField(12);
        window.add(txtfield);
        
        button = new JButton("restablecer");
        button.addActionListener(this);
        window.add(button);
        
    }
    
    public void actionPerformed(ActionEvent e){
    txtfield.setText("");
    max = 100;
    }
    
    public void stateChanged(ChangeEvent e){
    int tempo;
    tempo = des.getValue();
    if(tempo > max){
        max = tempo;
        
    }
    mostrar();
    }
    
    private void mostrar(){
    txtfield.setText("el valor maximo es: " + max);
    }
}

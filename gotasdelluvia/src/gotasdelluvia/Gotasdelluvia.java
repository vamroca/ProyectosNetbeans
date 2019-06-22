/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gotasdelluvia;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Gotasdelluvia extends JFrame implements ActionListener, ChangeListener {
    private JPanel panel;
    private Random aleatorio;
    private JSlider desliable;
    private javax.swing.Timer temporiador;
    private JTextField txtintervalo;
    private JLabel lblintervalo;
    

    
    public static void main(String[] args) {
        Gotasdelluvia marco = new Gotasdelluvia();
        marco.setSize(250, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private  void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        aleatorio = new Random();
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        
        lblintervalo = new JLabel("Intervalo de tiempo: ");
        window.add(lblintervalo);
        txtintervalo = new JTextField(10);
        window.add(txtintervalo);
        desliable = new JSlider(JSlider.HORIZONTAL,200,2000,1000);
        window.add(desliable);
        desliable.addChangeListener(this);
        txtintervalo.setText(Integer.toString(desliable.getValue()));
        temporiador = new javax.swing.Timer(1000, this);
        temporiador.start();
        
    }
    
    public void actionPerformed(ActionEvent e){
        int x, y, tamaño;
        Graphics papel = panel.getGraphics();
        x = aleatorio.nextInt(200);
        y = aleatorio.nextInt(200);
        tamaño = aleatorio.nextInt(20);
        papel.fillOval(x, y, tamaño, tamaño);
    }
    
    public void stateChanged(ChangeEvent e){
    int timegap = desliable.getValue();
    txtintervalo.setText(Integer.toString(timegap));
    temporiador.setDelay(timegap);
    }
    
}

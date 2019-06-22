/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Minutos extends JFrame implements ActionListener {

    private JPanel panel;
    private int tics = 0;
    private Timer temporiador;
    private  JTextField txtsegs, txtmins;
    private JLabel lblsegs, lblmins;

    public static void main(String[] args) {
        Minutos marco = new Minutos();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        lblmins = new JLabel("Minutos: ");
        window.add(lblmins);
        
        txtmins = new JTextField(2);
        window.add(txtmins);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 212));
        panel.setBackground(Color.white);
        window.add(panel);
              
       
        lblsegs = new JLabel("Segundos: ");
        window.add(lblsegs);
        
        txtsegs = new JTextField(2);
        window.add(txtsegs);
        
        temporiador = new Timer(200, this);
        temporiador.start();
        
    }
    
    public void actionPerformed(ActionEvent e){
        int timegapm =(tics / 60);
        int timegaps =(tics % 60);
        Graphics papel = panel.getGraphics();
 
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 200, 500);
        papel.setColor(Color.RED);
        papel.fillRect(0, 0, timegapm , timegapm);
        papel.setColor(Color.BLUE);
        papel.fillRect(0, 150, timegaps, timegaps);
        
            
        txtmins.setText(Integer.toString(timegapm));
        txtsegs.setText(Integer.toString(timegaps));
        tics = tics + 1;
    }
   
}

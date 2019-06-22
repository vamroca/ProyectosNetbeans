/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotimer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplotimer extends JFrame implements ActionListener {
    private  JTextField txtsegs, txtmins;
    private JLabel lblsegs, lblmins;
    private int tics = 0;
    private Timer temporiador;
    
    public static void main(String[] args) {
        Ejemplotimer marco = new Ejemplotimer();
        marco.setSize(300, 100);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        
        lblmins = new JLabel("Minutos: ");
        window.add(lblmins);
        
        txtmins = new JTextField(2);
        window.add(txtmins);
        
        lblsegs = new JLabel("Segundos: ");
        window.add(lblsegs);
        
        txtsegs = new JTextField(2);
        window.add(txtsegs);
        
        temporiador = new Timer(1000, this);
        temporiador.start();
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        txtmins.setText(Integer.toString(tics / 60));
        txtsegs.setText(Integer.toString(tics % 60));
        tics = tics + 1;
    }
    
    
}

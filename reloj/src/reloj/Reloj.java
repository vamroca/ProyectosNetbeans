/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reloj extends JFrame implements ActionListener  {

    private JButton button;
    
    public static void main(String[] args) {

        Reloj marco = new Reloj();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){ 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button = new JButton("Haga click");
        window.add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e){
    int s;
    int h;
    int m;
    int se;
    String ss;
    
    ss = JOptionPane.showInputDialog("Ingrese la segundos: ");
    s = Integer.parseInt(ss);
    h = (s / 3600);
    m = (s / 60);
    se = (s / 1);
    JOptionPane.showMessageDialog(null, "La Hora es: " + h + "\n Minutos: " + m + "\n Segundos: " + se);
    }
    
}

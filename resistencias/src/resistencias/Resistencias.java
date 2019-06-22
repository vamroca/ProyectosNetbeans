/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistencias;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Resistencias extends JFrame implements ActionListener {

    private JButton button;
    
    public static void main(String[] args) {
        
        Resistencias marco = new Resistencias();
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
    
    public void actionPerformed(ActionEvent e){
    int rf;
    int rs;
    int serie;
    int paralelo;
    
    String rfs;
    String rss;
    
    rfs = JOptionPane.showInputDialog("Ingrese la Primera resistencia");
    rf = Integer.parseInt(rfs);
    rss = JOptionPane.showInputDialog("Ingrese la Segunda resistencia");
    rs = Integer.parseInt(rss);
    serie = rf + rs;
    paralelo = (rf * rs) / (rf + rs);
    JOptionPane.showMessageDialog(null, "La Resistencia en Seria es: " + serie +
            "\n y la Resstencia en Paralelo es: " + paralelo);
    }
    
}

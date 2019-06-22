/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadora;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dispensadora extends JFrame implements ActionListener {

    private JButton button;
    
    public static void main(String[] args) {
        Dispensadora marco = new Dispensadora();
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
        int centavos;
        int euro;
        int cambio;
        String centavoss;
        
        centavoss = JOptionPane.showInputDialog("Inserte la moneda: ");
        centavos = Integer.parseInt(centavoss);
        euro = 100;
        cambio = euro - centavos;
        JOptionPane.showMessageDialog(null, "Su cambio es: " + cambio);
        
        
        }
    
}

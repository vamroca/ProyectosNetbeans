/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodocriculo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Metodocriculo extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Metodocriculo marco = new Metodocriculo();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
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
    
    public void actionPerformed (ActionEvent e){
    Graphics areadibujo = panel.getGraphics();
//    dibujarcirculo(areadibujo, 100, 100, 100);
//    dibujarcirculo(areadibujo, 50, 100, 100);
//    dibujarcirculo(areadibujo, 50, 50, 50);
    dibujarcirculo(areadibujo, 50, 50);
    
    
    }
    
    private void dibujarcirculo(Graphics areadibujo, int xC, int yC, int radio){
    areadibujo.drawOval(yC, xC, yC, radio);
    }
    private void dibujarcirculo(Graphics areadibujo, int xC, int yC){
    areadibujo.drawOval(yC, xC, yC, xC);
    }
}

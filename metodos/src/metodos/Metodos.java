/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Metodos extends JFrame implements ActionListener{
    
    
    
    
        private JButton button;
        private JPanel panel;


    public static void main(String[] args) {
        Metodos marco = new Metodos();
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

    public void actionPerformed(ActionEvent event) {
        Graphics papel = panel.getGraphics();
        papel.drawLine(0, 0, 100, 100);
        papel.setColor(Color.red);
        papel.drawLine(0, 0, 100, 50);
        papel.setColor(Color.green);
        papel.drawOval(100, 100, 50, 50);

    }

}   


    

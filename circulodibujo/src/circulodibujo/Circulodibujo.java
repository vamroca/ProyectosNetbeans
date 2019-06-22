/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulodibujo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Circulodibujo extends JFrame implements ActionListener {


        private JButton button;
        private JPanel panel;
        
    public static void main(String[] args) {

     Circulodibujo marco = new Circulodibujo();
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
        papel.setColor(Color.pink);
        papel.drawOval(150, 100, 100, 100);
        papel.setColor(Color.green);
        papel.drawLine(150, 100, 10, 100);
        papel.drawLine(100, 150, 100, 10);
        papel.drawLine(100, 0, 10, 100);
        papel.drawLine(150, 0, 100, 10);
        papel.setColor(Color.ORANGE);
//        papel.drawRect(100, 10, 100, 100);
        papel.fillRect(100, 10, 100, 100);
 
        
//        papel.setColor(Color.red);
//        papel.drawLine(100, 10, 100, 100);
//        papel.drawLine(10, 100, 100, 100);
//        papel.setColor(Color.DARK_GRAY);
//        papel.drawLine(20, 80, 70, 10);
//        papel.drawLine(70, 10, 120, 80);
//        papel.drawLine(20, 80, 120, 80);
        
        
        
        
        
        


    }
    
}

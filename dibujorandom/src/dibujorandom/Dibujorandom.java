/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujorandom;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dibujorandom extends JFrame implements ActionListener{
    private int x = 0;
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args) {
        Dibujorandom marco = new Dibujorandom();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
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
    
    public void actionPerformed(ActionEvent e){
    Graphics paper = panel.getGraphics();
    Graphics papel = panel.getGraphics();
    papel.setColor(Color.pink);
    paper.setColor(Color.pink);
    x = x + 10;
    }
}

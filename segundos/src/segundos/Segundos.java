/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Segundos extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Segundos marco = new Segundos();
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
    
    public void actionPerformed(ActionEvent e){
        int totalSegs;
        totalSegs = segsEN(1,1,2);
        JOptionPane.showMessageDialog(null,"Segundos totales: " + totalSegs);
    }
    
    
    public int segsEN (int hour, int minutes, int seconds){
    int segundo;
    int h = 3600;
    int min = 60;
    int secon = 1;
    segundo = ((hour * h)+(minutes * min)+(seconds * secon));
    return segundo;
    }
}
//14644

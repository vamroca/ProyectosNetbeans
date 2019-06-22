/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujartriangulo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dibujartriangulo extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Dibujartriangulo marco = new Dibujartriangulo();
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

    public void actionPerformed(ActionEvent e) {
        
        int a = 3;
        int b = 8;
        haceralgo (a, b);
        JOptionPane.showMessageDialog(null, Integer.toString(a));

    }
//        Graphics papel = panel.getGraphics();
////        dibujartriangulo(papel, 100, 100, 40, 40);
////        dibujartriangulo(papel, 10, 100, 20, 60);
//    }
//
////    private void dibujartriangulo(Graphics areadibujo,
////            int lX,
////            int lY,
////            int an,
////            int al) {
////        areadibujo.drawLine(lX, lY, lX, lY + al);
////        areadibujo.drawLine(lX, lY + al, lX + an, lY + al);
////        areadibujo.drawLine(lX, lY, lX + an, lY + al);
//
//    }
    
     private void haceralgo(int x, int y){
        int a = 0;
        a = x + y;
        }

}

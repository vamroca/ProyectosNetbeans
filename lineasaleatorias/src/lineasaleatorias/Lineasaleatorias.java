/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineasaleatorias;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lineasaleatorias extends JFrame implements ActionListener {

    private Random posicionesaleatorias = new Random();
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Lineasaleatorias marco = new Lineasaleatorias();
        marco.setSize(150, 200);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("Haz click");
        window.add(button);
        button.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e) {
        int suertudo;
        suertudo = aleatorioenrango(1, 6);
        int xfinal, yfinal;
        Graphics papel = panel.getGraphics();

        papel.setColor(Color.white);
        papel.fillRect(0, 0, 100, 100);
        papel.setColor(Color.black);

        xfinal = posicionesaleatorias.nextInt(100);
        yfinal = posicionesaleatorias.nextInt(100);
        papel.drawLine(0, 0, xfinal, yfinal);
        JOptionPane.showMessageDialog(null, "number is: " + suertudo);
    }

    public int aleatorioenrango(int min, int max) {

        return min + posicionesaleatorias.nextInt(max - min * 1);
    }
}

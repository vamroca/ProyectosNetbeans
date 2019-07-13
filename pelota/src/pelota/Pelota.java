/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelota;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pelota extends JFrame implements ActionListener {

    private JPanel panel;
    private int x = 7, cambioX = 7;
    private int y = 0, cambioY = 2;
    private final int diametro = 10;
    private final int anchura = 100, altura = 100;
    private JButton btnboton;

    private Pelotas pelotas;

    public static void main(String[] args) {
        Pelota marco = new Pelota();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 150));
        panel.setBackground(Color.white);
        window.add(panel);
        
        btnboton = new JButton("aceptar");
        window.add(btnboton);
        
        pelotas = new Pelotas(panel);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        pelotas.animar();

    }

    public class Pelotas {

        public Pelotas(JPanel elPanel) {
            panel = elPanel;
        }

        public void animar() {
//            eliminar();
            mover();
            rebotar();
            dibujar();
        }

        public void mover() {
            x = x + cambioX;
            y = y + cambioY;
        }

        public void rebotar() {
            if (x <= 0 || x >= anchura) {
                cambioX = -cambioY;
            }
            if (y <= 0 || y >= altura) {
                cambioY = -cambioY;
            }
        }

        public void dibujar() {
            Graphics papel = panel.getGraphics();
            papel.setColor(Color.red);
            papel.fillOval(x, x, diametro, diametro);
        }

//        public void eliminar() {
//            Graphics papel = panel.getGraphics();
//            papel.setColor(Color.white);
//            papel.fillOval(x, x, diametro, diametro);
//        }

    }
}

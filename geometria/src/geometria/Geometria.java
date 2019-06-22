/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Geometria extends JFrame
        implements
        //        ActionListener,
        ChangeListener {

    private JPanel panel;
    private JSlider ph, pv, dia;
    private JLabel lblph, lblpv, lbldia;
    private Random aleatorios = new Random();

    public static void main(String[] args) {
        Geometria marco = new Geometria();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblph = new JLabel("Horin");
        window.add(lblph);
        
        ph = new JSlider(JSlider.HORIZONTAL, 0, 250, 0);
        window.add(ph);

        ph.addChangeListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.WHITE);
        window.add(panel);

        lblpv = new JLabel("Ver");
        window.add(lblpv);
        
        pv = new JSlider(JSlider.VERTICAL, 0, 250, 0);
        window.add(pv);

        pv.addChangeListener(this);
        
        
        dia = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        window.add(dia);
        
        lbldia = new JLabel("Dia");
        window.add(lbldia);

        dia.addChangeListener(this);

    }
    
    public void stateChanged(ChangeEvent e){
    
        int timegap, timegaps, diam, rango;
        
        Graphics papel = panel.getGraphics();
        timegap = ph.getValue();
        timegaps = pv.getValue();
        rango = aleatoriorango(1,250);
        diam = dia.getValue();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        papel.setColor(Color.RED);
        papel.fillOval(timegap, timegaps, diam, diam);
        
        
        papel.setColor(Color.BLACK);
        papel.fillOval(100, 100, diam, diam);
        papel.fillOval(200, 200, diam, diam);
        papel.fillOval(200, 100, diam, diam);
////        papel.fillOval(rango, rango, diam, diam);
////        papel.setColor(Color.YELLOW);
////        papel.fillOval(rango, rango, diam, diam);
////        papel.setColor(Color.MAGENTA);
////        papel.fillOval(rango, rango, diam, diam);
////        papel.setColor(Color.CYAN);
////        papel.fillOval(100, rango, diam, diam);
////        papel.setColor(Color.ORANGE);
////        papel.fillOval(200, rango, diam, diam);
////        papel.setColor(Color.GREEN);
////        papel.fillOval(rango, 100, diam, diam);

        
        
    }
        
    
    private int aleatoriorango(int min, int max) {
    return min+aleatorios.nextInt(max-min+1);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulosmayor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Circulosmayor extends JFrame implements ChangeListener {

    private JPanel panel;
    private JSlider da;
    private JSlider dr;
    private JTextField txtcolor;

    public static void main(String[] args) {
        Circulosmayor marco = new Circulosmayor();
        marco.setSize(300, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        dr = new JSlider(JSlider.VERTICAL);
        dr.addChangeListener(this);
        window.add(dr);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 150));
        panel.setBackground(Color.WHITE);
        window.add(panel);

        da = new JSlider(JSlider.VERTICAL);
        da.addChangeListener(this);
        window.add(da);

        txtcolor = new JTextField(11);
        window.add(txtcolor);
    }

    public void stateChanged(ChangeEvent e) {
        Graphics p = panel.getGraphics();
        int rojo = dr.getValue();
        int a = da.getValue();
        p.setColor(Color.white);
        p.fillRect(0, 0, 200, 150);
        p.setColor(Color.red);
        p.fillOval(10, 10, rojo, rojo);
        p.setColor(Color.blue);
        p.fillOval(100, 10, a, a);
        
        if(rojo > a)
        {
        txtcolor.setText("el colo rojo es mayor");
        }
        else
        {
        txtcolor.setText("el colo azul es mayor");
        }

    }
}

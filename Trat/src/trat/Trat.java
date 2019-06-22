/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Trat extends JFrame implements
//        ActionListener,
        ChangeListener {

    private JLabel lblonichan;
    private JSlider move;
    private JTextField txtmoveyourbody;

    public static void main(String[] args) {
        Trat marco = new Trat();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        move = new JSlider(JSlider.HORIZONTAL, 0, 10000, 0);
        move.addChangeListener(this);
        window.add(move);

        lblonichan = new JLabel("Total");
        window.add(lblonichan);

        txtmoveyourbody = new JTextField(15);
        window.add(txtmoveyourbody);

    }

    public void stateChanged(ChangeEvent e) {
        int xd;
        int total;

        xd = move.getValue();
        total = xd;
        txtmoveyourbody.setText("Su valor es: " + total);
    }
}

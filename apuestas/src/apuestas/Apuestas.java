/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Apuestas extends JFrame implements ActionListener {

    private JButton button;
    private JTextField dados;
    private JTextField comentario;
    private Random alea;

    public static void main(String[] args) {
        Apuestas marco = new Apuestas();
        marco.setSize(200, 150);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        button = new JButton("Tirar los dados");
        window.add(button);
        button.addActionListener(this);

        dados = new JTextField(15);
        window.add(dados);

        comentario = new JTextField(14);
        window.add(comentario);

        alea = new Random();
    }

    public void actionPerformed(ActionEvent e) {
        int d;
        int ds;
        int dt;

        d = alea.nextInt(6) + 1;
        ds = alea.nextInt(6) + 1;
        dt = alea.nextInt(6) + 1;
        dados.setText("valores de los dados: "
                + Integer.toString(d) + ", "
                + Integer.toString(ds) + " y " + Integer.toString(dt));

        if ((d == 6) && (ds == 6) && (dt == 6)) {
            comentario.setText("dados iguales 6 - gana $20");
        } else {
            if ((d == ds) && (ds == dt) && (dt == d)) {
                comentario.setText("dados iguales - gana $10");
            } else {
                if ((d == ds) || (ds == dt) || (dt == d)) {
                    comentario.setText("dados iguales - gana $5");
                }else
                {
                    comentario.setText("dados no iguales - pierde");
                }
            }
        }

    }

}

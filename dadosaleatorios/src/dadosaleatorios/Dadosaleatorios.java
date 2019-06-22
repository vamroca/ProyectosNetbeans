/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosaleatorios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Dadosaleatorios extends JFrame implements ActionListener {

    private JButton button;
    private JTextField dados;
    private JTextField comentario;
    private Random alea;

    public static void main(String[] args) {
        Dadosaleatorios marco = new Dadosaleatorios();
        marco.setSize(200, 150);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        button = new JButton("Tirar dados");
        window.add(button);
        button.addActionListener(this);

        dados = new JTextField(14);
        window.add(dados);

        comentario = new JTextField(14);
        window.add(comentario);

        alea = new Random();
    }

    public void actionPerformed(ActionEvent e) {
        int d;
        int ds;

        d = alea.nextInt(6) + 1;
        ds = alea.nextInt(6) + 1;
        dados.setText("valores de los dados: "
                + Integer.toString(d) + " y "
                + Integer.toString(ds));

        if (d == ds) {
            comentario.setText("dados iguales - gana");
        } else {
            comentario.setText("dados no iguales - pierde");

        }
    }
}

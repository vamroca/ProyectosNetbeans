package dientesierra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dientesierra extends JFrame implements ActionListener {

    private JButton boton;
    private JTextPane txtarea;

    public static void main(String[] args) {
        Dientesierra marco = new Dientesierra();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtarea = new JTextPane();
        txtarea.setPreferredSize(new Dimension(300, 200));
        window.add(txtarea);

        boton = new JButton("acpertar");
        window.add(boton);
        boton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String letra = "";
        int letras = 1;
        do {
            txtarea.setText(letra = "");
            txtarea.setText(letra += "S\n");
            txtarea.setText(letra += "SS\n");
            txtarea.setText(letra += "SSS\n");
            txtarea.setText(letra += "SSSS\n");
            txtarea.setText(letra += "SSSSS\n");
            letras++;
            
        } while (letras <= 3);
        txtarea.setText(letra + "\n" + letra + "\n" + letra +"\n");
    }
}

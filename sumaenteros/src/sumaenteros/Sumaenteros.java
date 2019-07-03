package sumaenteros;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sumaenteros extends JFrame implements ActionListener {

    private JButton boton;
    private JTextArea txtarea;

    public static void main(String[] args) {
        Sumaenteros marco = new Sumaenteros();
        marco.setSize(300, 700);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtarea = new JTextArea();
        txtarea.setPreferredSize(new Dimension(150, 610));
        txtarea.setBackground(Color.white);
        window.add(txtarea);

        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String number = "";
        int numbers = 1;

        while (numbers <= 39) {
            number = number + "Su numero es: " + Integer.toString(numbers * (numbers + 1) / 2) + "\n";
            numbers++;
        }
        txtarea.setText(number);
    }
}

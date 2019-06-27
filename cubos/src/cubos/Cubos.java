package cubos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cubos extends JFrame implements ActionListener {

    private JButton boton;
    private JTextPane panel;

    public static void main(String[] args) {
        Cubos marco = new Cubos();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JTextPane();
        panel.setPreferredSize(new Dimension(300, 162));
        panel.setBackground(Color.white);
        window.add(panel);

        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String numeros = "";
        int n = 0;
        int numbers = 1;

        while (numbers <= 10) {
            numeros = numeros + "Su numero es: " + Integer.toString(n + numbers)
                    + " " + "El cuadrado del numero es: " + Integer.toString(numbers * numbers) + "\n";
            numbers++;
        }
        panel.setText(numeros);
    }

}

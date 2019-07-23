package numaletoriosciclos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Numaletoriosciclos extends JFrame implements ActionListener {

    private JButton boton;
    private JTextPane panel;
    private Random aleatorio;

    public static void main(String[] args) {
        Numaletoriosciclos marco = new Numaletoriosciclos();
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
        
        JScrollPane paleDespla = new JScrollPane(panel);
        window.add(paleDespla);

        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);

        aleatorio = new Random();
    }

    public void actionPerformed(ActionEvent e) {
        String numeros = "";


        for (int numbers = 1; numbers <= 10; numbers++) {
            for (int n = aleatorio.nextInt(10); n <= 9; n++) {
                numeros = numeros + "Su numero es aleatorio es: " + Integer.toString(n) + "\n";
            }
            panel.setText(numeros);
        }
    }
}
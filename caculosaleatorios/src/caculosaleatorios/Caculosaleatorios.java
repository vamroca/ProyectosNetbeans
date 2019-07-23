package caculosaleatorios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Caculosaleatorios extends JFrame implements ActionListener {

    private JButton btnboton;
    private JTextArea txtarea;
    private Random aleatorio;

    public static void main(String[] args) {
        Caculosaleatorios marco = new Caculosaleatorios();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btnboton = new JButton("Aleatorio");
        window.add(btnboton);
        btnboton.addActionListener(this);

        txtarea = new JTextArea(10, 30);
        window.add(txtarea);

        JScrollPane paleDespla = new JScrollPane(txtarea);
        window.add(paleDespla);

        aleatorio = new Random();
    }

    public void actionPerformed(ActionEvent e) {
        alea();
    }

    private void alea() {
         String numeros = "";
         int q = 1;
         
        for (int numbers = 1; numbers <= 100; numbers++) {
            for (int n = aleatorio.nextInt(2); n <= 1; n++) {
                 numeros =  numeros + "Su numero " + Integer.toString(q) + " es aleatorio es: " 
                         + Integer.toString(n) + "\n";
            }
                        txtarea.setText(numeros);
                        q++;
        }
    }
}
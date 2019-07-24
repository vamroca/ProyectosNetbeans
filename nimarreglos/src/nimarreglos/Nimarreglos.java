package nimarreglos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Nimarreglos extends JFrame implements ActionListener {

    private JTextField txtpila1;
    private JTextField txtpila2;
    private JTextField txtpila3;
    private JTextField txtresta;
    private JLabel lblresta;
    private JButton btnreparitr;
    private JButton btnpila1;
    private JButton btnpila2;
    private JButton btnpila3;
    private JButton btnmaquina;
    private JButton newGame;
    private Random random;
    private Random[] aletorios = new Random[3];
    private int numeroRandom;

    public static void main(String[] args) {
        Nimarreglos marco = new Nimarreglos();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtpila1 = new JTextField(10);
        window.add(txtpila1);

        txtpila2 = new JTextField(10);
        window.add(txtpila2);

        txtpila3 = new JTextField(10);
        window.add(txtpila3);

        btnreparitr = new JButton("Repartir");
        window.add(btnreparitr);
        btnreparitr.addActionListener(this);

        aletorios[0] = new Random(20);
        aletorios[1] = new Random(20);
        aletorios[2] = new Random(20);

        lblresta = new JLabel("Ingrese los cerrillos a restar");
        window.add(lblresta);

        txtresta = new JTextField(10);
        window.add(txtresta);

        btnpila1 = new JButton("Pila 1");
        window.add(btnpila1);
        btnpila1.addActionListener(this);

        btnpila2 = new JButton("Pila 2");
        window.add(btnpila2);
        btnpila2.addActionListener(this);

        btnpila3 = new JButton("Pila 3");
        window.add(btnpila3);
        btnpila3.addActionListener(this);

        btnmaquina = new JButton("CPU");
        window.add(btnmaquina);
        btnmaquina.addActionListener(this);

        newGame = new JButton("Nuevo Juego");
        window.add(newGame);
        newGame.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        Object clic = e.getSource();
        if (clic == btnreparitr) {
            aleatorio();
        }
    }

    private void aleatorio() {
        numeroRandom = aletorios.length;
        txtpila1.setText(Integer.toString(numeroRandom));
        txtpila2.setText(Integer.toString(numeroRandom));
        txtpila3.setText(Integer.toString(numeroRandom));
    }

    private void mostrar() {
        for (int f = 0; f <= 2; f++) {
            aletorios[f].toString();
        }
    }
}

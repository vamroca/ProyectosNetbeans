/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Game extends JFrame implements ActionListener {

    private JButton button;
    private JButton button2;
    private JButton button3;
    private JTextField txtrespuesta;
    private JTextField txtganador;
    private Random ala;
    int gamee;
    String games;

    public static void main(String[] args) {
        Game marco = new Game();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        button = new JButton("Piedra");
        window.add(button);
        button.addActionListener(this);

        button2 = new JButton("Papel");
        window.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("Tijera");
        window.add(button3);
        button3.addActionListener(this);

        txtrespuesta = new JTextField(15);
        window.add(txtrespuesta);

        txtganador = new JTextField(15);
        window.add(txtganador);

        ala = new Random();

    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        gamee = ala.nextInt(3) + 1;
        txtrespuesta.setText(games);
        txtganador.setText(games);
        GR();


        if ((click == button) && (games.equals("Piedra"))) {
            txtganador.setText("Ganador");
        } else {
            if ((click == button2) && (games.equals("Papel"))) {
                txtganador.setText("Ganador");
            } else {
                if ((click == button3) && (games.equals("Tijera"))) {
                    txtganador.setText("Ganador");
                } else {
                    txtganador.setText("Gano CPU");
                }
            }
        }
    }

    private void GR() {
        switch (gamee) {
            case 1:
                games = "Piedra";
                txtrespuesta.setText(games);
                break;

            case 2:
                games = "Papel";
                txtrespuesta.setText(games);
                break;

            case 3:
                games = "Tijera";
                txtrespuesta.setText(games);
                break;

            default:
                games = "gg";
                break;
        }
    }
}

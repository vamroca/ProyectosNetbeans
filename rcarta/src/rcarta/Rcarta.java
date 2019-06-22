/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcarta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Rcarta extends JFrame implements ActionListener {

    private JLabel lbltexto;
    private JButton button;
    private JTextField txtcomentario;
    private JTextField txtcomentarios;
    private Random alea;
    int card;
    int cards;
    String nombrecarta;
    String nombrecartas;

    public static void main(String[] args) {
        Rcarta marco = new Rcarta();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lbltexto = new JLabel("Repartir carta");
        window.add(lbltexto);

        txtcomentario = new JTextField(10);
        window.add(txtcomentario);

        button = new JButton("Repartir");
        window.add(button);
        button.addActionListener(this);

        alea = new Random();
    }

    public void actionPerformed(ActionEvent e) {
////        card = alea.nextInt(4)+1;
////        txtcomentario.setText(nombrecarta);
////        cartasl();
        cards = alea.nextInt(13) + 1;
        txtcomentario.setText(nombrecarta);
        cartasR();
//        txtcomentario.setText("Su carta es: " + Integer.toString(cards));

////        txtcomentario.setText("Su carta es: " + Integer.toString(card));
    }

////        private void cartasl() {
////        switch (card) {
////            case 1:
////                nombrecarta = "Diamantes";
////                txtcomentario.setText(nombrecarta);
////                break;
////                
////            case 2:
////                nombrecarta = "Cora";
////                txtcomentario.setText(nombrecarta);
////                break;
////                
////            case 3:
////                nombrecarta = "Trebol";
////                txtcomentario.setText(nombrecarta);
////                break;
////                
////            case 4:
////                nombrecarta = "Espada";
////                txtcomentario.setText(nombrecarta);
////                break;
////
////            default:
////                nombrecarta = "gg";
////                break;
////
////        }
////
////    }
    private void cartasR() {
        switch (cards) {
            case 1:
                nombrecarta = "As";
                txtcomentario.setText(nombrecarta);
                break;

            case 2:
                nombrecarta = "Dos";
                txtcomentario.setText(nombrecarta);
                break;

            case 3:
                nombrecarta = "Tres";
                txtcomentario.setText(nombrecarta);
                break;

            case 4:
                nombrecarta = "Cuatro";
                txtcomentario.setText(nombrecarta);
                break;

            case 5:
                nombrecarta = "Cinco";
                txtcomentario.setText(nombrecarta);
                break;

            case 6:
                nombrecarta = "Seis";
                txtcomentario.setText(nombrecarta);
                break;

            case 7:
                nombrecarta = "Seis";
                txtcomentario.setText(nombrecarta);
                break;

            case 8:
                nombrecarta = "Ocho";
                txtcomentario.setText(nombrecarta);
                break;

            case 9:
                nombrecarta = "Nueve";
                txtcomentario.setText(nombrecarta);
                break;

            case 10:
                nombrecarta = "Die";
                txtcomentario.setText(nombrecarta);
                break;

            case 11:
                nombrecarta = "J";
                txtcomentario.setText(nombrecarta);
                break;

            case 12:
                nombrecarta = "Q";
                txtcomentario.setText(nombrecarta);
                break;
            case 13:
                nombrecarta = "K";
                txtcomentario.setText(nombrecarta);
                break;

            default:
                nombrecarta = "gg";
                break;

        }

    }

}

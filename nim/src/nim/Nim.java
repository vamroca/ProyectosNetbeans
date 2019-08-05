/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Nim extends JFrame implements ActionListener {

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
    private Random r;
    private int rs;
    private int rs2;
    private int rs3;
    private int rs4;
    private int resta;
    private int total;
    private String pila;

    public static void main(String[] args) {
        Nim marco = new Nim();
        marco.setSize(400, 300);
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

        r = new Random();

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

        Object click = e.getSource();

        if ((click == btnpila1)) {
            resta = Integer.parseInt(txtresta.getText());
            total = rs - resta;
            rs = total;
            txtpila1.setText(Integer.toString(total));
        } else {
            if ((click == btnpila2)) {
                resta = Integer.parseInt(txtresta.getText());
                total = rs2 - resta;
                rs2 = total;
                txtpila2.setText(Integer.toString(total));
            } else {
                if ((click == btnpila3)) {
                    resta = Integer.parseInt(txtresta.getText());
                    total = rs3 - resta;
                    rs3 = total;
                    txtpila3.setText(Integer.toString(total));
                } else {

                    if ((click == btnreparitr)) {
                        rs = r.nextInt(20) + 1;
                        rs2 = r.nextInt(20) + 1;
                        rs3 = r.nextInt(20) + 1;
                        txtpila1.setText(Integer.toString(rs));
                        txtpila2.setText(Integer.toString(rs2));
                        txtpila3.setText(Integer.toString(rs3));
                    } else {
                        mr();
                        txtresta.setText(Integer.toString(rs4));
                        rs4 = r.nextInt(3) + 1;
                        if (((click == btnmaquina && pila.equals("Pila 1")))) {
                            txtpila1.setText(Integer.toString(total));

                        } else {
                            if (((click == btnmaquina && pila.equals("Pila 2")))) {
                                txtpila2.setText(Integer.toString(total));
                            } else {

                                if (((click == btnmaquina && pila.equals("Pila 3")))) {
                                    txtpila3.setText(Integer.toString(total));
                                } else {
                                    if ((click == newGame)) {
                                        rs = 0;
                                        rs2 = 0;
                                        rs3 = 0;
                                        rs4 = 0;
                                        txtpila1.setText(Integer.toString(rs));
                                        txtpila2.setText(Integer.toString(rs2));
                                        txtpila3.setText(Integer.toString(rs3));
                                        txtresta.setText(Integer.toString(rs4));
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
    }

    private void mr() {
        switch (rs4) {
            case 1:

                txtresta.setText(Integer.toString(rs4));
                total = rs - rs4;
                rs = total;
                txtpila1.setText(Integer.toString(total));
                break;

            case 2:

                txtresta.setText(Integer.toString(rs4));
                total = rs2 - rs4;
                rs2 = total;
                txtpila2.setText(Integer.toString(total));
                break;

            case 3:

                txtresta.setText(Integer.toString(rs4));
                total = rs3 - rs4;
                rs3 = total;
                txtpila3.setText(Integer.toString(total));
                break;

            default:
                pila = "gg";
                break;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bovedadigital;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Bovedadigital extends JFrame implements ActionListener {

    private JLabel lbltexto;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
//    private JButton btncambio;
    private JTextField txttexto;
    String acodigo = "";
    int contra = 0;

    public static void main(String[] args) {
        Bovedadigital marco = new Bovedadigital();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lbltexto = new JLabel("Ingrese la contraseña");
        window.add(lbltexto);

        button1 = new JButton("1");
        window.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        window.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        window.add(button3);
        button3.addActionListener(this);

        txttexto = new JTextField(6);
        window.add(txttexto);
        
        button4 = new JButton("Reiniciar");
        window.add(button4);
        button4.addActionListener(this);
    }

//    private void createGUI2() {
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        Container window = getContentPane();
//        window.setLayout(new FlowLayout());
//
//        button4 = new JButton("Reiniciar");
//        window.add(button4);
//        button4.addActionListener(this);
//
//    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();

        if ((click == button1)) {
            acodigo = acodigo + "1";
            txttexto.setText(acodigo);

        }
        if ((click == button2)) {
            acodigo = acodigo + "2";
            txttexto.setText(acodigo);

        }

        if ((click == button3)) {
            acodigo = acodigo + "3";
            txttexto.setText(acodigo);
        }

        if ((click == button4)) {
            acodigo = "";
            txttexto.setText("");

        }
        if (acodigo.equals("12332")) {
            txttexto.setText("Bienvenido");
//        txttexto.setText("");
        }
//        createGUI2();

    }
}

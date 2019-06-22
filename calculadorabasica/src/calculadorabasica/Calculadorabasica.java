/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculadorabasica extends JFrame implements ActionListener {

    private JLabel lblsuma;
    private JLabel lbloperacion;
    private JTextField txtnumber;
    private JTextField txtnumero;
    private JTextField txtresultado;
    private JButton suma;
    private JButton resta;
    private JButton CE;
    //    private JButton resultado;
    int total;
    int n1;
    int n2;
    String operadores;
    String s;
    String r;
    String o;

    public static void main(String[] args) {
        Calculadorabasica marco = new Calculadorabasica();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblsuma = new JLabel("Ingrese el numero");
        window.add(lblsuma);
        txtnumber = new JTextField(10);
        window.add(txtnumber);

        lblsuma = new JLabel("Ingrese el numero");
        window.add(lblsuma);
        txtnumero = new JTextField(10);
        window.add(txtnumero);

        lbloperacion = new JLabel("Seleccione la operacion que desee realiar");
        window.add(lbloperacion);

        txtresultado = new JTextField(10);
        window.add(txtresultado);

        suma = new JButton("+");
        window.add(suma);
        suma.addActionListener(this);

        resta = new JButton("-");
        window.add(resta);
        resta.addActionListener(this);

        CE = new JButton("CE");
        window.add(CE);
        CE.addActionListener(this);
//
//        resultado = new JButton("=");
//        window.add(resultado);
//        resultado.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        n1 = Integer.parseInt(txtnumber.getText());
        n2 = Integer.parseInt(txtnumero.getText());
//        total = n1 + n2;
//        txtarea.setText(Integer.toString(total));

        Object click = e.getSource();

        if ((click == suma)) {
            total = n1 + n2;
            txtresultado.setText(Integer.toString(total));

        }

        if ((click == resta)) {
            total = total - n2;
            txtresultado.setText(Integer.toString(total));
        }

        if ((click == CE)) {
            n1 = 0;
            n2 = 0;
            total = 0;
            txtnumber.setText(Integer.toString(n1));
            txtnumero.setText(Integer.toString(n2));
            txtresultado.setText(Integer.toString(total));
        }
//
//        if ((click == resultado) || (operadores.equals("+")) || (operadores.equals("-"))) {
////        n1 = Integer.parseInt(txtarea.getText());
////        n2 = Integer.parseInt(txtarea.getText());
//            txtarea.setText(Integer.toString(total));
    }
}
//
//    private void op() {
//        switch (operadores) {
//            case "+":
//                total = n1 + n2;
//                break;
//
//            case "-":
//                total = n1 - n2;
//                break;
//        }
//    }
//}

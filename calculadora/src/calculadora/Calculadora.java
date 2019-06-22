/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField txtarea;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonsuma;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonresta;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonresultado;
    private JButton button0;
    private JButton buttondelete;
    int total;
    int n1;
    int n2;
    private String totals = "";
    private String totales = "";
    private String operadoress;

    public static void main(String[] args) {
        Calculadora marco = new Calculadora();
        marco.setSize(200, 300);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtarea = new JTextField(16);
        window.add(txtarea);

        button1 = new JButton("1");
        window.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        window.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        window.add(button3);
        button3.addActionListener(this);

        buttonsuma = new JButton("+");
        window.add(buttonsuma);
        buttonsuma.addActionListener(this);

        button4 = new JButton("4");
        window.add(button4);
        button4.addActionListener(this);

        button5 = new JButton("5");
        window.add(button5);
        button5.addActionListener(this);

        button6 = new JButton("6");
        window.add(button6);
        button6.addActionListener(this);

        buttonresta = new JButton("-");
        window.add(buttonresta);
        buttonresta.addActionListener(this);

        button7 = new JButton("7");
        window.add(button7);
        button7.addActionListener(this);

        button8 = new JButton("8");
        window.add(button8);
        button8.addActionListener(this);

        button9 = new JButton("9");
        window.add(button9);
        button9.addActionListener(this);

        buttonresultado = new JButton("=");
        window.add(buttonresultado);
        buttonresultado.addActionListener(this);

        button0 = new JButton("0");
        window.add(button0);
        button0.addActionListener(this);

        buttondelete = new JButton("Borrar");
        window.add(buttondelete);
        buttondelete.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
//        operadores();
//        total = Integer.parseInt(txtarea.getText());
        txtarea.setText(operadoress);
        txtarea.setText(operadoress);

        if ((click == button1)) {
            totals = totals + "1";
            txtarea.setText(totals);
            totales = totales + "1";
            txtarea.setText(totales);

        }
        if ((click == button2)) {
            totals = totals + "2";
            txtarea.setText(totals);
            totales = totales + "2";
            txtarea.setText(totales);

        }

        if ((click == button3)) {
            totals = totals + "3";
            txtarea.setText(totals);
            totales = totales + "3";
            txtarea.setText(totales);
        }

        if ((click == button4)) {
            totals = totals + "4";
            txtarea.setText(totals);
            totales = totales + "4";
            txtarea.setText(totales);

        }

        if ((click == button5)) {
            totals = totals + "5";
            txtarea.setText(totals);
            totales = totales + "5";
            txtarea.setText(totales);

        }

        if ((click == button6)) {
            totals = totals + "6";
            txtarea.setText(totals);
            totales = totales + "6";
            txtarea.setText(totales);

        }

        if ((click == button7)) {
            totals = totals + "7";
            txtarea.setText(totals);
            totales = totales + "7";
            txtarea.setText(totales);

        }

        if ((click == button8)) {
            totals = totals + "8";
            txtarea.setText(totals);
            totales = totales + "8";
            txtarea.setText(totales);

        }
        if ((click == button9)) {
            totals = totals + "9";
            txtarea.setText(totals);
            totales = totales + "9";
            txtarea.setText(totales);

        }

        if ((click == button0)) {
            totals = totals + "0";
            txtarea.setText(totals);
            totales = totales + "0";
            txtarea.setText(totales);

        }

        if ((click == buttondelete)) {
            totals = "";
            totales = "";
            txtarea.setText("");
        }

        if ((click == buttonsuma)) {
//            totales = "";
//            totals = "";

                    
//            txtarea.setText("");
//            txtarea.setText(Integer.toString(total));
//            total = Integer.parseInt(txtarea.getText());

        }

        if ((click == buttonresta)) {
//            totales = "";
//            totals = "";
//            txtarea.setText("");
//            txtarea.setText(Integer.toString(total));
//            total = Integer.parseInt(txtarea.getText());
//            total = Integer.parseInt(txtarea.getText());

        }

        if ((click == buttonresultado)) {
            
//                n1 = Integer.parseInt(totals);
//                n2 = Integer.parseInt(totales);
//                total = n1 + n2;
//            txtarea.setText(Integer.toString(total));
//            
//            
//                n1 = Integer.parseInt(totals);
//                n2 = Integer.parseInt(totales);
//                total = n1 - n2;
//                txtarea.setText(Integer.toString(total));
//                        txtarea.setText("laputmadree");
//            total = Integer.parseInt(txtarea.getText());
        }
    }

////    private void operadores() {
////        switch (operadoress) {
////
////            case "+":
////                n1 = Integer.parseInt(totals);
////                n2 = Integer.parseInt(totales);
////                total = n1 + n2;
////                break;
////
////            case "-":
////                n1 = Integer.parseInt(totals);
////                n2 = Integer.parseInt(totales);
////                total = n1 - n2;
////                break;
////
////            case "=":
//////              (operadoress.equals("+"))||(operdadoress.equals("-"));
//////                txtarea.setText(Integer.toString(total));
//////                total = Integer.parseInt(txtarea.getText());
////                break;
////
////            default:
//////                total = 1;
////                break;
////
////        }
////    }

}

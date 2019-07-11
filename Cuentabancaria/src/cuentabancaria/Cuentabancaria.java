package cuentabancaria;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cuentabancaria extends JFrame implements ActionListener {

    private JButton btndeposito;
    private JButton btnretiro;
    private TextField txttexto;
    private int dinero;
    private int total;
    private int otro;
    private Cuentas cuentas;

    public static void main(String[] args) {
        Cuentabancaria marco = new Cuentabancaria();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new TextField(10);
        window.add(txttexto);

        btndeposito = new JButton("Depositar");
        window.add(btndeposito);
        btndeposito.addActionListener(this);

        btnretiro = new JButton("Retiro");
        window.add(btnretiro);
        btnretiro.addActionListener(this);

        cuentas = new Cuentas();
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == btndeposito){
            cuentas.depositar();
            cuentas.getSaldoActual();
        
        } else {
            cuentas.retirar();
            cuentas.setSaldoActual();
        }
    }

    public class Cuentas {

        public void depositar() {
            dinero = Integer.parseInt(txttexto.getText());
        }

        public void retirar() {
            otro = Integer.parseInt(txttexto.getText());
            total = dinero - otro;
            
        }

        public int getSaldoActual() {
            txttexto.setText(Integer.toString(dinero));
            return dinero;
        }
        
        public int setSaldoActual(){
            txttexto.setText(Integer.toString(total));
            return total;
        }
    }

}

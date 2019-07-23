package cajaresgitradora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cajaresgitradora extends JFrame implements ActionListener {

    private JLabel lblsuma, lblmonto;
    private JTextField txtexto1, txttexto2;
    private JButton btnsuma, btnborrar;
    private Cobro cobro;
//    private int total;

    public static void main(String[] args) {
        Cajaresgitradora marco = new Cajaresgitradora();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblmonto = new JLabel("Ingrese el precio del producto");
        window.add(lblmonto);

        txtexto1 = new JTextField(10);
        window.add(txtexto1);

        btnsuma = new JButton("Sumar Producto");
        window.add(btnsuma);
        btnsuma.addActionListener(this);

        lblsuma = new JLabel("Total");
        window.add(lblsuma);

        txttexto2 = new JTextField(10);
        window.add(txttexto2);

        btnborrar = new JButton("Eliminar total");
        window.add(btnborrar);
        btnborrar.addActionListener(this);

        cobro = new Cobro();
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == btnsuma) {
            cobro.cobros();
         } else {
            cobro.eliminar();
        }

    }

    public class Cobro {

        protected int suma = 0;
        protected int total = 0;
        protected int borrar = 0;

        public void cobros() {
            suma = Integer.parseInt(txtexto1.getText());
            total = total + suma;
            txttexto2.setText(Integer.toString(total));
        }

        public void eliminar() {
            total = borrar;
            txtexto1.setText(Integer.toString(total));
            txttexto2.setText(Integer.toString(total));
        }

    }
}

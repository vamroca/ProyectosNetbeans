package banco;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Banco extends JFrame implements ActionListener {

    private JButton btndepositar;
    private JButton btnretirar;
    private JButton btnguardar;
    private JTextField txtcuenta;
    private JTextField txtdeposito;
    private JTextField txtretiro;
    private JTextField txtinteres;
    private Cuentas cuentas;

//    private CuentasBancarias cuentasbancarias;
    
    public static void main(String[] args) {
        Banco marco = new Banco();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtcuenta = new JTextField(5);
        window.add(txtcuenta);

        btnguardar = new JButton("Guardar");
        window.add(btnguardar);
        btnguardar.addActionListener(this);

        txtdeposito = new JTextField(5);
        window.add(txtdeposito);

        btndepositar = new JButton("Despositar");
        window.add(btndepositar);
        btndepositar.addActionListener(this);

        txtretiro = new JTextField(5);
        window.add(txtretiro);

        btnretirar = new JButton("Retirar");
        window.add(btnretirar);
        btnretirar.addActionListener(this);
        
        txtinteres = new JTextField(5);
        window.add(txtinteres);

        cuentas = new Cuentas();
//        cuentasbancarias = new CuentasBancarias();
    }

    public void actionPerformed(ActionEvent e) {

        Object click = e.getSource();
        
        if (click == btndepositar) {
            cuentas.depositos();
            cuentas.interes();
        } else {
                cuentas.retiros();
                cuentas.retiros();
            
        }
    }

    public abstract class CuentasBancarias {

        protected int deposito = 0;
        protected int total = 0;
        protected int retiro = 0;

        public void depositos() {
            deposito = Integer.parseInt(txtdeposito.getText());
            total = total + deposito;
            txtdeposito.setText(Integer.toString(total));
        }

        public void retiros() {
            retiro = Integer.parseInt(txtretiro.getText());
            total = total - retiro;
            txtretiro.setText(Integer.toString(total));
        }

        public abstract void interes();
    }

    public class Cuentas extends CuentasBancarias {

        protected int tasainteres;
        protected int tiempo;
        protected int intereses;
        protected String cadena;

        public void interes() {
            cadena = txtcuenta.getText();
            if (cadena.equals("Regular")) {
                txtcuenta.setText(cadena);
                tasainteres = 6;
                tiempo = 12;
                intereses = ((deposito * tasainteres * tiempo) + 100);
                txtinteres.setText(Integer.toString(intereses));
            } else {
//                txtcuenta.getText();
//                cadena.equals("Dorada");
                txtcuenta.setText(cadena);
                tasainteres = 5;
                tiempo = 12;
                intereses = (deposito * tasainteres * tiempo);
                txtinteres.setText(Integer.toString(intereses));
            }
        }
    }
}

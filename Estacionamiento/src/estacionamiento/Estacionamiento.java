package estacionamiento;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Estacionamiento extends JFrame implements ActionListener {

    private JButton btnentrada;
    private JButton btnsalida;
    private JTextField txttexto;
    private int entradas = 0;
    private int salidas = 0;
    private int total = 0;
    private boolean llenos;

    private Estacionamientos estacionamientos;

    public static void main(String[] args) {
        Estacionamiento marco = new Estacionamiento();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new JTextField(10);
        window.add(txttexto);

        btnentrada = new JButton("Entrada");
        window.add(btnentrada);
        btnentrada.addActionListener(this);

        btnsalida = new JButton("Salida");
        window.add(btnsalida);
        btnsalida.addActionListener(this);

        estacionamientos = new Estacionamientos();
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == btnentrada && entradas < 10) {
//        if (click == btnentrada) {
            estacionamientos.entrar();
        } else {
//            if (click == btnsalida && salidas <= 10) {
            if (click == btnsalida) {
                estacionamientos.salida();
            } else {
                estacionamientos.lleno();
            }

        }

    }

    public class Estacionamientos {

        public void entrar() {
            entradas = Integer.parseInt(txttexto.getText());
            total = total + entradas;
            txttexto.setText(Integer.toString(total));

        }

        public void salida() {
            salidas = Integer.parseInt(txttexto.getText());
            total = total - salidas;
            txttexto.setText(Integer.toString(total));
        }

        private Boolean lleno() {
//            llenos = ((entradas == 10) && (salidas == 10)); <=
            llenos = ((entradas > 0) && (entradas  <= 10));
            JOptionPane.showMessageDialog(null, "Estacionamiento lleno");
            return llenos;
        }

    }
}

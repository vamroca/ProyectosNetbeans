package dadosc;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Dadosc extends JFrame implements ActionListener {

    private JButton btndado;
    private JTextField txttexto;
    private JTextField txttextos;
    private Random alea;
    private int d;
    private int ds;
    private Dados dadoss;

    public static void main(String[] args) {
        Dadosc marco = new Dadosc();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btndado = new JButton("Tirar los dados");
        window.add(btndado);
        btndado.addActionListener(this);

        txttexto = new JTextField(5);
        window.add(txttexto);

        txttextos = new JTextField(5);
        window.add(txttextos);

        alea = new Random();

        dadoss = new Dados();
//        Dados dadoss1 = new Dados();
    }

    public void actionPerformed(ActionEvent e) {
        d = alea.nextInt(6) + 1;
        ds = alea.nextInt(6) + 1;

        dadoss.primeraTirada();
        dadoss.incrementaDado();
    }

    public class Dados {

        private int numeros = 6;

        public void primeraTirada() {
            txttexto.setText(Integer.toString(getNumero()));
            txttextos.setText(Integer.toString(getNumero()));
        }

        public void incrementaDado() {
            if (numeros == 6) {
                d = d + 1;
                txttexto.setText(Integer.toString(d));
                txttextos.setText(Integer.toString(ds));
            }
        }

        public int getNumero() {
            return numeros;
        }

    }

}

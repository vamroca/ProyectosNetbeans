package tanteador;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Tanteador extends JFrame implements ActionListener {

    private JButton btnincrementar;
    private JButton btniniciar;
    private JButton btnreducir;
    private JTextField txttexto;
    private int dinero;
    private int total;
    private int otro;
    private Tanteadores tanteadores;

    public static void main(String[] args) {
        Tanteador marco = new Tanteador();
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

        btnincrementar = new JButton("Incrementar");
        window.add(btnincrementar);
        btnincrementar.addActionListener(this);

        btniniciar = new JButton("Iniciar");
        window.add(btniniciar);
        btniniciar.addActionListener(this);

        btnreducir = new JButton("Reducir");
        window.add(btnreducir);
        btnreducir.addActionListener(this);

        tanteadores = new Tanteadores();
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == btniniciar) {
            tanteadores.obtener();
            tanteadores.getPuntos();

        } else {
            if (click == btnincrementar) {
                tanteadores.obtener();
                tanteadores.getPuntos();
                tanteadores.incrementar();
                tanteadores.setPuntosActual();

            } else {
                tanteadores.obtener();
                tanteadores.getPuntos();
                tanteadores.reducir();
                tanteadores.setPuntosActual();
            }
        }
    }

    public class Tanteadores {

        public void obtener() {
            dinero = Integer.parseInt(txttexto.getText());
        }

        public void reducir() {
            otro = Integer.parseInt(txttexto.getText());
            total = dinero - otro;

        }

        public void incrementar() {
            otro = Integer.parseInt(txttexto.getText());
            total = dinero + otro;

        }

        public int getPuntos() {
            txttexto.setText(Integer.toString(dinero));
            return dinero;
        }

        public int setPuntosActual() {
            txttexto.setText(Integer.toString(total));
            return total;
        }
    }
}

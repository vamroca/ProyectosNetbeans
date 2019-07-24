package searcharreglos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Searcharreglos extends JFrame implements ActionListener {

    private JButton btnboton;
    private JTextField txtnombre, txtnumero;
    private String[] nombres = new String[20];
    private String[] numeros = new String[20];

    public static void main(String[] args) {
        Searcharreglos marco = new Searcharreglos();
        marco.setSize(200, 200);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btnboton = new JButton("Buscar");
        window.add(btnboton);
        btnboton.addActionListener(this);

        txtnombre = new JTextField(8);
        window.add(txtnombre);

        txtnumero = new JTextField(10);
        window.add(txtnumero);

        nombres[0] = "Alex";
        numeros[0] = "2720774";

        nombres[1] = "Megan";
        numeros[1] = "5678554";

        nombres[2] = "FIN";

    }

    public void actionPerformed(ActionEvent e) {
        buscar();

    }

    private void buscar() {
        int i;
        String buscador;

        buscador = txtnombre.getText();
        i = 0;
        for (i = 0;
                !(nombres[i].equals(buscador))
                && !(nombres[i].equals("FIN"));
                i++) {
        }
        if (nombres[i].equals(buscador)) {
            txtnumero.setText("Su numero es: " + numeros[i]);
        } else {
            txtnumero.setText("No se encontro");
        }
    }

}

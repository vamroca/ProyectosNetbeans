package diccionario;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Diccionario extends JFrame implements ActionListener {

    private JButton btnboton, btnboton1;
    private JTextField txtnombre, txtname;
    private String[] nombres = new String[20];
    private String[] name = new String[20];

    public static void main(String[] args) {
        Diccionario marco = new Diccionario();
        marco.setSize(400, 100);
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

        txtname = new JTextField(15);
        window.add(txtname);

        btnboton1 = new JButton("Cambio");
        window.add(btnboton1);
        btnboton1.addActionListener(this);

        nombres[0] = "Libro";
        name[0] = "Book";

        nombres[1] = "Table";
        name[1] = "Mesa";

        nombres[2] = "Pelicula";
        name[2] = "Movie";

        nombres[3] = "Juego";
        name[3] = "Game";

        nombres[4] = "Computadora";
        name[4] = "Computer";

        nombres[5] = "FIN";

    }

    public void actionPerformed(ActionEvent e) {
        Object clic = e.getSource();
        if (clic == btnboton) {
            buscar();
        } else {
            buscarReverse();
        }
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
            txtname.setText(name[i]);
        } else {
            txtname.setText("No se encontro");
        }
    }
    
    private void buscarReverse() {
        int i;
        String buscador;

        buscador = txtname.getText();
        i = 0;
        for (i = 0;
                !(name[i].equals(buscador))
                && !(name[i].equals("FIN"));
                i++) {
        }
        if (name[i].equals(buscador)) {
            txtnombre.setText(nombres[i]);
        } else {
            txtnombre.setText("No se encontro");
        }
    }

}

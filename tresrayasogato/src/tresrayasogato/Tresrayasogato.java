package tresrayasogato;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Tresrayasogato extends JFrame implements ActionListener {

    private JButton btnagregar, btn;
    private JTextArea txtarea;
    private JLabel lblfila, lblcola, lblvalor;
    private JTextField txtfila, txtcola, txtvalor;
    private int[][] gato = new int[3][3];

    public static void main(String[] args) {
        Tresrayasogato marco = new Tresrayasogato();
        marco.setSize(260, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblfila = new JLabel("Ingresa la fila");
        window.add(lblfila);

        txtfila = new JTextField(2);
        window.add(txtfila);

        lblcola = new JLabel("Ingresa la columna");
        window.add(lblcola);

        txtcola = new JTextField(2);
        window.add(txtcola);

        lblvalor = new JLabel("Ingrese el valor");
        window.add(lblvalor);

        txtvalor = new JTextField(2);
        window.add(txtvalor);

        txtarea = new JTextArea(5, 21);
        window.add(txtarea);

        btnagregar = new JButton("Agregar");
        window.add(btnagregar);
        btnagregar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        agregar();
    }

    private void mostrar() {
        txtarea.setText("");
        txtarea.setTabSize(5);
        String nuevaLinea = "\r\n";
        String tab = "\t";

        for (int fila = 0; fila <= 2; fila++) {
            for (int columna = 0; columna <= 2; columna++) {
                txtarea.append(Integer.toString(gato[fila][columna])
                        + tab);
            }
            txtarea.append(nuevaLinea);
        }

    }

    private void agregar() {
        int valorDatos;
        int columna;
        int fila;

        fila = Integer.parseInt(txtfila.getText());
        columna = Integer.parseInt(txtcola.getText());
        valorDatos = Integer.parseInt(txtvalor.getText());
        gato[fila][columna] = valorDatos;
        
        mostrar();
    }

}

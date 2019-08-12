package transpuesta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Transpuesta extends JFrame implements ActionListener {

    private JButton btnagregar, btntranspuesta;
    private JTextArea txtarea;
    private JLabel lblfila, lblcola, lblvalor;
    private JTextField txtfila, txtcola, txtvalor;
    private int[][] matriz = new int[4][4];
    private int[][] matrizT = new int[matriz[0].length][matriz.length];

    public static void main(String[] args) {
        Transpuesta marco = new Transpuesta();
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

        btnagregar = new JButton("Agregar valor");
        window.add(btnagregar);
        btnagregar.addActionListener(this);

        btntranspuesta = new JButton("Transpuesta");
        window.add(btntranspuesta);
        btntranspuesta.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object clic = e.getSource();
        if (clic == btnagregar) {
            ingresarValor();
        } else {
            mostrarT();
        }
    }

    private void mostrar() {
        txtarea.setText("");
        txtarea.setTabSize(3);
        String nuevaLinea = "\r\n";
        String tab = "\t";

        for (int fila = 0; fila <= 3; fila++) {
            for (int columna = 0; columna <= 3; columna++) {
                txtarea.append(Integer.toString(matriz[fila][columna])
                        + tab);
            }
            txtarea.append(nuevaLinea);
        }
    }

    private void ingresarValor() {
        int valorDatos;
        int columna;
        int fila;

        fila = Integer.parseInt(txtfila.getText());
        columna = Integer.parseInt(txtcola.getText());
        valorDatos = Integer.parseInt(txtvalor.getText());
        matriz[fila][columna] = valorDatos;

        mostrar();
    }

//    private void transpuesta() {
//        int fila;
//        int columna;
//        for (int fila = 0; fila < matriz.length; fila++) {
//            for (int col = 0; col < matriz[fila].length; col++) {
//                matrizT[col][fila] = matriz[fila][col];
//            }
//        }
//        mostrarT();
//    }

    private void mostrarT() {
        txtarea.setText("");
        txtarea.setTabSize(3);
        String nuevaLinea = "\r\n";
        String tab = "\t";

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matrizT[col][fila] = matriz[fila][col];
                txtarea.append(Integer.toString(matrizT[fila][col])
                        + tab);
            }
            txtarea.append(nuevaLinea);
        }
    }

}

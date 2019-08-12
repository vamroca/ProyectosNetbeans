package garo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Garo extends JFrame implements ActionListener {

    private JButton btnagregar, btniniciar;
    private JTextArea txtarea;
    private JLabel lblfila, lblcolumna, lblvalor;
    private JTextField txtfila, txtcolumna, txtvalor;
//    private String gato[][] = new String[3][3];
    private String gato[][] = {{"-", "-", "-"},
    {"-", "-", "-"},
    {"-", "-", "-"}};

    public static void main(String[] args) {
        Garo marco = new Garo();
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

        lblcolumna = new JLabel("Ingresa la columna");
        window.add(lblcolumna);

        txtcolumna = new JTextField(2);
        window.add(txtcolumna);

        lblvalor = new JLabel("Ingrese el valor");
        window.add(lblvalor);

        txtvalor = new JTextField(2);
        window.add(txtvalor);

        txtarea = new JTextArea(5, 21);
        window.add(txtarea);

        btnagregar = new JButton("Agregar");
        window.add(btnagregar);
        btnagregar.addActionListener(this);
        
        
        btniniciar = new JButton("Iniciar Juego");
        window.add(btniniciar);
        btniniciar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object clic = e.getSource();
        if (clic == btnagregar) {
            agregar();
        } else {
            mostrar();
        }
    }

    private void agregar() {
        String valorDatos;
        int columna;
        int fila;

        fila = Integer.parseInt(txtfila.getText());
        columna = Integer.parseInt(txtcolumna.getText());
        valorDatos = txtvalor.getText();
        gato[fila][columna] = valorDatos;

        mostrar();
    }

    private void mostrar() {
        txtarea.setText("");
        txtarea.setTabSize(5);
        String nuevaLinea = "\r\n";
        String tab = "\t";

        for (int fila = 0; fila <= 2; fila++) {
            for (int columna = 0; columna <= 2; columna++) {
                txtarea.append((gato[fila][columna])
                        + tab);
            }
            txtarea.append(nuevaLinea);
        }
    }
}

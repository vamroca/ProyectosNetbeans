package supermercado;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Supermercado extends JFrame implements ActionListener {

    private ArrayList cola = new ArrayList();
    private JButton btnbusqueda, btnmostrar, btneliminar, btnagregar;
    private JTextArea txtarea;
    private JTextField txttexto, txttexto1;

    public static void main(String[] args) {
        Supermercado marco = new Supermercado();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new JTextField(5);
        window.add(txttexto);

        btnagregar = new JButton("Agregar");
        window.add(btnagregar);
        btnagregar.addActionListener(this);

        btneliminar = new JButton("Eliminar");
        window.add(btneliminar);
        btneliminar.addActionListener(this);

        btnbusqueda = new JButton("Buscar");
        window.add(btnbusqueda);
        btnbusqueda.addActionListener(this);

        btnmostrar = new JButton("Mostrar");
        window.add(btnmostrar);
        btnmostrar.addActionListener(this);

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);
    }

    public void actionPerformed(ActionEvent e) {
        Object clic = e.getSource();

        if (clic == btnagregar) {
            agregar(cola);
            mostrar(cola);
        } else {
            if (clic == btnbusqueda) {
                buscar(cola);
            } else {
                if (clic == btnmostrar) {
                    mostrar(cola);
                } else {
                    eliminar(cola);
                    mostrar(cola);
                }
            }
        }
    }

    private void eliminar(ArrayList cola) {
        cola.remove(0);

    }

    private void agregar(ArrayList cola) {
        cola.add(txttexto.getText());
    }

    private void mostrar(ArrayList cola) {
        final String nuevaLinea = "\n";
        final String tab = "\t";
        txtarea.setTabSize(3);
        txtarea.setText("");
        for (int i = 0; i < cola.size(); i++) {
            txtarea.append(Integer.toString(i)
                    + tab
                    + cola.get(i) + nuevaLinea);
        }
    }

    private void buscar(ArrayList cola) {
        int longitud;
        int i;
        boolean find;
        String elemento;
        longitud = cola.size();
        elemento = txttexto.getText();
        find = false;
        i = 0;
        while ((find == false) && (i < longitud)) {
            if ((cola.get(i)).equals(elemento)) {
                find = true;
                txtarea.setText(elemento);
            } else {
                i++;
            }

        }
    }

}

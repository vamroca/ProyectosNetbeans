package eliminararraylist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Eliminararraylist extends JFrame implements ActionListener {

    private ArrayList lista = new ArrayList();
    private JButton btnmostrar, btnmodificar, btneliminar, btnagregar;
    private JTextArea txtarea;
    private JTextField txttexto, txttexto1;

    public static void main(String[] args) {
        Eliminararraylist marco = new Eliminararraylist();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new JTextField(5);
        window.add(txttexto);

        txttexto1 = new JTextField(5);
        window.add(txttexto1);

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);

        lista.add("adasda");
        lista.add("SHGSAGHS");
        lista.add("WGPH");

        btneliminar = new JButton("Eliminar");
        window.add(btneliminar);
        btneliminar.addActionListener(this);

        btnmodificar = new JButton("Modificar");
        window.add(btnmodificar);
        btnmodificar.addActionListener(this);

        btnmostrar = new JButton("Mostrar");
        window.add(btnmostrar);
        btnmostrar.addActionListener(this);

        btnagregar = new JButton("Agregar");
        window.add(btnagregar);
        btnagregar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        Object click = e.getSource();
        if (click == btneliminar) {
            eliminarIndice(lista);
        } else {
            if (click == btnmodificar) {
                modificar(lista);
            } else {
                if (click == btnagregar) {
                    agregarElemento(lista);
                    mostrarIndices(lista);
                } else {
                    mostrar(lista);
                    mostrarIndices(lista);
                }
            }

        }
    }

    private void mostrar(ArrayList lista) {
        final String nuevaLinea = "\n";
        txtarea.setText("");
        for (int i = 0; i < lista.size(); i++) {
            txtarea.append(lista.get(i) + nuevaLinea);
        }
    }

    private void eliminarIndice(ArrayList lista) {
        int i;
        i = Integer.parseInt(txttexto.getText());
        lista.remove(i);
//        txtarea.setText((String) lista.get(i));
    }

    private void modificar(ArrayList lista) {
        String modificarlo;
        int i;
        i = Integer.parseInt(txttexto.getText());
        modificarlo = txttexto1.getText();
        txtarea.setText((String) lista.set(i, modificarlo));
    }

    private void agregarElemento(ArrayList lista) {
        int i;
        String modificarlo;
        i = Integer.parseInt(txttexto.getText());
        modificarlo = txttexto1.getText();
        lista.add(i, modificarlo);
//        txtarea.setText((String) lista.set(i, modificarlo));

    }

    private void mostrarIndices(ArrayList lista) {
        final String nuevaLinea = "\n";
        final String tab = "\t";
        txtarea.setTabSize(3);
        txtarea.setText("");
        for (int i = 0; i < lista.size(); i++) {
            txtarea.append(Integer.toString(i)
                    + tab
                    + lista.get(i) + nuevaLinea);
        }

    }
}

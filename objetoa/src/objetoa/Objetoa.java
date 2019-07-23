package objetoa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Objetoa extends JFrame implements ActionListener {

    private ArrayList lista = new ArrayList();
    private JButton btnmostrar, btnagregar;
    private JTextArea txtarea;
    private JTextField txttexto, txttexto1;

    public static void main(String[] args) {
        Objetoa marco = new Objetoa();
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

        btnagregar = new JButton("Agregar");
        window.add(btnagregar);
        btnagregar.addActionListener(this);

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);

        btnmostrar = new JButton("Mostrar");
        window.add(btnmostrar);
        btnmostrar.addActionListener(this);

        JScrollPane paleDespla = new JScrollPane(txtarea);
        window.add(paleDespla);

        txttexto1 = new JTextField(5);
        window.add(txttexto1);

        lista.add("adasda");
        lista.add("SHGSAGHS");
        lista.add("AbCdE");
        lista.add("H");
        lista.add("o");
        lista.add(5, "son robados");
//        lista.remove(3);
//        lista.clear();
    }

    public void actionPerformed(ActionEvent e) {

        Object click = e.getSource();
        if (click == btnagregar) {
            mostrarIndices(lista);
            mostrarElemetos(lista);
            agregarElemento(lista);
        } else {
//            eliminarLista(lista);
              clear();
           
//            mostrarIndices(lista);
//            mostrarElemetos(lista);
//            mostrar(lista);
//            mostrarLongitud(lista);
        }
    }

    private void mostrar(ArrayList lista) {
        final String nuevaLinea = "\n";
        txtarea.setText("");
        for (int i = 0; i < lista.size(); i++) {
            txtarea.append(lista.get(i) + nuevaLinea);
        }
    }

    private void mostrarLongitud(ArrayList lista) {
        JOptionPane.showMessageDialog(null, Integer.toString(lista.size()));
    }

    private void agregarElemento(ArrayList lista) {
        lista.add(txttexto.getText());
    }

//    private void mostarMejorado(ArrayList lista) {
//        final String nuevaLinea = "\n";
//        txtarea.setText("");
//        for (String elemento : lista) {
//            txtarea.append(elemento + nuevaLinea);
//        }
//    }
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

    private void mostrarElemetos(ArrayList lista) {
        int i;
        i = Integer.parseInt(txttexto.getText());
        txttexto1.setText((String) lista.get(i));
    }

//    private void eliminarLista(ArrayList lista) {
//
//        int i;
//        lista.clear();
//        i = Integer.parseInt(txtarea.getText());
//        txtarea.setText((String) lista.get(i));
//    }
    
    public void clear(){
    lista.clear();
    }
}

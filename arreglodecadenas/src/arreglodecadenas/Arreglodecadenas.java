package arreglodecadenas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Arreglodecadenas extends JFrame implements ActionListener {

    private JButton btnboton;
    private JTextField txtintro;
    private JButton btnboton1;
    private JButton btnboton2;
    private JTextField txtintro1;
    private JTextArea txtarea;
    private String[] nombres = new String[10];

    public static void main(String[] args) {
        Arreglodecadenas marco = new Arreglodecadenas();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btnboton = new JButton("Aceptar");
        window.add(btnboton);
        btnboton.addActionListener(this);

        txtintro = new JTextField(10);
        window.add(txtintro);

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);

        btnboton1 = new JButton("Buscar");
        window.add(btnboton1);
        btnboton1.addActionListener(this);

        txtintro1 = new JTextField(10);
        window.add(txtintro1);

        btnboton2 = new JButton("Mostrar");
        window.add(btnboton2);
        btnboton2.addActionListener(this);
//        nombres[0] = "Hola";
//        nombres[1] = "Hol";
//        nombres[2] = "Ho";
//        nombres[3] = "H";
    }

    public void actionPerformed(ActionEvent e) {
//        buscar
        int i = 0;
        String n = txtintro.getText();
        Object clic = e.getSource();
        if (clic == btnboton) {
//            agregar();
            nombres[i] = n;
            i++;
//            mostrar();
        } else if (clic == btnboton2) {
            mostrar();
        } else {
            buscar();
        }
//        mostrar();
//        agregar();
    }

    private void agregar() {
        final String nuevaLinea = "\n";
        int n = 0;
//
////        for (n = 0; n < nombres.length; n++) {
////            nombres[n] = (txtintro.getText());
////            txtarea.append((nombres[n]) + nuevaLinea);
////        }
        if (n < nombres.length) {
            nombres[n] = (txtintro.getText());
            txtarea.append((nombres[n]) + nuevaLinea);
            n++;
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos");
        }

    }

    private void buscar() {
        int i;
        String search;

        search = txtintro1.getText();
        i = 0;
        for (i = 0;
                (nombres[i].equals(search));
                i++) {
        }
        if (nombres[i].equals(search)) {
            txtarea.setText(nombres[i]);
        } else {
            txtarea.setText("No se encontro");
        }
    }

    private void mostrar() {
        final String nuevaLinea = "\n";
        txtarea.setText("");
        for (int i = 0; i < nombres.length; i++) {
            txtarea.append((nombres[i]) + nuevaLinea);
        }
    }
}

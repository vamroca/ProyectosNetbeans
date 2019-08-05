package sumaymedia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Sumaymedia extends JFrame implements ActionListener {

    private JButton btnboton;
    private JTextField txtposicion, txtdescripcion, txtcalculo, txtdescripcion2,
            txtcalculo2;
//    private JLabel lblcover;
    private JTextArea txtarea;
    private int[] suma = new int[22];

    public static void main(String[] args) {

        Sumaymedia marco = new Sumaymedia();
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

        txtposicion = new JTextField(5);
        window.add(txtposicion);

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);

        JScrollPane paleDespla = new JScrollPane(txtarea);
        window.add(paleDespla);

        txtdescripcion = new JTextField(12);
        window.add(txtdescripcion);

        txtcalculo = new JTextField(23);
        window.add(txtcalculo);

        txtdescripcion2 = new JTextField(12);
        window.add(txtdescripcion2);

        txtcalculo2 = new JTextField(23);
        window.add(txtcalculo2);

        suma[0] = 7;
        suma[1] = 8;
        suma[2] = 0;
        suma[3] = 4;
        suma[4] = 3;
        suma[5] = 8;
        suma[6] = 1;
        suma[7] = 9;
        suma[8] = 50;
        suma[9] = 20;
        suma[10] = 21;
        suma[11] = 77;
        suma[12] = 89;
        suma[13] = 70;
        suma[14] = 45;
        suma[15] = 30;
        suma[16] = 84;
        suma[17] = 11;
        suma[18] = 19;
        suma[19] = 55;
        suma[20] = 16;
        suma[21] = 17;
//        suma[99] = 60;

    }

    public void actionPerformed(ActionEvent e) {
//        nuevoValor();
        mostrar();
        mayor();
        calcular();
        menor();
        media();
    }

    private void mostrar() {
        txtarea.setText("");
        for (int sumas = 0; sumas <= 21; sumas++) {
            txtarea.append((suma[sumas])
                    + "\n");
        }
    }

    private void nuevoValor() {
        int i;
        int data;
        i = Integer.parseInt(txtposicion.getText());
        data = Integer.parseInt(txtposicion.getText());
        suma[i] = data;
        mostrar();
        mayor();
        calcular();
        menor();
    }

    private void mayor() {
        int mayors;
        mayors = suma[0];
        int i = 0;
        for (int precipitacion = 0; i <= 21; i++) {
            if (mayors < suma[i]) {
                mayors = suma[i];
            }
        }
        txtdescripcion.setText("Valor mas alto es: " + Integer.toString(mayors));
    }

    private void calcular() {
        int total = 0;
        for (int i = 0; i < suma.length; i++) {
            total = total + suma[i];
        }
        txtcalculo.setText("El total es: " + Integer.toString(total));
    }

    private void media() {
        double total = 0;
        for (int i = 0; i < suma.length; i++) {
            total = total + suma[i] / 21;
        }
        txtcalculo2.setText("La media es: " + Double.toString(total));
    }

    private void menor() {
        int menors;
        menors = suma[0];
        int i = 0;
        for (int precipitacion = 0; i <= 21; i++) {
            if (menors > suma[i]) {
                menors = suma[i];
            }
        }
        txtdescripcion2.setText("Valor mas bajo es: " + Integer.toString(menors));
    }

}

package ejemploarreglos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Ejemploarreglos extends JFrame implements ActionListener {

    private JButton btnboton;
    private JTextField txtposicion, txtdia, txtdescripcion, txtcalculo;
    private JLabel lblcover;
    private JTextArea txtarea;
    private int[] lluvia = {7, 8, 0, 4, 3, 8, 1};

    public static void main(String[] args) {
        Ejemploarreglos marco = new Ejemploarreglos();
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

        lblcover = new JLabel("a");
        window.add(lblcover);

        txtdia = new JTextField(5);
        window.add(txtdia);

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);

        txtdescripcion = new JTextField(12);
        window.add(txtdescripcion);

        txtcalculo = new JTextField(23);
        window.add(txtcalculo);
    }

    public void actionPerformed(ActionEvent e) {
        nuevoValor();
    }

    private void mostrar() {
        txtarea.setText("");
        for (int numberDay = 0; numberDay <= 6; numberDay++) {
            txtarea.append("Día " + Integer.toString(numberDay)
                    + " lluvia " + Integer.toString(lluvia[numberDay])
                    + "\n");
        }
    }

    private void nuevoValor() {
        int i;
        int data;
        i = Integer.parseInt(txtposicion.getText());
        data = Integer.parseInt(txtdia.getText());
        lluvia[i] = data;
        mostrar();
        mayor();
        calcular();
//        nombreDias();
    }

    private void mayor() {
        int mayors;
        mayors = lluvia[0];
        int i = 0;
        for (int precipitacion = 0; i <= 6; i++) {
            if (mayors < lluvia[i]) {
                mayors = lluvia[i];
            }
        }
        txtdescripcion.setText("Valor mas alto es: " + Integer.toString(mayors));
    }

    private void calcular() {
        int total = 0;
        for (int i = 0; i < lluvia.length; i++) {
            total = total + lluvia[i];
        }
        txtcalculo.setText("La precipitación total de esta semana es: " + Integer.toString(total));
    }

//    private void nombreDias() {
//        int numberDay = 0;
//        String nombreDias;
//        switch (numberDay) {
//            case 0:
//                nombreDias = "Lunes";
//                break;
//            case 1:
//                nombreDias = "Martes";
//                break;
//            case 2:
//                nombreDias = "Miercoles";
//                break;
//            case 3:
//                nombreDias = "Jueves";
//                break;
//            case 4:
//                nombreDias = "Viernes";
//                break;
//            case 5:
//                nombreDias = "Sabado";
//                break;
//            case 6:
//                nombreDias = "Domigo";
//                break;
//            default:
//                nombreDias = "GG";
//                break;
//        }
//    }
}

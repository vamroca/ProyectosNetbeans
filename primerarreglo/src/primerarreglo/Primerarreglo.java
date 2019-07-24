package primerarreglo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Primerarreglo extends JFrame implements ActionListener {

    private JTextArea txtarea;
    private JButton btnaceptar;
    int [] arreglo = new int[20];

    public static void main(String[] args) {
        Primerarreglo marco = new Primerarreglo();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    public void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtarea = new JTextArea(10, 20);
        window.add(txtarea);

        btnaceptar = new JButton("Aceptar");
        window.add(btnaceptar);
        btnaceptar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        
        mostrar(arreglo);
////        int [] arreglo = new int[9];
////        final String nuevaLinea = "\n";
////        txtarea.setText("");
////        for (int i = 0; i < arreglo.length; i++) {
////            txtarea.append(Integer.toString(i) + nuevaLinea);
////        }
        //    String [ ] grupo = new String[4];
        //    String[] grupo={"John","Paul","George","Ringo"};
        //    txtarea.setText(grupo[3]);

//        int[] venta={13,8,22,17,24,15,23};
//        int suma = 0;
//        for(int numberday = 0; numberday <= 6; numberday++){
//        suma = suma + venta[numberday];
//        txtarea.setText(Integer.toString(suma));
    }

    private void mostrar(int[] arreglo) {
        final String nuevaLinea = "\n";
        txtarea.setText("");
        for (int i = 0; i < arreglo.length; i++) {
            txtarea.append(Integer.toString(arreglo[i]) + nuevaLinea);
        }
    }

}

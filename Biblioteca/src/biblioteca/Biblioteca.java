package biblioteca;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Biblioteca extends JFrame implements ActionListener {

    private JButton btnboton, btnboton1;
    private JTextField txtnombre, txtcodigo;
    private String[] nombres = new String[20];
    private String[] codigo = new String[20];
////    private int [] codigo = new int[20];

    public static void main(String[] args) {
        Biblioteca marco = new Biblioteca();
        marco.setSize(400, 100);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btnboton = new JButton("Buscar");
        window.add(btnboton);
        btnboton.addActionListener(this);

        txtnombre = new JTextField(8);
        window.add(txtnombre);

        txtcodigo = new JTextField(15);
        window.add(txtcodigo);

//        btnboton1 = new JButton("Cambio");
//        window.add(btnboton1);
//        btnboton1.addActionListener(this);
//
        nombres[0] = "Victor";
//        codigo[0] = 123;
        codigo[0] = "123";

        nombres[1] = "Marco";
//        codigo[1] = 176;
        codigo[1] = "176";

        nombres[2] = "Isabel";
//        codigo[2] = 950;
        codigo[2] = "950";

        nombres[3] = "Jonh";
//        codigo[3] = 170;
        codigo[3] = "170";

        nombres[4] = "Keyla";
//        codigo[4] = 123;
        codigo[4] = "400";

        nombres[5] = "FIN";

    }

    public void actionPerformed(ActionEvent e) {

        buscarReverse();

    }

//    private void buscar() {
//        int i;
//        String buscador;
//
//        buscador = txtnombre.getText();
//        i = 0;
//        for (i = 0;
//                !(nombres[i].equals(buscador))
//                && !(nombres[i].equals("FIN"));
//                i++) {
//        }
//        if (nombres[i].equals(buscador)) {
//            txtcodigo.setText(codigo[i]);
//        } else {
//            txtcodigo.setText("No se encontro");
//        }
//    }
    private void buscarReverse() {
        int i;
        String buscador;

        buscador = txtnombre.getText();
        i = 0;
        for (i = 0;
                !(codigo[i].equals(buscador))
                && !(codigo[i].equals("FIN"));
                i++) {
        }
        if (codigo[i].equals(buscador)) {
            txtcodigo.setText(nombres[i]);
        } else {
            txtcodigo.setText("No se encontro");
        }
    }

}

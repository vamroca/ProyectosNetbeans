package nimarreglos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Nimarreglos extends JFrame implements ActionListener {

    private JTextField txtpila1;
    private JTextField txtpila2;
    private JTextField txtpila3;
    private JTextField txtresta;
    private JLabel lblresta;
    private JButton btnreparitr;
    private JButton btnpila1;
    private JButton btnpila2;
    private JButton btnpila3;
    private JButton btnmaquina;
    private JButton newGame;
    private Random random;
    private String pila;
    private int[] posicion = new int[3];
//    private Random[] aletorios = new Random[3];
//    private Aleatorios[] aleatorios = new Aleatorios[3];
    private int numeroRandom, numeroRandom1, numeroRandom2, numeroRandom3, resta, total;

    public static void main(String[] args) {
        Nimarreglos marco = new Nimarreglos();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtpila1 = new JTextField(10);
        window.add(txtpila1);

        txtpila2 = new JTextField(10);
        window.add(txtpila2);

        txtpila3 = new JTextField(10);
        window.add(txtpila3);

        btnreparitr = new JButton("Repartir");
        window.add(btnreparitr);
        btnreparitr.addActionListener(this);

//        aletorios[0] = new Random(20);
//        aletorios[1] = new Random(20);
//        aletorios[2] = new Random(20);
        lblresta = new JLabel("Ingrese los cerrillos a restar");
        window.add(lblresta);

        txtresta = new JTextField(10);
        window.add(txtresta);

        btnpila1 = new JButton("Pila 1");
        window.add(btnpila1);
        btnpila1.addActionListener(this);

        btnpila2 = new JButton("Pila 2");
        window.add(btnpila2);
        btnpila2.addActionListener(this);

        btnpila3 = new JButton("Pila 3");
        window.add(btnpila3);
        btnpila3.addActionListener(this);

        btnmaquina = new JButton("CPU");
        window.add(btnmaquina);
        btnmaquina.addActionListener(this);

        newGame = new JButton("Nuevo Juego");
        window.add(newGame);
        newGame.addActionListener(this);

        random = new Random();

//        aleatorios[0] = new Aleatorios(20);
//        aleatorios[1] = new Aleatorios(20);
//        aleatorios[2] = new Aleatorios(20);
    }

    public void actionPerformed(ActionEvent e) {

        Object clic = e.getSource();
//        arrreglos();
//        txtresta.setText(Integer.toString(numeroRandom3));
//        numeroRandom3 = random.nextInt(3) + 1;
        if (clic == btnreparitr) {
//            repartir();
            mostrar(posicion);
        } else if (clic == btnpila1) {
            resta = Integer.parseInt(txtresta.getText());
            total = numeroRandom - resta;
            numeroRandom = total;
            txtpila1.setText(Integer.toString(total));
            if (total <= 0) {
                txtpila1.setText("Sin cerrillos");
            }
        } else if (clic == btnpila2) {
            resta = Integer.parseInt(txtresta.getText());
            total = numeroRandom1 - resta;
            numeroRandom1 = total;
            txtpila2.setText(Integer.toString(total));
            if (total <= 0) {
                txtpila2.setText("Sin cerrillos");
            }
        } else if (clic == btnpila3) {
            resta = Integer.parseInt(txtresta.getText());
            total = numeroRandom2 - resta;
            numeroRandom2 = total;
            txtpila3.setText(Integer.toString(total));
            if (total <= 0) {
                txtpila3.setText("Sin cerrillos");
            }
        } else {
            arrreglos();
//            txtresta.setText(Integer.toString(numeroRandom3));
            numeroRandom3 = random.nextInt(3) + 1;
            if (clic == btnmaquina && pila.equals("Pila 1")) {
                if (total <= 0) {
                    txtpila1.setText("Sin cerrillos");
                }
//                txtpila1.setText(Integer.toString(total));
            } else if (clic == btnmaquina && pila.equals("Pila 2")) {
//                txtpila2.setText(Integer.toString(total));
                if (total <= 0) {
                    txtpila2.setText("Sin cerrillos");
                }
            } else if (clic == btnmaquina && pila.equals("Pila 3")) {
//                txtpila3.setText(Integer.toString(total));
                if (total <= 0) {
                    txtpila3.setText("Sin cerrillos");

                }
            } else {
                numeroRandom = 0;
                numeroRandom1 = 0;
                numeroRandom2 = 0;
                numeroRandom3 = 0;
                txtpila1.setText(Integer.toString(numeroRandom));
                txtpila2.setText(Integer.toString(numeroRandom1));
                txtpila3.setText(Integer.toString(numeroRandom2));
                txtresta.setText(Integer.toString(numeroRandom3));
            }
        }
    }
        //    private void repartir() {
        //        numeroRandom = random.nextInt(20) + 1;
        //        numeroRandom1 = random.nextInt(20) + 1;
        //        numeroRandom2 = random.nextInt(20) + 1;
        //        txtpila1.setText(Integer.toString(numeroRandom));
        //        txtpila2.setText(Integer.toString(numeroRandom1));
        //        txtpila3.setText(Integer.toString(numeroRandom2));
        //    }
    private void arrreglos() {
//        numeroRandom3 = random.nextInt(3) + 1;

        switch (numeroRandom3) {
            case 1:
                txtresta.setText(Integer.toString(numeroRandom3));
                total = numeroRandom - numeroRandom3;
                numeroRandom = total;
                txtpila1.setText(Integer.toString(total));
                break;

            case 2:
                txtresta.setText(Integer.toString(numeroRandom3));
                total = numeroRandom1 - numeroRandom3;
                numeroRandom1 = total;
                txtpila2.setText(Integer.toString(total));
                break;

            case 3:
                txtresta.setText(Integer.toString(numeroRandom3));
                total = numeroRandom2 - numeroRandom3;
                numeroRandom2 = total;
                txtpila3.setText(Integer.toString(total));
                break;

            default:
                pila = "gg";
                break;
        }
    }

    private void mostrar(int[] arreglo) {
        txtpila1.setText("");
        numeroRandom = random.nextInt(20) + 1;
        numeroRandom1 = random.nextInt(20) + 1;
        numeroRandom2 = random.nextInt(20) + 1;
        for (int i = 0; i < posicion.length; i++) {
            txtpila1.setText(Integer.toString(arreglo[i]) + Integer.toString(numeroRandom));
            txtpila2.setText(Integer.toString(arreglo[i]) + Integer.toString(numeroRandom1));
            txtpila3.setText(Integer.toString(arreglo[i]) + Integer.toString(numeroRandom2));
        }

//        if (posicion.length <= posicion.length) {
//            numeroRandom = random.nextInt(20) + 1;
//            numeroRandom1 = random.nextInt(20) + 1;
//            numeroRandom2 = random.nextInt(20) + 1;
//            txtpila1.setText(Integer.toString(numeroRandom));
//            txtpila2.setText(Integer.toString(numeroRandom1));
//            txtpila3.setText(Integer.toString(numeroRandom2));
//        }
    }
}

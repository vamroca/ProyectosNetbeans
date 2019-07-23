package sumadenteros;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sumadenteros extends JFrame implements ActionListener {

    private JLabel lblsuma1, lblsuma2;
    private JTextField txtexto1, txtexto2, txtexto3, txtexto4;
    private JButton btnsuma, btnsuma1, btneliminar;
    private Suma suma;

    public static void main(String[] args) {
        Sumadenteros marco = new Sumadenteros();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblsuma1 = new JLabel("Suma Formula");
        window.add(lblsuma1);

        txtexto1 = new JTextField(10);
        window.add(txtexto1);

        txtexto2 = new JTextField(10);
        window.add(txtexto2);

        btnsuma = new JButton("Suma Formula");
        window.add(btnsuma);
        btnsuma.addActionListener(this);

        lblsuma2 = new JLabel("Suma normal");
        window.add(lblsuma2);

//        txtexto3 = new JTextField(10);
//        window.add(txtexto3);
//        txtexto4 = new JTextField(10);
//        window.add(txtexto4);
        btnsuma1 = new JButton("Suna normal");
        window.add(btnsuma1);
        btnsuma1.addActionListener(this);

        suma = new Suma();

        btneliminar = new JButton("Eliminar");
        window.add(btneliminar);
        btneliminar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click == btnsuma) {
            suma.sumaFormula();
        } else {
            if (click == btnsuma1) {
                suma.sumaNormal();
            }
            suma.eliminar();
        }

    }

    public class Suma {

        protected int sumaf = 0;
        protected int sumaff = 0;
        protected int total = 0;
        protected int totall = 0;
        protected int suman = 0;
        protected int sumann = 0;
        protected int borrar = 0;

        public void sumaFormula() {
            sumaf = Integer.parseInt(txtexto1.getText());
            total = (sumaf * (sumaf + 1)) / 2;
            txtexto2.setText(Integer.toString(total));

        }

        public void sumaNormal() {
            suman = Integer.parseInt(txtexto1.getText());
            sumann = Integer.parseInt(txtexto2.getText());
            totall = sumaf + sumaff;
            txtexto2.setText(Integer.toString(total));
        }

        public void eliminar() {
            total = borrar;
            txtexto1.setText(Integer.toString(total));
            txtexto2.setText(Integer.toString(total));

        }

    }

}

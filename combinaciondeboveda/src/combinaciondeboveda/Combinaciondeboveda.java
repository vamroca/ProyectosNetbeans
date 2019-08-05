package combinaciondeboveda;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Combinaciondeboveda extends JFrame implements ActionListener {

    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnaceptar;
    private JTextField txtcampo;
//    private String[] codigo = {"780438"};
    private String[] codigo = new String[20];
    private String password = "";

    public static void main(String[] args) {
        Combinaciondeboveda marco = new Combinaciondeboveda();
        marco.setSize(200, 200);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtcampo = new JTextField(15);
        window.add(txtcampo);

        btn1 = new JButton("1");
        window.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        window.add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        window.add(btn3);
        btn3.addActionListener(this);

        btn4 = new JButton("4");
        window.add(btn4);
        btn4.addActionListener(this);

        btn5 = new JButton("5");
        window.add(btn5);
        btn5.addActionListener(this);

        btn6 = new JButton("6");
        window.add(btn6);
        btn6.addActionListener(this);

        btn7 = new JButton("7");
        window.add(btn7);
        btn7.addActionListener(this);

        btn8 = new JButton("8");
        window.add(btn8);
        btn8.addActionListener(this);

        btn9 = new JButton("9");
        window.add(btn9);
        btn9.addActionListener(this);

        btn0 = new JButton("0");
        window.add(btn0);
        btn0.addActionListener(this);

        btnaceptar = new JButton("Aceptar");
        window.add(btnaceptar);
        btnaceptar.addActionListener(this);

        codigo[0] = "780438";

        codigo[1] = "Fin";
    }

    public void actionPerformed(ActionEvent e) {
        Object clic = e.getSource();

        if (clic == btn1) {
            password = password + "1";
            txtcampo.setText(password);
        } else if (clic == btn2) {
            password = password + "2";
            txtcampo.setText(password);
        } else if (clic == btn3) {
            password = password + "3";
            txtcampo.setText(password);
        } else if (clic == btn4) {
            password = password + "4";
            txtcampo.setText(password);
        } else if (clic == btn5) {
            password = password + "5";
            txtcampo.setText(password);
        } else if (clic == btn6) {
            password = password + "6";
            txtcampo.setText(password);
        } else if (clic == btn7) {
            password = password + "7";
            txtcampo.setText(password);
        } else if (clic == btn8) {
            password = password + "8";
            txtcampo.setText(password);
        } else if (clic == btn9) {
            password = password + "9";
            txtcampo.setText(password);
        } else if (clic == btn0) {
            password = password + "0";
            txtcampo.setText(password);
        } else {
            buscar();
        }

    }

    private void buscar() {
        int i;
        String buscador;

        buscador = txtcampo.getText();
        i = 0;
        for (i = 0;
                !(codigo[i].equals(buscador))
                && !(codigo[i].equals("FIN"));
                i++) {
        }
        if (codigo[i].equals(buscador)) {
            txtcampo.setText("Bienvenido" + codigo[i]);
        } else {
            txtcampo.setText("No se encontro");
        }
    }
}

package lluviamatrices;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class LluviaMatrices extends JFrame implements ActionListener {

    private JButton btnchangevalue;
    private JTextArea txtarea;
    private JLabel lbllocation, lblday, lblvalue;
    private JTextField txtlocation, txtday, txtvalue, txttotal;
    private int[][] datosLluvia = {{10, 7, 3, 28, 5, 6, 3},
    {12, 3, 5, 7, 14, 5, 8},
    {8, 5, 2, 1, 1, 4, 7}};

    public static void main(String[] args) {
        LluviaMatrices marco = new LluviaMatrices();
        marco.setSize(260, 260);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btnchangevalue = new JButton("Cambiar valor en ");
        window.add(btnchangevalue);
        btnchangevalue.addActionListener(this);

        lbllocation = new JLabel("Ubicación");
        window.add(lbllocation);

        txtlocation = new JTextField(2);
        window.add(txtlocation);

        lblday = new JLabel("Día");
        window.add(lblday);

        txtday = new JTextField(2);
        window.add(txtday);

        lblvalue = new JLabel("A");
        window.add(lblvalue);

        txtvalue = new JTextField(2);
        window.add(txtvalue);

        txtarea = new JTextArea(5, 21);
        window.add(txtarea);

        txttotal = new JTextField(15);
        window.add(txttotal);
    }

    public void actionPerformed(ActionEvent e) {
        cambiarValor();
    }

    private void mostrar() {
        txtarea.setText("");
        txtarea.setTabSize(3);
        String nuevaLinea = "\r\n";
        String tab = "\t";

        for (int ubicacion = 0; ubicacion <= 2; ubicacion++) {
            for (int numeroDia = 0; numeroDia <= 6; numeroDia++) {
                txtarea.append(Integer.toString(datosLluvia[ubicacion][numeroDia])
                        + tab);
            }
            txtarea.append(nuevaLinea);
        }
    }

    private void cambiarValor() {
        int valorDatos;
        int numeroDia;
        int ubicacion;

        numeroDia = Integer.parseInt(txtday.getText());
        ubicacion = Integer.parseInt(txtlocation.getText());
        valorDatos = Integer.parseInt(txtvalue.getText());
        datosLluvia[ubicacion][numeroDia] = valorDatos;

        mostrar();
        calcularTotal();

    }

    private void calcularTotal() {
        int total = 0;

        for (int ubicacion = 0; ubicacion <= 2; ubicacion++) {
            for (int numeroDia = 0; numeroDia <= 6; numeroDia++) {
            total = total + datosLluvia[ubicacion][numeroDia];
            }
        }
        txttotal.setText("La precipitacion total es " + Integer.toString(total));
    }
}

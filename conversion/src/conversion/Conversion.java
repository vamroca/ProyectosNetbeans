package conversion;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.*;

public class Conversion extends JFrame implements ActionListener {

    private JLabel lblconvertir, lblconvertido;
    private JTextField txttexto1, txtxtexto2, txtconversion1, txtconversion2;
    private JButton btnconveritr;
    private double pulgadas, pies;

    public static void main(String[] args) {
        Conversion marco = new Conversion();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblconvertir = new JLabel("Ingrese las Pulgadas y Pies a convertir: ");
        window.add(lblconvertir);

        txttexto1 = new JTextField(4);
        window.add(txttexto1);

        txtxtexto2 = new JTextField(4);
        window.add(txtxtexto2);

        lblconvertido = new JLabel("Pulgadas y Pies convertidos a CM: ");
        window.add(lblconvertido);

        txtconversion1 = new JTextField(4);
        window.add(txtconversion1);

        txtconversion2 = new JTextField(4);
        window.add(txtconversion2);

        btnconveritr = new JButton("Aceptar");
        window.add(btnconveritr);
        btnconveritr.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        convertir();
    }

    private void convertir() {
        double convertidas, convertidos;
        
        pulgadas = Double.parseDouble(txttexto1.getText());
        pies = Double.parseDouble(txtxtexto2.getText());
        convertidas = pulgadas * 2.54;
        convertidos = pies * 30.48;
        DecimalFormat formateador = new DecimalFormat("##.##");
        txtconversion1.setText(formateador.format(convertidas));
        txtconversion2.setText(formateador.format(convertidos));
    }

}

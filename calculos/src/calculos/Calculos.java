package calculos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.text.DecimalFormat;

public class Calculos extends JFrame implements ActionListener {

    private JButton btnboton;
    private JTextField txttexto;

    public static void main(String[] args) {
        Calculos marco = new Calculos();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new JTextField(10);
        window.add(txttexto);

        btnboton = new JButton("Aceptar");
        window.add(btnboton);
        btnboton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
//        int i;
//        i = Integer.parseInt(txttexto.getText());
//        DecimalFormat formateador = new DecimalFormat("00000");
//        txttexto.setText(formateador.format(i));


//<----------------------Pra a´ctica de Autoevalución
        double i;
        i = Double.parseDouble(txttexto.getText());
        DecimalFormat formateador = new DecimalFormat("##.##");
        txttexto.setText(formateador.format(i));

    }

}

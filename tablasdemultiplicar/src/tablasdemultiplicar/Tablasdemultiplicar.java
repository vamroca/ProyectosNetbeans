package tablasdemultiplicar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tablasdemultiplicar extends JFrame implements ActionListener {

    private JButton boton;
    private JTextArea txtarea;
    private JTextField txttexto;

    public static void main(String[] args) {
        Tablasdemultiplicar marco = new Tablasdemultiplicar();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new JTextField(4);
        window.add(txttexto);

        boton = new JButton("Mostrar");
        window.add(boton);
        boton.addActionListener(this);

        txtarea = new JTextArea();
        txtarea.setPreferredSize(new Dimension(250, 160));
        window.add(txtarea);
    }

    public void actionPerformed(ActionEvent e) {
        String number = "";
        int n;
        n = Integer.parseInt(txttexto.getText());
        int numbers = 1;

        while (numbers <= n) {
            number = number + Integer.toString(n * numbers) + "\t";
            numbers++;
        }
        txtarea.setTabSize(2);
        txtarea.setText(number);
        
        
//        for (int numero = 1; n <= numero; numero++) {
//            for (int cont = 0; cont <= n; cont++) {
//                number = number + Integer.toString(n * numbers) + "\t";
//                txtarea.setTabSize(2);
//                txtarea.setText(number);
//            }
//            txtarea.setTabSize(2);
//            txtarea.setText(number);
//        }
    }
}

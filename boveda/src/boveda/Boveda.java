/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boveda;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Boveda extends JFrame implements
        ActionListener {

    private JLabel lblboveda;
    private JTextField txtcodigo;
    private JTextField txtresult;
    private JButton button;

    public static void main(String[] args) {
        Boveda marco = new Boveda();
        marco.setSize(100, 150);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        lblboveda = new JLabel("Ingrese el codigo");
        window.add(lblboveda);

        txtcodigo = new JTextField(5);
        window.add(txtcodigo);

        button = new JButton("Aceptar");
        window.add(button);
        button.addActionListener(this);

        txtresult = new JTextField(6);
        window.add(txtresult);
    }

    public void actionPerformed(ActionEvent e) {
        String acodigo;
        int codigo;

        acodigo = txtcodigo.getText();
        codigo = Integer.parseInt(acodigo);
        if (codigo == 1995) {
            txtresult.setText("Bienvenido");
            txtcodigo.setText("");
        }
    }
}

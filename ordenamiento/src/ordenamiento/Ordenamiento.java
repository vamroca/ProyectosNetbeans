/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ordenamiento extends JFrame 
        
//        implements ActionListener 
{

    private JLabel lblorden;
    private JTextField txtbox1;
    private JTextField txtbox2;
    private JTextField txtbox3;
    private JTextField txtresultado;
    private JButton button;

    public static void main(String[] args) {
        Ordenamiento marco = new Ordenamiento();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblorden = new JLabel("Ingrese sus numero");
        window.add(lblorden);

        txtbox1 = new JTextField(5);
        window.add(txtbox1);

        txtbox2 = new JTextField(5);
        window.add(txtbox2);

        txtbox3 = new JTextField(5);
        window.add(txtbox3);

        txtresultado = new JTextField(5);
        window.add(txtresultado);

        button = new JButton("Aceptar");
        window.add(button);
//        button.addActionListener(this);
    }

//    public void actionPerformed(ActionEvent e) {
//        int a;
//        int b;
//        int c;
//
//
//        a = Integer.parseInt(txtbox1.getText());
//        b = Integer.parseInt(txtbox2.getText());
//        c = Integer.parseInt(txtbox3.getText());
//
//
//////        String =Boolean.toString(a);
//        head(a,b,c);
//        
//        txtresultado.setText("Mi dino pichula");
//        
////        txtresultado.setText("f");
//  
//    }

//    private boolean head (int a, int b, int c) {
//        if ((a <= b) && (b <= c)) {
//////            return b;
//            return true;
//        } else {
//            return false;
//////return a;
//        }
//    }
}

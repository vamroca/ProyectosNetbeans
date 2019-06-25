/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradosdenumeros;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cuadradosdenumeros extends JFrame implements ActionListener {

    private JTextArea txttexto;
    private JButton btnapcetar;

    public static void main(String[] args) {
    Cuadradosdenumeros marco = new Cuadradosdenumeros();
    marco.setSize(400, 300);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        txttexto = new JTextArea();
        window.add(txttexto);
    
        btnapcetar = new JButton("Aceptar");
        window.add(btnapcetar);
        btnapcetar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
    
////        int n = 1;
////        int numero = 0;
////
////
////        while (n <= 5) {
////            numero = (numero + n);
////            number = number + Integer.toString(n + numero) + " ";
////            n++;
////        }
////        txttexto.setText(""+ Integer.toString(numero));


        String number = "";
        int n = 0;
        int numbers = 1;


        while (numbers <= 5) {
            number = number + "Su numero es:" + Integer.toString(n + numbers) +
                    " " + "El cuadrado del numero es:" + Integer.toString(numbers * numbers) + "\n";
            numbers++;
        }
        txttexto.setText(number);
    }
}

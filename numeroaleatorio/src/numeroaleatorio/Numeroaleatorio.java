/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroaleatorio;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Numeroaleatorio extends JFrame implements ActionListener {

    private JTextField txtsuma, txtpromedio, txtnumero;
    private JLabel lblsuma, lblpromedio, lblnumero;
    private JButton btnaletorio;
    private int rango, suma, promedio = 0;
    private Random numerosaleatorios = new Random();
    

    public static void main(String[] args) {
        Numeroaleatorio marco = new Numeroaleatorio();
        marco.setSize(600, 100);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
        btnaletorio = new JButton("Numero Aleatorio");
        window.add(btnaletorio);
        btnaletorio.addActionListener(this);
        
        
        lblnumero = new JLabel("Su numero aleatorio es: ");
        window.add(lblnumero);
                
        txtnumero = new JTextField(3);
        window.add(txtnumero);
        
        
        lblsuma = new JLabel("La suma actual de los numero es: ");
        window.add(lblsuma);
                
        txtsuma = new JTextField(7);
        window.add(txtsuma);
        
                
        lblpromedio = new JLabel("El promedio actual de los numeros es: ");
        window.add(lblpromedio);
                
        txtpromedio = new JTextField(3);
        window.add(txtpromedio);
    }
    
    public void actionPerformed(ActionEvent e){
        rango = aleatoriorango(200, 400);
        txtnumero.setText(Integer.toString(rango));
        suma = rango + suma;
        txtsuma.setText(Integer.toString(suma));
        promedio = promedio + 1;
        txtpromedio.setText(Integer.toString(suma / promedio));
    
    }
    
    
    private int aleatoriorango(int min, int max) {
    return min+numerosaleatorios.nextInt(max-min+1);
    }
    
}

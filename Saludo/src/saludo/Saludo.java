/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Toshiba
 */
   
public class Saludo  extends JFrame{

    private JTextField textField;
    private JTextField txtfield;
    
    public static void main(String[] args) {
      
        Saludo marco = new Saludo();
        marco.setSize(150, 200);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        Container window = getContentPane();
        window.setLayout(new FlowLayout () );
//        textField = new JTextField("Hola");
        textField = new JTextField("Un bloque de texto en un campo de texto");
        txtfield = new JTextField("VAMR");
        window.add(textField);
        window.add(txtfield);
        
        
    }

 
    
}

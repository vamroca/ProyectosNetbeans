/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudiates;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Toshiba
 */
public class Hola extends JFrame {
    
    private JTextField textField;
    
    public static void main (String [] args){
        Hola marco = new Hola();
        marco.setSize(300, 200);
        marco.createGUI();
        marco.SetVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout () );
        textField = JTextField("Hola");
        window.add(textField);
    }

    private void SetVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JTextField JTextField(String hola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Circunferencia extends JFrame implements ActionListener {
 
    
    private JButton button;
 

    public static void main(String[] args) {
        Circunferencia marco = new Circunferencia();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container window = getContentPane();
    window.setLayout(new FlowLayout() );
    button = new JButton("Haga clic");
    window.add(button);
    button.addActionListener(this);
    }
    

    
    public void actionPerformed (ActionEvent e){
//    
//    int area;
//    double radio = 7.5;
//    int longitud;
//    int anchura;
//    longitud = 20;
//    anchura = 10;
//    area = longitud * anchura;
       double area;
       double perimetro;
       String areas;
       String perimetros;

       double radio = 7.5;
       area = (Math.PI * radio) * radio * radio;
       perimetro = (2 * Math.PI * radio);
       JOptionPane.showMessageDialog(null,"el area del ciruclo es: \n" + area + 
               "\n y el perimetro del ciruclo es: \n " + perimetro);
       
    }
    
}

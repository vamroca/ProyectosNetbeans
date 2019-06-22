/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Salario extends JFrame implements ChangeListener{
    private JPanel panel;
    private JTextField txtsalario;
    private JLabel lblsalario;
    private JSlider salario;
   
    public static void main(String[] args) {
        Salario marco = new Salario();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        lblsalario = new JLabel("Mueva la barra para definir sus ingresos");
        window.add(lblsalario);
        
        salario = new JSlider(JSlider.HORIZONTAL, 0, 100000, 0);
        window.add(salario);
        salario.setMajorTickSpacing(20000);
        salario.setPaintTicks(true);
        salario.addChangeListener(this);
        
        txtsalario = new JTextField(25);
        window.add(txtsalario);
    }
    
    
    public void stateChanged(ChangeEvent e){
    int sal;
//    double imp = .20;
    
    sal = salario.getValue();
//    txtsalario = Integer.parseInt(txtsalario.getText());
    if (sal <= 10000){
    txtsalario.setText(sal + " No paga impuestos");
    }else{
        if ((sal > 10000) && ( sal <= 50000 )){
//            sal 
//            imp = Double.parseDouble(txtsalario.getText());
            txtsalario.setText(sal + " Debe pagar el 20% de Impuesto");
        } else{
        txtsalario.setText(sal + " Debe de pagar el 90% de impuesto");
        }
    }
    
    }
}

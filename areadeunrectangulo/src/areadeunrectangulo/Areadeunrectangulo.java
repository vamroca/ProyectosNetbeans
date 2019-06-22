/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadeunrectangulo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Areadeunrectangulo extends JFrame implements ActionListener {

    private JTextField txtbase, txtaltura, txtarea;
    private JLabel lblbase, lblaltura, lblsigno;
    private JButton btnmulti;

    public static void main(String[] args) {
        Areadeunrectangulo marco = new Areadeunrectangulo();
        marco.setSize(600, 100);
        marco.createGUI();
        marco.setVisible(true);

    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
                
        lblbase = new JLabel("Ingrese su base: ");
        window.add(lblbase);
                
        txtbase = new JTextField(7);
        window.add(txtbase);
        
        btnmulti = new JButton(" * ");
        window.add(btnmulti);
        btnmulti.addActionListener(this);
        
        lblaltura = new JLabel("Ingrese su altura: ");
        window.add(lblaltura);
        
        txtaltura = new JTextField(7);
        window.add(txtaltura); 
                
        lblsigno = new JLabel(" = ");
        window.add(lblsigno);
        
        txtarea = new JTextField(7);
        window.add(txtarea);
    }
    
    public void actionPerformed(ActionEvent e){
    int base = Integer.parseInt(txtbase.getText());
    int altura = Integer.parseInt(txtaltura.getText());
    txtarea.setText(Integer.toString(base * altura) + "cm^2");
    }


}

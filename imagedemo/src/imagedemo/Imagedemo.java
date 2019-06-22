/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagedemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Imagedemo extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton button;
    private JTextField txtarchivo;
    private int posicionX = 0, posicionY = 0;
    
    public static void main(String[] args) {
        Imagedemo marco = new Imagedemo();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        
        txtarchivo = new JTextField(20);
        window.add(txtarchivo);
        
        button = new JButton("Haga clic");
        window.add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
    ImageIcon miImagen = new ImageIcon(txtarchivo.getText());
    Graphics papel = panel.getGraphics();
    miImagen.paintIcon(this, papel, posicionX, posicionY);
    posicionX = posicionX + 30;
    posicionY = posicionY + 30;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodologo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Metodologo extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;


    public static void main(String[] args) {
       Metodologo marco = new Metodologo();
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
        button = new JButton("Haz click");
        window.add(button);
        button.addActionListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e){
            soloHalo("naranjas");
////        Graphics papel = panel.getGraphics();
////        dibujarlogo(papel, 10, 20);
////        dibujarlogo(papel, 100, 100);
////        
//        dibujarlogo(papel,  50,  “10”);
//        dibujarlogo( 50,  10, papel);
//        dibujarlogo(papel, 10);

//            int a =10;
//            int b = 20;
//            dibujarlogo(papel, a,b);
//            dibujarlogo(papel, b+a, b-a);
//            dibujarlogo(papel, b +a -3, b + a -4);

    }
    
////    private void dibujarlogo(Graphics areadibujo,
////                            int xPos, int yPos){
////    areadibujo.drawRect(xPos, yPos, 60, 60);
////    areadibujo.drawRect(xPos, yPos, 40, 40);
////    areadibujo.drawRect(xPos, yPos, 20, 20);
////    }
    
    private void soloHalo(String fruta) {
    JOptionPane.showMessageDialog(null, fruta);
    }
}

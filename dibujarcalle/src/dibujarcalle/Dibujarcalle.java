/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarcalle;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dibujarcalle extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    
    
       
    public static void main(String[] args) {
        Dibujarcalle marco = new Dibujarcalle();
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
    Graphics areadibujo = panel.getGraphics();
//    dibujarcasa(areadibujo, 10, 20, 70, 20);
//    dibujarcasa(areadibujo, 10, 50, 50, 50);
    dibujarcalle(areadibujo, 8, 50, 50, 50);
    dibujarcalle(areadibujo, 80, 50, 50, 50);
    dibujarcalle(areadibujo, 160, 50, 50, 50);
    dibujarcalle(areadibujo, 240, 50, 50, 50); 
    }
    
//    private void dibujarcasa(Graphics areadibujo, 
//            int techoSupX, 
//            int techoSupY,
//            int anchura,
//            int altura){
//        dibujarTriangulo(areadibujo, techoSupX, techoSupY, anchura, altura);
//        areadibujo.drawRect(techoSupX,techoSupY+altura,anchura,altura);       
//    }
    
    private void dibujarTriangulo(Graphics areadibujo,
            int lugarX, 
            int lugarY,
            int anchura,
            int altura){
        areadibujo.drawLine(lugarX, lugarY, lugarX, lugarY + altura);
        areadibujo.drawLine(lugarX, lugarY + altura, 
                lugarX + anchura, lugarY + altura);
        areadibujo.drawLine(lugarX, lugarY, lugarX + anchura, 
                lugarY + altura);
        
    }
    
    private void dibujarcalle(Graphics areadibujo,
            int lugarX,
            int lugarY,
            int anchura,
            int altura){
            areadibujo.drawRect(lugarX,lugarY+altura,anchura,altura);
            areadibujo.drawLine(10, 195, 290, 195);
            areadibujo.drawLine(10, 150, 290, 150);
            dibujarTriangulo(areadibujo, lugarX, lugarY, anchura, altura);         
    }
    
}

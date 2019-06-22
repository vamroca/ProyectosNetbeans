/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarcalleenperspectiva;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dibujarcalleenperspectiva extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
    Dibujarcalleenperspectiva marco = new Dibujarcalleenperspectiva();
    marco.setSize(400,300);
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

    dibujarcallepers(areadibujo, 8, 134, 8, 8);
    dibujarcallepers(areadibujo, 80, 114, 18, 18);
    dibujarcallepers(areadibujo, 160, 106, 22, 22);
    dibujarcallepers(areadibujo, 240, 82, 34, 34); 
    }
    
    
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
    
    private void dibujarcallepers(Graphics areadibujo,
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

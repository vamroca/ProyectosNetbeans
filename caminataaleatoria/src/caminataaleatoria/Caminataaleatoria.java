
package caminataaleatoria;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Caminataaleatoria extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton boton;
    private JTextField txtxtexto;
    private Random aleatorio;
    private int ah=250, alh=150;
    
    public static void main(String[] args) {
        Caminataaleatoria marco = new Caminataaleatoria();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,150));
        panel.setBackground(Color.white);
        window.add(panel);
        
        boton = new JButton("Aceptar");
        window.add(boton);
        boton.addActionListener(this);
        
        txtxtexto = new JTextField(8);
        window.add(txtxtexto);
        
        aleatorio = new Random();
    
    }
    
    public void actionPerformed(ActionEvent e){
    Graphics hoja = panel.getGraphics();
    int x, y, px, py, nx, ny, p;
    hoja.setColor(Color.white);
    hoja.fillRect(0, 0, ah, alh);
    x = ah / 2;
    y = alh /2;
    for (p = 0;
            x < ah && x >0
            &&
            y < alh && y >0;
            p++){
        px = aleatorio.nextInt(100) - 50;
        py = aleatorio.nextInt(100) - 50;
        nx = x + px;
        ny = y + py;
        hoja.setColor(Color.black);
        hoja.drawLine(x, y, nx, ny);
        
        x = nx;
        y = ny;
    }
    
    txtxtexto.setText("Le tomo " + p + " pasos");
    
    }
    
}

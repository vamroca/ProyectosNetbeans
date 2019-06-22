package alberca;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Alberca extends JFrame implements
        ActionListener {
////        ChangeListener {

    private int anchura = 5, longitud = 20;

    private JPanel panel;
    private JTextField txtpro, txtvol, txttras;
    private JLabel lblpro, lblvo, lbltras;
    private JButton button;
    private JSlider profanchopocoprofundo;
    private JSlider profanchoprofundo;
    private int v,t;


    public static void main(String[] args) {
        Alberca marco = new Alberca();
        marco.setSize(300, 500);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

//        profanchoprofundo = new JSlider(JSlider.VERTICAL, 1, 5, 1);
//        window.add(profanchoprofundo);
//
//        profanchoprofundo.addChangeListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.white);
        window.add(panel);

        lblpro = new JLabel("Ingrese su Altura: ");
        window.add(lblpro);

        txtpro = new JTextField(5);
        window.add(txtpro);
        
        lblvo = new JLabel("El volumen de la alberca es: ");
        window.add(lblvo);

        txtvol = new JTextField(7);
        window.add(txtvol);
        
        button = new JButton("Volumen");
        window.add(button);
        button.addActionListener(this);
        
        lbltras = new JLabel("La seccion transversl de la alberca es: ");
        window.add(lbltras);

        txttras = new JTextField(5);
        window.add(txttras);
//
//        profanchopocoprofundo = new JSlider(JSlider.VERTICAL, 1, 4, 1);
//        window.add(profanchopocoprofundo);
//
//        profanchopocoprofundo.addChangeListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int timegap = v;
        int timegaps = t;
        
        Graphics papel = panel.getGraphics();
 
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        v = Integer.parseInt(txtpro.getText());
        txtvol.setText(Integer.toString(v * anchura * longitud) + " cm^3");
        t = Integer.parseInt(txtpro.getText());
        txttras.setText(Integer.toString(t * anchura * longitud / 2));
        papel.setColor(Color.RED);
        papel.fillRect(timegaps, timegaps, anchura, longitud);
        
        
    }
//
    public void stateChanged(ChangeEvent e) {
//        int timegap = v; 
//                //* anchura * longitud / 2;
//        int timegaps = t;
        //* anchura * longitud / 2;


        Graphics papel = panel.getGraphics();
//        timegap = profanchopocoprofundo.getValue();
//        timegaps = profanchoprofundo.getValue();
//        papel.setColor(Color.WHITE);
//        papel.fillRect(0, 0, 200, 200);
//        papel.setColor(Color.YELLOW);
//        papel.fillRect(50,50, longitud + timegap, timegap);
//        papel.fillRect(50,50, longitud + timegaps, timegaps);
//        papel.fillRect(100,100, timegap, longitud);
//        papel.fillRect(100,100, timegaps, longitud);
        
        
        
        
        papel.setColor(Color.GREEN);
        papel.fillRect(50, 150, 5, 20);
    }
}

package cuadradoherencia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CuadradoHerencia extends JFrame implements ActionListener {

    private JButton btn;
    private JPanel panel;
    private Cuadrado cuadrado;
//    private Forma forma;

    public static void main(String[] args) {
        CuadradoHerencia marco = new CuadradoHerencia();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 150));
        panel.setBackground(Color.WHITE);
        window.add(panel);

        btn = new JButton("Aceptar");
        window.add(btn);
        btn.addActionListener(this);
        cuadrado = new Cuadrado();

    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
//        papel.fillRect(0, 0, 0, 150);
//        papel.setColor(Color.white);
        
        
        cuadrado.mostrar(papel);
        cuadrado.moverDerecha();
        

    }

    public abstract class Forma {

        protected int x, y;
        protected int tamaño;

        public void moverDerecha() {
            x = x + 10;
        }

        public abstract void mostrar(Graphics papel);
    }

    public class Cuadrado extends Forma {

        public void mostrar(Graphics papel) {
            tamaño = 50;
            papel.drawRect(x, y, tamaño, tamaño);
        }

    }
}

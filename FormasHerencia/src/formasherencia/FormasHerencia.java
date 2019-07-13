package formasherencia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FormasHerencia extends JFrame implements ActionListener {

    private JButton btn;
    private JPanel panel;
    private Rectangulo rectangulo;
    private Circulo circulo;

    public static void main(String[] args) {
        FormasHerencia marco = new FormasHerencia();
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
        panel.setBackground(Color.white);
        window.add(panel);

        btn = new JButton("Aceptar");
        window.add(btn);
        btn.addActionListener(this);

        rectangulo = new Rectangulo();
        
        circulo = new Circulo();
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        rectangulo.mostrar(papel);
        circulo.mostrar(papel);
    }

    public abstract class Forma {

        protected int x, y;
        protected int tamañoa, tamañob;

        public void setX(int nuevaX) {
            x = nuevaX;
        }

        public void setY(int nuevaY) {
            y = nuevaY;
        }

        public void setAnchura(int anchura) {
            tamañoa = anchura;
        }

        public void setAltura(int altura) {
            tamañob = altura;
        }

        public void getArea(int area) {
            area = tamañoa * tamañob;
        }

        public abstract void mostrar(Graphics papel);
    }

    public class Rectangulo extends Forma {
 

        public void mostrar(Graphics papel) {
            x = 80;
            y = 40;
            tamañoa = 50;
            tamañob = 90;
            papel.setColor(Color.CYAN);
            papel.fillRect(x, y, tamañoa, tamañob);
        }

    }
    
    public class Circulo extends Forma{
        
        
            public void mostrar(Graphics papel) {
            x = 85;
            y = 0;
            tamañoa = 40;
            tamañob = 40;
            papel.setColor(Color.PINK);
            papel.fillOval(x, y, tamañoa, tamañob);
        }
    }
    
}

package esfera;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Esfera extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton btnderecha;
    private JButton btni;
    private Esferas esferas;
    private Pelota pelota;
    private EsferaColoreada esferaColoreada;

    public static void main(String[] args) {
        Esfera marco = new Esfera();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 150));
        panel.setBackground(Color.white);
        window.add(panel);

        btnderecha = new JButton("Derecha");
        window.add(btnderecha);
        btnderecha.addActionListener(this);

        btni = new JButton("I");
        window.add(btni);
        btni.addActionListener(this);

        esferas = new Esferas();
        pelota = new Pelota();
        esferaColoreada = new EsferaColoreada(Color.red);
//        EsferaColoreada esferaColoreada = new EsferaColoreada(Color.red);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        Object click = e.getSource();
        if (click == btnderecha) {
            pelota.moverDerecha(20);
        } else {
            pelota.moverIzquierda(20);
        }

//        esferas.mostrar(papel);
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 200, 200);
        pelota.mostrar(papel);
//        EsferaColoreada.mostrar(papel);        

    }

    public class Esferas {

        protected int x = 100, y = 100;

        public void setX(int nuevaX) {
            x = nuevaX;
        }

        public void setY(int nuevaY) {
            y = nuevaY;
        }

        public void mostrar(Graphics papel) {
            
            papel.drawOval(x, y, 20, 20);
        }
    }

    public class Burbujas extends Esferas {

        protected int radio = 10;

        public void setTamaño(int tamaño) {
            radio = tamaño;
        }

        public void mostrar(Graphics papel) {
            papel.drawOval(x, y, 2 * radio, 2 * radio);
        }

    }

    public class Pelota extends Esferas {

        public void moverDerecha(int px) {
            x = x + px;
        }

        public void moverIzquierda(int px) {
            x = x - px;
        }

        public void mostrar(Graphics papel) {
            papel.setColor(Color.yellow);
            papel.drawOval(x, y, 20, 20);
        }
    }

    public class EsferaColoreada extends Esferas {

        protected Color colores;

        public EsferaColoreada(Color colorsito) {
            colores = colorsito;
        }

//        public void mostrar(Graphics papel) {
//            papel.fillOval(x, y, 20, 20);
//        }
    }
}

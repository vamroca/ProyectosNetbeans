package naveespacial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class NaveEspacial extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton btnbotonarriba;
    private JButton btnbotonabajo;
    private NavesEspaciales navesespaciales;
    private Esferas esferas;

    public static void main(String[] args) {
        NaveEspacial marco = new NaveEspacial();
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

        btnbotonarriba = new JButton("Arriba");
        window.add(btnbotonarriba);
        btnbotonarriba.addActionListener(this);

        btnbotonabajo = new JButton("Abajo");
        window.add(btnbotonabajo);
        btnbotonabajo.addActionListener(this);

        esferas = new Esferas();
        navesespaciales = new NavesEspaciales();
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        Object click = e.getSource();

        if (click == btnbotonarriba) {
            navesespaciales.moverArriba(20);
        } else {
            if (click == btnbotonabajo) {
                navesespaciales.moverAbajo(20);
            } else {

            }

        }
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 250, 250);
        navesespaciales.mostrar(papel);
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

    public class NavesEspaciales extends Esferas {

        public void moverArriba(int py) {
            y = y - py;
        }

        public void moverAbajo(int py) {
            y = y + py;
        }

        public void mostrar(Graphics papel) {
            papel.setColor(Color.PINK);
            papel.drawOval(x, y, 20, 20);
        }
    }
}

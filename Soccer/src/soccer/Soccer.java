package soccer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Soccer extends JFrame implements ActionListener {

    private JButton btn;
    private JPanel panel;
    private Futbol futbol;
    private Pelota pelota;

    public static void main(String[] args) {
        Soccer marco = new Soccer();
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

        btn = new JButton("aceptar");
        window.add(btn);

        pelota = new Pelota(panel);
        futbol = new Futbol(panel);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
//        JPanel panel1 = pelota.panel;
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 250, 250);  
        pelota.animar();
        futbol.animar();
//        futbol.animar();
    }

    public class Pelota {

        private JPanel panel;
        protected int x = 7, cambioX = 7;
        protected int y = 0, cambioY = 2;
        protected final int diametro = 10;
        protected final int anchura = 100, altura = 100;

        public Pelota(JPanel elPanel) {
            panel = elPanel;
        }

        public void animar() {
            eliminar();
            mover();
            rebotar();
            dibujar();
        }

        private void mover() {
            x = x + cambioX;
            y = y + cambioY;
        }

        private void rebotar() {
            if (x <= 0 || x >= anchura) {
                cambioX = -cambioX;
            }
            if (y <= 0 || y >= altura) {
                cambioY = -cambioY;
            }
        }

        private void dibujar() {
            Graphics papel = panel.getGraphics();
            papel.setColor(Color.red);
            papel.fillOval(x, x, diametro, diametro);
        }

        private void eliminar() {
            Graphics papel = panel.getGraphics();
            papel.setColor(Color.white);
            papel.fillOval(x, x, diametro, diametro);
        }

    }

    public class Futbol extends Pelota {

        protected int cancha = 200;

        public Futbol(JPanel elPanel) {
            super(elPanel);
        }

        public void animar() {
            rebotar();
            dibujar();
        }

        private void rebotar() {
            if (x >= 0 || x <= cancha) {
                cambioX = -cambioX;
            }
            if (y <= 0 || y >= altura) {
                cambioY = -cambioY;
            }
        }

        private void dibujar() {
            Graphics papel = panel.getGraphics();
            papel.setColor(Color.red);
            papel.fillOval(x, x, diametro, diametro);
        }

    }

}

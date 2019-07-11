package soccer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Soccer extends JFrame implements ActionListener {

    private JButton btn;
    private JPanel panel;
    private Futbol futbol;
//    private Pelota pelota;

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

        futbol = new Futbol();

    }

    public void actionPerformed(ActionEvent e) {

    }

    public class Pelota {

        private JPanel panel;
        private int x = 7, cambioX = 7;
        private int y = 0, cambioY = 2;
        private final int diametro = 10;
        private final int anchura = 100, altura = 100;

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
                cambioX = -cambioY;
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

    public class Futbol{

    }

}

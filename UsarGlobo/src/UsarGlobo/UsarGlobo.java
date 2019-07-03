package UsarGlobo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsarGlobo extends JFrame implements ActionListener {

    private JButton btnderecha, btntamaño, btni, btnarriba;
    private JPanel panel;
    private JTextField txtexto;

    private Globo globo;

    public static void main(String[] args) {
        UsarGlobo marco = new UsarGlobo();
        marco.setSize(400, 420);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        btnderecha = new JButton("Mover Derecha");
        window.add(btnderecha);
        btnderecha.addActionListener(this);

        btntamaño = new JButton("Tamaño");
        window.add(btntamaño);
        btntamaño.addActionListener(this);

        btni = new JButton("Mover Izquierda");
        window.add(btni);
        btni.addActionListener(this);

        btnarriba = new JButton("Mover Arriba");
        window.add(btnarriba);
        btnarriba.addActionListener(this);

//        globo = new Globo();
        globo = new Globo(20);
        
//        globo = new Globo(10,10,50);

        txtexto = new JTextField(6);
        window.add(txtexto);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        Object click = e.getSource();

        if (click == btnderecha) {
            globo.moverDerecha(20);
        } else {
            if (click == btni) {
                globo.moverIzquierda(20);
            } else {
                if (click == btnarriba) {
                    globo.moverArriba(20);
                } else {

                    globo.cambiarTamaño(20);
                }
            }
        }
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 200, 200);
        globo.mostrar(papel);

    }

    public class Globo {

        private int x = 100;
        private int y = 100;
        private int d = 20;
        private Color colores;

        public Globo(int di) {
            x = 10;
            y = 10;
            d = di;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void moverDerecha(int px) {
            txtexto.setText(Integer.toString(getX()));
            x = x + px;
        }

        public void moverIzquierda(int px) {
            txtexto.setText(Integer.toString(getX()));
            x = x - px;
        }

        public void moverArriba(int py) {
            txtexto.setText(Integer.toString(getY()));
            y = y - py;
        }

        public void cambiarTamaño(int c) {
            d = d + c;
        }

        public void mostrar(Graphics papel) {
            papel.setColor(Color.black);
////            papel.setColor(colores);
////            papel.drawOval(x, y, d, d);
            papel.fillOval(x, y, d, d);
        }

        public void cambioColor(Color color) {
            colores = color;
        }
    }
}

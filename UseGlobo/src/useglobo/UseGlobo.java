package useglobo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UseGlobo extends JFrame implements ActionListener {

    private JButton btnderecha, btni, btnarriba, btnabajo;
    private JPanel panel;
    private JTextField txtexto, txtnombreglobo;

    private Globo globo;

    public static void main(String[] args) {
        UseGlobo marco = new UseGlobo();
        marco.setSize(500, 520);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btni = new JButton("Mover Izquierda");
        window.add(btni);
        btni.addActionListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.white);
        window.add(panel);

        btnderecha = new JButton("Mover Derecha");
        window.add(btnderecha);
        btnderecha.addActionListener(this);

        btnarriba = new JButton("Mover Arriba");
        window.add(btnarriba);
        btnarriba.addActionListener(this);

        btnabajo = new JButton("Mover Abajo");
        window.add(btnabajo);
        btnabajo.addActionListener(this);

        txtexto = new JTextField(6);
        window.add(txtexto);

        txtnombreglobo = new JTextField(6);
        window.add(txtnombreglobo);

        globo = new Globo();
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
                    if (click == btnabajo) {
                        globo.moverAbajo(20);
                    } else {

                    }

                }
            }
        }
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 250, 250);
        globo.mostrar(papel);
        txtexto.getText();
    }

    public class Globo {

        private int x = 125;
        private int y = 125;
        private int d = 30;
        private Color colors=Color.BLACK;
        private String nombres = "Globito";
        
        
        public Color getColor(){
        return colors;
        }

        public void moverDerecha(int px) {
            txtnombreglobo.setText(nombres);
            txtexto.setText(colors.toString());
            x = x + px;
        }

        public void moverIzquierda(int px) {
            txtnombreglobo.setText(nombres);
            txtexto.setText(colors.toString());
            x = x - px;
        }

        public void moverArriba(int py) {
            txtnombreglobo.setText(nombres);
            txtexto.setText(colors.toString());
            y = y - py;
        }

        public void moverAbajo(int px) {
            txtnombreglobo.setText(nombres);
            txtexto.setText(colors.toString());
            y = y + px;
        }

        public void cambiarTamaño(int c) {
            d = d + c;
        }

        public void mostrar(Graphics papel) {
            papel.setColor(Color.black);
            papel.fillOval(x, y, d, d);
        }

        public void cambioColor(Color color) {
            colors = color;
        }

    }

}

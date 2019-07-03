package glob;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Glob extends JFrame implements ActionListener {

    private JButton btntamaño, btnmover;
    private JPanel panel;
    private Globos globo;

    public static void main(String[] args) {
        Glob marco = new Glob();
        marco.setSize(200, 220);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 150));
        panel.setBackground(Color.white);
        window.add(panel);

        btntamaño = new JButton("Tamaño");
        window.add(btntamaño);
        btntamaño.addActionListener(this);

        btnmover = new JButton("Mover");
        window.add(btnmover);
        btnmover.addActionListener(this);

        globo = new Globos();

    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        Object click = e.getSource();
        if (click == btnmover) {
            globo.moverDerecha(20);
        } else {
            globo.cambiarTamaño(20);
        }
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 150, 150);
        globo.mostrar(papel);
    }


    public class Globos {

        private int x = 50;
        private int y = 50;
        private int d = 20;

        public void moverDerecha(int px) {
            x = x + px;
        }

        public void cambiarTamaño(int c) {
            d = d + c;
        }

        public void mostrar(Graphics papel) {
            papel.setColor(Color.black);
            papel.drawOval(x, y, d, d);
        }
    }
}

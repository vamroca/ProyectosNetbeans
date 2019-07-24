package arreglosobjetos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Arreglosobjetos extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton btnboton;
    private Globo[] fiesta = new Globo[10];

    public static void main(String[] args) {
        Arreglosobjetos marco = new Arreglosobjetos();
        marco.setSize(600, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(450, 250));
        window.add(panel);

        btnboton = new JButton("Pintar");
        window.add(btnboton);
        btnboton.addActionListener(this);

        fiesta[0] = new Globo(10, 10, 50);
        fiesta[1] = new Globo(50, 50, 100);
        fiesta[2] = new Globo(100, 100, 200);
    }

    public void actionPerformed(ActionEvent e) {
        Graphics papel = panel.getGraphics();
        mostrarGlobos(papel);
        cambiarTamaño();
    }

    public class Globo {

        private int x;
        private int y;
        private int diametro;

        public Globo(int xInicial, int yInicial, int diametroInicial) {
            x = xInicial;
            y = yInicial;
            diametro = diametroInicial;
        }

        public void cambiarTamaño(int cambio) {
            diametro = diametro + cambio;
        }

        public void mostrar(Graphics papel) {
            papel.drawOval(x, y, diametro, diametro);
        }
    }

    private void mostrarGlobos(Graphics papel) {
        for (int g = 0; g <= 2; g++) {
            fiesta[g].mostrar(papel);
        }
    }

    private void cambiarTamaño() {
        for (int g = 0; g <= 2; g++) {
            fiesta[g].cambiarTamaño(20);
        }
    }
}

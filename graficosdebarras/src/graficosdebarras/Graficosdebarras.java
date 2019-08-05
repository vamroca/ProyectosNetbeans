package graficosdebarras;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Graficosdebarras extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton btnboton;
    private Barras[] barra = new Barras[7];

    public static void main(String[] args) {
        Graficosdebarras marco = new Graficosdebarras();
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
        
        //7, 8, 0, 4, 3, 8, 1
        barra[0] = new Barras(0, 0, 70);
        barra[1] = new Barras(40, 0, 80);
        barra[2] = new Barras(80, 0, 0);
        barra[3] = new Barras(120, 0, 40);
        barra[4] = new Barras(160, 0, 30);
        barra[5] = new Barras(200, 0, 80);
        barra[6] = new Barras(220, 0, 10);
        
    }

    public void actionPerformed(ActionEvent e) {

        Graphics papel = panel.getGraphics();
        mostrarBarras(papel);
//        cambiarTamaño();
    }

    public class Barras {

        private int x;
        private int y;
        private int diametro;

        public Barras(int xInicial, int yInicial, int diametroInicial) {
            x = xInicial;
            y = yInicial;
            diametro = diametroInicial;
        }

        public void cambiarTamaño(int cambio) {
            diametro = diametro + cambio;
        }

        public void mostrar(Graphics papel) {
            papel.setColor(Color.red);
            papel.fillRect(x, y, diametro, diametro);
        }
    }
    
    private void mostrarBarras(Graphics papel) {
        for (int g = 0; g <= 2; g++) {
            barra[g].mostrar(papel);
        }
    }
}

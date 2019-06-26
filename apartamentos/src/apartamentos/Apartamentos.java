package apartamentos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Apartamentos extends JFrame implements ChangeListener {

    private JSlider h;
    private JSlider v;
    private JPanel panel;

    public static void main(String[] args) {
        Apartamentos marco = new Apartamentos();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        h = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        window.add(h);
        h.addChangeListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        v = new JSlider(JSlider.VERTICAL, 0, 10, 0);
        window.add(v);
        v.addChangeListener(this);

    }

    public void stateChanged(ChangeEvent e) {
        Graphics paper = panel.getGraphics();
        int pisos, apartamento;
        int x, y;
        y = 10;
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 250, 200);

        apartamento = h.getValue();
        pisos = v.getValue();
        for (int piso = 0; piso <= pisos; piso++) {
            x = 10;
            for (int cont = 0; cont <= apartamento; cont++) {
                paper.setColor(Color.BLACK);
                paper.drawRect(x, y, 10, 5);
                x = x + 15;
            }
            y = y + 15;
        }
    }

}

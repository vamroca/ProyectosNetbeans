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

        btni = new JButton("Mover Izquierda");
        window.add(btni);
        btni.addActionListener(this);

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

                    globo.moverAbajo(20);
                }
            }
        }

    }

}

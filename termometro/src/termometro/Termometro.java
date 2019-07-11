package termometro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Termometro extends JFrame implements ChangeListener {

    private JSlider termometro;
    private JTextField txtmenor;
    private JTextField txtmayor;
    private JTextField txttexto;
    private int max = 0;
    private int min = 0;
    private int mx;

    private Termometros termometros;

    public static void main(String[] args) {
        Termometro marco = new Termometro();
        marco.setSize(200, 300);
        marco.createGUI();
        marco.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        termometro = new JSlider(JSlider.VERTICAL, 0, 100, 1);
        termometro.setMajorTickSpacing(10);
        termometro.setPaintTicks(true);
        termometro.addChangeListener(this);
        window.add(termometro);

        txttexto = new JTextField(6);
        window.add(txttexto);

        txtmayor = new JTextField(6);
        window.add(txtmayor);

        txtmenor = new JTextField(6);
        window.add(txtmenor);

        termometros = new Termometros();

    }

    public void stateChanged(ChangeEvent e) {
        termometros.setNuevoValor();
        termometros.getMenorValor();
        termometros.getMayorValor();
    }

    public class Termometros {

        public void setNuevoValor() {
            mx = termometro.getValue();
            txttexto.setText(Integer.toString(mx));
        }

        public void getMenorValor() {
            mx = termometro.getValue();
            if (mx < min) {
                min = mx;
            }
            txtmenor.setText("Menor: " + Integer.toString(min));
        }

        public void getMayorValor() {
            mx = termometro.getValue();
            if (mx > max) {
                max = mx;
            }
            txtmayor.setText("Mayor: "+ Integer.toString(max));
        }
    }
}

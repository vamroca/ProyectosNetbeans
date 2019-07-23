package graficoscalculos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Graficoscalculos extends JFrame implements ChangeListener {

    int a, b, c, d;
    private JSlider aDes, bDes, cDes, dDes;
    private JTextField txta, txtb, txtc, txtd;
    private JPanel panel;
    private int altura = 200, anchura = 200;

    public static void main(String[] args) {
        Graficoscalculos marco = new Graficoscalculos();
        marco.setSize(320, 350);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        aDes = new JSlider(-5, 5);
        window.add(aDes);
        aDes.addChangeListener(this);

        txta = new JTextField(4);
        window.add(txta);

        bDes = new JSlider(-5, 5);
        window.add(bDes);
        bDes.addChangeListener(this);

        txtb = new JTextField(4);
        window.add(txtb);

        cDes = new JSlider(-5, 5);
        window.add(cDes);
        cDes.addChangeListener(this);

        txtc = new JTextField(4);
        window.add(txtc);

        dDes = new JSlider(-5, 5);
        window.add(dDes);
        dDes.addChangeListener(this);

        txtd = new JTextField(4);
        window.add(txtd);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(anchura, altura));
        panel.setBackground(Color.white);
        window.add(panel);
    }

    public void stateChanged(ChangeEvent e) {
        a = aDes.getValue();
        b = bDes.getValue();
        c = cDes.getValue();
        d = dDes.getValue();

        txta.setText("a = " + Integer.toString(a));
        txtb.setText("b = " + Integer.toString(b));
        txtc.setText("c = " + Integer.toString(c));
        txtd.setText("d = " + Integer.toString(d));
        dibujar();
    }

    private void dibujar() {
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.white);
        papel.fillRect(0, 0, anchura, altura);
        double x, y, siguienteX, siguienteY;
        int pixelX, pixelY, siguientePixelX, siguientePixelY;
        papel.setColor(Color.black);
        for (pixelX = 0; pixelX <= anchura; pixelX++) {
            x = escalarX(pixelX);
            y = laFuncion(x);
            pixelY = escalarY(y);
            siguientePixelX = pixelX + 1;
            siguienteX = escalarX(siguientePixelX);
            siguienteY = laFuncion(siguienteX);
            siguientePixelY = escalarY(siguienteY);
            papel.drawLine(pixelX, pixelY, siguientePixelX, siguientePixelY);

        }
    }

    private double laFuncion(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }
    
    private double escalarX(double pixelX){
        double xInicial = -5, xFinal = 5;
        double xEscala = anchura / (xFinal - xInicial);
        return (pixelX - (anchura /2)) / xEscala;
    }
    
    private int escalarY(double y){
    double yInicial = -5, yFinal = 5;
    int coordPixel;
    double yEscala = altura / (yFinal - yInicial);
    coordPixel = (int) (-y * yEscala) + (int) (altura/2);
    return coordPixel;
    }
    
}

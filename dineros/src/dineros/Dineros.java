package dineros;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dineros extends JFrame implements ActionListener {

    private JLabel etiquetainicial;
    private JTextField campoinicial;
    private JLabel etiquetaiterese;
    private JTextField campointerese;
    private JButton btnboton;
    private JTextArea areatexto;

    private int año = 1;
    private double montoAnterior;

    public static void main(String[] args) {
        Dineros marco = new Dineros();
        marco.setSize(460, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        etiquetainicial = new JLabel("Ingrese el monto inicial");
        window.add(etiquetainicial);

        campoinicial = new JTextField(3);
        window.add(campoinicial);

        etiquetaiterese = new JLabel("Ingrese la tasa de interes");
        window.add(etiquetaiterese);

        campointerese = new JTextField(3);
        window.add(campointerese);

        btnboton = new JButton("otro año");
        window.add(btnboton);
        btnboton.addActionListener(this);

        areatexto = new JTextArea(10, 40);
        window.add(areatexto);

        JScrollPane paleDespla = new JScrollPane(areatexto);
        window.add(paleDespla);
    }

    public void actionPerformed(ActionEvent e) {
        unAño();
    }

    private void unAño() {
        String nuevaLinea = "\r,\n";
        double tasa, montoNuevo;
        int dolares, centavos;

        if (año == 1) {
            montoAnterior = Double.parseDouble(campoinicial.getText());
        }
        tasa = Double.parseDouble(campointerese.getText());
        
        montoNuevo = montoAnterior +(montoAnterior * tasa / 100);
        dolares = (int) montoNuevo;
        centavos = (int) Math.round(100 * (montoNuevo - dolares));
        areatexto.append("Despues de "+ Integer.toString(año) + " años "
                
                + "el dinero se ha convertido en " + Integer.toString(dolares) 
                + " dolares y " + Integer.toString(centavos) + " centavos" + nuevaLinea
                );
        
        montoAnterior = montoNuevo;
        año++;
    }
}

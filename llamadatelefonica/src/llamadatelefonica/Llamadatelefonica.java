package llamadatelefonica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Llamadatelefonica extends JFrame implements ActionListener {

    private JTextField txthoras, txtsegs, txtmins, txtxcosto;
    private JLabel lblhoras, lblsegs, lblmins, lblcosto;
    private JButton btnaceptar;
    private int tics = 0;
    private Timer temporiador;
    private int minutos = 10;

    public static void main(String[] args) {
        Llamadatelefonica marco = new Llamadatelefonica();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lblhoras = new JLabel("Horas: ");
        window.add(lblhoras);

        txthoras = new JTextField(2);
        window.add(txthoras);
        
        lblmins = new JLabel("Minutos: ");
        window.add(lblmins);

        txtmins = new JTextField(2);
        window.add(txtmins);

        lblsegs = new JLabel("Segundos: ");
        window.add(lblsegs);

        txtsegs = new JTextField(2);
        window.add(txtsegs);
        
        btnaceptar = new JButton("Aceptar");
        window.add(btnaceptar);
        btnaceptar.addActionListener(this);
        
        lblcosto = new JLabel("Costo: ");
        window.add(lblcosto);
        
        txtxcosto = new JTextField(4);
        window.add(txtxcosto);

        temporiador = new Timer(1000, this);
////        temporiador = new Timer(20, this);
        temporiador.start();
    }
    
    
    public void actionPerformed(ActionEvent e){
        int centavos;
        
        txthoras.setText(Integer.toString(tics / 3600 ));
        txtmins.setText(Integer.toString(tics / 60));
        txtsegs.setText(Integer.toString(tics % 60));
        tics = tics + 1;
        
        centavos = (int) Math.round(((tics / 60) * minutos));
        txtxcosto.setText(Integer.toString(centavos));
    }

}

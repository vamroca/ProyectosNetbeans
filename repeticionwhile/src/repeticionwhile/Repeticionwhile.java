package repeticionwhile;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Repeticionwhile extends JFrame implements ActionListener {

    private JButton button;
    private JTextField txttexto;

    public static void main(String[] args) {
        Repeticionwhile marco = new Repeticionwhile();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txttexto = new JTextField(20);
        window.add(txttexto);

        button = new JButton("Aceptar");
        window.add(button);
        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
//        int n;
        String number = "";
        int n = 0;
        int ns = 1;

//        n = 1;
//        while (n <= 10) {
        while (ns <= 100) {
            number = number + Integer.toString(n + ns) + " ";
            ns++;
        }
        txttexto.setText(number);
    }
}

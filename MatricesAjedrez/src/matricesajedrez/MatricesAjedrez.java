package matricesajedrez;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MatricesAjedrez extends JFrame implements ActionListener {

    private JButton btnaceptar;
    private JTextArea txtarea;
    private String[][] aje = new String[8][8];
    private String[][] numeros = {{"uno","dos","tres"},
                                  {"cuatro","cinco","seis"},
                                  {"siete","ocho","nueve"}};
    
    public static void main(String[] args) {
        MatricesAjedrez marco = new MatricesAjedrez();
        marco.setSize(400, 400);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtarea = new JTextArea(10, 10);
        window.add(txtarea);

        btnaceptar = new JButton("Aceptar");
        window.add(btnaceptar);
        btnaceptar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
//        for (int col = 0; col < 7; col++) {
//            for (int fila = 0; fila < 7; fila++) {
//                aje[col][fila] = "x";
//            }
//        }
        
//        int tamañoFila = aje.length;
//        int tamañoCol = aje[0].length;
//        JOptionPane.showMessageDialog(null, "El tamaño de la fila es: " + 
//                Integer.toString(tamañoFila) + "\n" + "El tamaño de la Columna es: " 
//                + Integer.toString(tamañoCol));

    }
}

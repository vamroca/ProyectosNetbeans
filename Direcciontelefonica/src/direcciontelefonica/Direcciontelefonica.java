package direcciontelefonica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Direcciontelefonica extends JFrame implements ActionListener {

    private JButton btnagregar, btnbuscar, btneliminar, btnmostrar;
    private JTextField txtnombre, txtnumero;
    private JTextArea txtarea;
    private String[] nombres = new String[20];
    private String[] numero = new String[20];

    public static void main(String[] args) {
        Direcciontelefonica marco = new Direcciontelefonica();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        txtnombre = new JTextField(8);
        window.add(txtnombre);

        btnagregar = new JButton("Agregar Nombre");
        window.add(btnagregar);
        btnagregar.addActionListener(this);

        txtnumero = new JTextField(13);
        window.add(txtnumero);

        btnbuscar = new JButton("Buscar");
        window.add(btnbuscar);
        btnbuscar.addActionListener(this);

        txtarea = new JTextArea(10, 10);
        window.add(txtarea);
        
        btnmostrar = new JButton("Mostrar");
        window.add(btnmostrar);
        btnmostrar.addActionListener(this);
        
        btneliminar = new JButton("Eliminar");
        window.add(btneliminar);
        btneliminar.addActionListener(this);

        nombres[0] = "Antonio";
        numero[0] = "8235096";

        nombres[1] = "Jorge";
        numero[1] = "8140980";

        nombres[2] = "Isabel";
        numero[2] = "8117021";

        nombres[3] = "Carlos";
        numero[3] = "8150311";

        nombres[4] = "Penny";
        numero[4] = "8154060";

        nombres[5] = "FIN";

    }

    public void actionPerformed(ActionEvent e) {
        Object clic = e.getSource();
        
        if(clic == btnagregar){
            agregar();
        }else if(clic == btnbuscar){
            buscar();
        }else if (clic == btnmostrar){
            mostrar();
        }else{
            int i = 0;
            eliminar();
             for (; i < numero.length - 1; i++) {
            numero[i] = numero[i + 1];
        }
        numero[i] = null;
        }
    }

    private void agregar() {
        int i = 0;
        String n = txtnombre.getText();
        String nn = txtnumero.getText();
        nombres[i] = n;
        numero[i] = nn;
        i++;
        final String tab = "\t";
        txtarea.setTabSize(3);
        final String nuevaLinea = "\n";
        txtarea.append((nombres[i]) + tab + (numero[i]) + nuevaLinea);
    }

    private void buscar() {
        int i;
        String search;

        search = txtnombre.getText();
        i = 0;
        for (i = 0; !nombres[i].equals(search)
                && !(nombres[i].equals("FIN"));
                i++) {
        }
        if (nombres[i].equals(search)) {
            txtnumero.setText(numero[i]);
        } else {
            txtnumero.setText("No se encontro");
        }
    }

    private void eliminar() {
        int i = 0;
        for (; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[i] = null;
    }

    private void mostrar() {
        final String nuevaLinea = "\n";
        final String tab = "\t";
        txtarea.setTabSize(3);
        txtarea.setText("");
        for (int i = 0; i < nombres.length; i++) {
           
        }
        for (int i = 0; i < numero.length; i++) {
            txtarea.append((nombres[i]) + tab + (numero[i]) + nuevaLinea);
            
        }
    }
    
}

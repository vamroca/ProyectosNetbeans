
package sumarcampostexto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sumarcampostexto extends JFrame implements ActionListener{
    private JTextField camponumero1, camponumero2, caposuma;
    private JLabel etiquetaigual;
    private JButton buttonsuma;

    public static void main(String[] args) {
    Sumarcampostexto marco = new Sumarcampostexto();
    marco.setSize(400, 300);
    marco.createGUI();
    marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        camponumero1 = new JTextField(7);
        window.add(camponumero1);
        
        buttonsuma = new JButton(" + ");
        window.add(buttonsuma);
        buttonsuma.addActionListener(this);
        
        camponumero2 = new JTextField(7);
        window.add(camponumero2); 
        
        etiquetaigual = new JLabel(" = ");
        window.add(etiquetaigual);
        
        caposuma = new JTextField(7);
        window.add(caposuma); 
    }
    
    public void actionPerformed(ActionEvent e){
    int numero1 = Integer.parseInt(camponumero1.getText());
    int numero2 = Integer.parseInt(camponumero2.getText());
    caposuma.setText(Integer.toString(numero1 + numero2));
    }
    
}

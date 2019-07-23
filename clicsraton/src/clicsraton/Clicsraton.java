package clicsraton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Clicsraton extends JFrame implements MouseListener{

    private JPanel panel;
    private JTextField txttexto;
    
    
    public static void main(String[] args) {
        Clicsraton marco = new Clicsraton();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.white);
        window.add(panel);
        window.addMouseListener(this);
        
        txttexto = new JTextField(10);
        window.add(txttexto);
    }
 
    
    public void mouseClicked(MouseEvent e){
    int x = e.getX();
    int y = e.getY();
    Graphics papel = panel.getGraphics();
    papel.drawOval(x, y, 5, 5);
    txttexto.setText("x = " + Integer.toString(x) + " y = " 
            + Integer.toString(y));
    }


    public void mousePressed(MouseEvent e) {

    }


    public void mouseReleased(MouseEvent me) {

    }


    public void mouseEntered(MouseEvent me) {

    }


    public void mouseExited(MouseEvent me) {

    }
    
}

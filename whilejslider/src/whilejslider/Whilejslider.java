package whilejslider;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Whilejslider extends JFrame implements ChangeListener{

    private JPanel panel;
    private JSlider des;
    
    
    public static void main(String[] args) {
        Whilejslider marco = new Whilejslider();
        marco.setSize(400, 300);
        marco.createGUI();
        marco.setVisible(true);

    }
    
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 150));
        panel.setBackground(Color.WHITE);
        window.add(panel);
        
        des = new JSlider(0, 10, 1);
        window.add(des);
        des.addChangeListener(this);
        
    }
    
    public void stateChanged(ChangeEvent e){
        Graphics paper = panel.getGraphics();
        int x, numboxs, c;
        numboxs = des.getValue();
        paper.setColor(Color.WHITE);
        paper.fillRect(0, 0, 180, 50);
        x = 10;
        c = 1;
        paper.setColor(Color.BLACK);
        while(c <= numboxs){
            paper.drawRect(x, 10, 10, 10);
            x = x + 15;
            c++;
        }
    }
}

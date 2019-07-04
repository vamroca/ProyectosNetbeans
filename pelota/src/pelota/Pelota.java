/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelota;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pelota {

    private JPanel panel;
    private int x = 7, cambioX = 7;
    private int y = 0, cambioY = 2;
    private final int diametro = 10;
    private final int anchura = 100, altura = 100;

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Pelota(JPanel elPanel) {
        panel = elPanel;
    }

    public void animar() {
        eliminar();
        mover();
        rebotar();
        dibujar();
    }

    public void mover() {
        x = x + cambioX;
        y = y + cambioY;
    }

    public void rebotar() {
        if (x <= 0 || x >= anchura) {
            cambioX = -cambioY;
        }
        if (y <= 0 || y >= altura) {
            cambioY = -cambioY;
        }
    }

    public void dibujar() {
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.red);
        papel.fillOval(x, x, diametro, diametro);
    }

    public void eliminar() {
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.white);
        papel.fillOval(x, x, diametro, diametro);
    }

}

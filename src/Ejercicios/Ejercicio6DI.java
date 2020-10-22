package Ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Hacer un programa que te permita pintar en el frame
 */
public class Ejercicio6DI {

    public static void main(String[] args) {
        Frame f = new Frame("Ejercicio 6");
        f.setBackground(Color.GRAY);


        f.setBounds(200, 100, 900,600);
        f.setVisible(true);

        // Crear panel
        Panel p = new Panel();

        f.add(p);

        Label lab = new Label();
        lab.setBounds(0, 50, 200, 50);
        Label l1 = new Label();
        l1.setBounds(50, 50, 100, 30);
        Label l2 = new Label();
        l2.setBounds(160, 50, 100, 30);
        TextArea area = new TextArea();
        area.setBounds(20, 100, 300, 300);
        Button b = new Button("Contar");
        b.setBounds(100, 400, 100, 30);

        b.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String frase = area.getText();
                String palabras[] = frase.split("\\s");
                l1.setText("Palabras: " + palabras.length);
                l2.setText("Caracteres: " + frase.length());
            }
        });


        area.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lab.setText("Raton clickado");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                lab.setText("Raton pulsado");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lab.setText("Publicado");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lab.setText("Raton dentro");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lab.setText("Raton fuera");
            }
        });


        p.add(area);
        p.add(b);
        p.add(l1);
        p.add(l2);
        p.add(lab);
    }
}

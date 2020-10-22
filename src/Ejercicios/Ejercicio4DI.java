package Ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Programar una interfaz en la que aparezca un label diciendo que introduzcas un deporte, un campo de
 * texto y un botón , al pulsar el botón se añadirá a una lista el deporte introducido por teclado y también
 * contará con un scrolbar y otro boton que nos diga cuanto preferimos ese deporte del 1 al 100.
 */

public class Ejercicio4DI {

    public static void main(String[] args) {
        // Creo un frame
        Frame f = new Frame("Ejercicio 4");
        f.setBackground(Color.GRAY);

        // Centrar frame
        f.setLocationRelativeTo(null);

        f.setSize(800,600);
        f.setVisible(true);

        // Creo un panel
        Panel p = new Panel();
        f.add(p);

        // Creo un label
        Label l = new Label("Introduce un deporte");
        l.setBounds(50,50,150,20);


        // Creo un textField
        TextField tf = new TextField("Deporte");
        tf.setBounds(50,100,150,20);


        // Creo una lista
        List lis = new List();
        lis.setBounds(50,150,150,130);

        // Creo un boton
        Button b = new Button("Añadir");
        b.setBounds(50,300,50,50);


        // Creo un scrollbar al hacer click en el boton
        Scrollbar sb = new Scrollbar();
        p.add(sb);

        sb.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                String deporte = lis.getItem(lis.getSelectedIndex());
                int valor = sb.getValue();
            }
        });

        // Creo un boton
        Button b2 = new Button("Ver");
        b2.setBounds(120,300,50,50);


        b2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creo un frame nuevo
                Frame f2 = new Frame("Ejercicio 4");
                f2.setVisible(true);
                f2.setBackground(Color.GRAY);
                f2.setSize(300,300);
                f2.setLocationRelativeTo(null);

                // Creo un pane para el frame nuevo
                Panel p2 = new Panel();
                f2.add(p2);

                Label deporte = new Label(lis.getItem(lis.getSelectedIndex()));
                Label valor = new Label(String.valueOf(sb.getValue()));

                p2.add(deporte);
                p2.add(valor);
            }
        });

        b.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lis.add(tf.getText());
            }
        });

        p.add(l);
        p.add(tf);
        p.add(lis);
        p.add(b);
        p.add(b2);

    }

}


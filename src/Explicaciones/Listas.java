package Explicaciones;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Listas {
    public static void main(String[] args) {
        Frame f = new Frame("Ejemplo listas");
        f.setVisible(true);

        Panel p = new Panel();
        f.add(p);

        // Creamos listas
        List l = new List();

        l.add("Aguado");
        l.add("Bravo");
        l.add("Chozas");
        l.add("Tus muertos");

        p.add(l);

        Button boton = new Button("Informar");

        p.add(boton);

        boton.addActionListener(e -> {
            System.out.println(l.getItem(l.getSelectedIndex()));
        });
    }
}

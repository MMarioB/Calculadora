package Ejercicios;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Implementar un programa que elija entre uno de los numeros del uno al 10, y me muestre en el panel la tabla
 * de multiplicar de dicho numero.
 */
public class Ejercicio2DI {
    public static void main(String[] args) {
        // Creo un frame
        Frame frame = new Frame("Ejercicio 2");
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);
        frame.setBounds(600, 400, 500, 300);

        // Creo un panel y lo añado al frame
        Panel p = new Panel();
        frame.add(p);

        // Creo una etiqueta
        Label l = new Label("Elige un numero");
        p.add(l);

        // Creo un checkboxGroup
        CheckboxGroup chg = new CheckboxGroup();

        // Creo 10 checkbox con los numeros del 1 al 10 para que el usuario elija uno y mostrarle la tabla de multiplicar
        Checkbox ch1 = new Checkbox("1", chg, false);
        Checkbox ch2 = new Checkbox("2", chg, false);
        Checkbox ch3 = new Checkbox("3", chg, false);
        Checkbox ch4 = new Checkbox("4", chg, false);
        Checkbox ch5 = new Checkbox("5", chg, false);
        Checkbox ch6 = new Checkbox("6", chg, false);
        Checkbox ch7 = new Checkbox("7", chg, false);
        Checkbox ch8 = new Checkbox("8", chg, false);
        Checkbox ch9 = new Checkbox("9", chg, false);
        Checkbox ch10 = new Checkbox("10", chg, false);

        //Añado los checkbox al panel
        p.add(ch1);
        p.add(ch2);
        p.add(ch3);
        p.add(ch4);
        p.add(ch5);
        p.add(ch6);
        p.add(ch7);
        p.add(ch8);
        p.add(ch9);
        p.add(ch10);

        // Cierro la ventana
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 1
        mostrarTabla(ch1);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 2
        mostrarTabla(ch2);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 3
        mostrarTabla(ch3);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 4
        mostrarTabla(ch4);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 5
        mostrarTabla(ch5);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 6
        mostrarTabla(ch6);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 7
        mostrarTabla(ch7);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 8
        mostrarTabla(ch8);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 9
        mostrarTabla(ch9);

        // Añado una accion al checkbox para mostrar la tabla de multiplicar 10
        mostrarTabla(ch10);


    }

    private static void mostrarTabla(Checkbox ch) {
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Creo un frame y un panel para mostrar la tabla del 1
                Frame frame1 = new Frame("Tabla del " + ch.getLabel());
                frame1.setBounds(700, 400, 500, 300);
                frame1.setVisible(true);
                frame1.setBackground(Color.GRAY);

                Panel p = new Panel();
                frame1.add(p);

                String salida = "";
                for (int i = 0; i <= 10; i++) {
                    int numero = Integer.parseInt(ch.getLabel());
                    int resultado = numero * i;
                    salida += numero + " x " + i + " = " + resultado + ";";

                }
                String[] tabla = salida.split(";");

                // Creo los label para mostrar la tabla
                Label l1 = new Label(tabla[0]);
                p.add(l1);
                Label l2 = new Label(tabla[1]);
                p.add(l2);
                Label l3 = new Label(tabla[2]);
                p.add(l3);
                Label l4 = new Label(tabla[3]);
                p.add(l4);
                Label l5 = new Label(tabla[4]);
                p.add(l5);
                Label l6 = new Label(tabla[5]);
                p.add(l6);
                Label l7 = new Label(tabla[6]);
                p.add(l7);
                Label l8 = new Label(tabla[7]);
                p.add(l8);
                Label l9 = new Label(tabla[8]);
                p.add(l9);
                Label l10 = new Label(tabla[9]);
                p.add(l10);
                Label l11 = new Label(tabla[10]);
                p.add(l11);

                // Cierro la ventana
                frame1.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                });
            }

        });
    }
}

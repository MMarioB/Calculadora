package Ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Implementar un programa que contenga 3 campos de texto, un choice y un boton.
 * En los 2 primeros campos se introduciran 2 numeros y el choice eligira la operacion a realizar(+,-,*,/)
 * Al pulsar el boton calcular aparecera el resultado en el textbox restante
 */

public class Ejercicio3DI {
    public static void main(String[] args) {
        // Creo un frame
        Frame frame3 = new Frame("Ejercicio 3");
        frame3.setVisible(true);
        frame3.setBackground(Color.GRAY);
        frame3.setBounds(600, 400, 500, 300);

        // Creo 3 panel y los añado al frame
        Panel p = new Panel();
        frame3.add(p);

        // Creo una etiqueta
        Label l = new Label("Elige un numero");
        p.add(l);

        // Añado un textField
        TextField txt1 = new TextField("Numero 1");
        p.add(txt1);

        // Creo una etiqueta
        Label l2 = new Label("Elige un numero");
        p.add(l2);

        // Añado un textField
        TextField txt2 = new TextField("Numero 2");
        p.add(txt2);

        // Creo una etiqueta
        Label l3 = new Label("Elige una operacion");
        p.add(l3);

        // Añado un choice
        Choice cho1 = new Choice();

        cho1.add("+");
        cho1.add("-");
        cho1.add("x");
        cho1.add("/");

        p.add(cho1);

        //Añado un boton
        Button boton = new Button("Calcular");
        p.add(boton);

        // Creo una etiqueta
        Label l4 = new Label("Resultado final");
        p.add(l4);

        // Añado un textField
        TextField txt3 = new TextField("Resultado");
        p.add(txt3);

        // Le añado un evento al boton
        boton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Guardo el item seleccionado del choice en un string
                String dato = cho1.getItem(cho1.getSelectedIndex());

                // Comparo el dato guardado del choice con la operacion y la realizo si coincide
                if (dato.equals("+")) {
                    // Muestro el resultado en el textfield resultado
                    int resultado = Integer.parseInt(txt1.getText()) + Integer.parseInt(txt2.getText());
                    txt3.setText(String.valueOf(resultado));
                } else if (dato.equals("-")) {
                    int resultado = Integer.parseInt(txt1.getText()) - Integer.parseInt(txt2.getText());
                    txt3.setText(String.valueOf(resultado));
                } else if (dato.equals("x")) {
                    int resultado = Integer.parseInt(txt1.getText()) * Integer.parseInt(txt2.getText());
                    txt3.setText(String.valueOf(resultado));
                } else if (dato.equals("/")) {
                    Double resultado = Double.parseDouble(txt1.getText()) / Double.parseDouble(txt2.getText());
                    txt3.setText(String.valueOf(resultado));
                } else {
                    System.out.println("Error, no has elegido una opcion correcta.");
                }

            }
        });

    }
}

package Practicas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class Calculadora {

    public static void main(String[] args) {
        final String[] valor1 = new String[1];
        final String[] valor2 = new String[1];
        final String[] signo = new String[1];
        final String[] contenido = new String[1];
        final double[] resultado = new double[1];
        final boolean[] punto = {true};
        final boolean[] operado = new boolean[1];
        operado[0]=true;
        final String[] resultadototal = {""};
        // Creo un frame
        Frame f = new Frame("Calculadora");

        f.setTitle("CALCULADORA");
        f.setSize(350, 350);
        f.setLocationRelativeTo(null);
        f.setLayout(new GridLayout(2, 1));
        f.setVisible(true);

        // Creo un window listener para poder cerrar la aplicación cuando quiera
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Creo TextField para mostrar los resultados
        TextField pantalla = new TextField();
        // Añado una fuente
        Font myFont = new Font("Courier", Font.ITALIC, 25);
        pantalla.setFont(myFont);
        // Le doy color al fondo
        pantalla.setBackground(Color.CYAN);

        // Bloqueo el textfield para que no se pueda escribir en el
        pantalla.setEditable(false);
        f.add(pantalla);

        // Creo el panel de los botones
        Panel botones = new Panel(new GridLayout(0, 6, 3, 3));

        // Creo botones
        Button numero_1 = new Button("1");
        numero_1.setBackground(Color.darkGray);
        numero_1.setFont(myFont);
        numero_1.setSize(50, 30);

        Button numero_2 = new Button("2");
        numero_2.setBackground(Color.darkGray);
        numero_2.setFont(myFont);
        numero_2.setSize(50, 30);

        Button numero_3 = new Button("3");
        numero_3.setBackground(Color.darkGray);
        numero_3.setFont(myFont);
        numero_3.setSize(50, 30);

        Button numero_4 = new Button("4");
        numero_4.setBackground(Color.darkGray);
        numero_4.setFont(myFont);
        numero_4.setSize(50, 30);

        Button numero_5 = new Button("5");
        numero_5.setBackground(Color.darkGray);
        numero_5.setFont(myFont);
        numero_5.setSize(50, 30);

        Button numero_6 = new Button("6");
        numero_6.setBackground(Color.darkGray);
        numero_6.setFont(myFont);
        numero_6.setSize(50, 30);

        Button numero_7 = new Button("7");
        numero_7.setBackground(Color.darkGray);
        numero_7.setFont(myFont);
        numero_7.setSize(50, 30);

        Button numero_8 = new Button("8");
        numero_8.setBackground(Color.darkGray);
        numero_8.setFont(myFont);
        numero_8.setSize(50, 30);

        Button numero_9 = new Button("9");
        numero_9.setBackground(Color.darkGray);
        numero_9.setFont(myFont);
        numero_9.setSize(50, 30);

        Button numero_0 = new Button("0");
        numero_0.setBackground(Color.darkGray);
        numero_0.setFont(myFont);
        numero_0.setSize(50, 30);

        Button suma = new Button("+");
        suma.setBackground(Color.darkGray);
        suma.setFont(myFont);
        suma.setSize(50, 30);

        Button resta = new Button("-");
        resta.setBackground(Color.darkGray);
        resta.setFont(myFont);
        resta.setSize(50, 30);

        Button division = new Button("/");
        division.setBackground(Color.darkGray);
        division.setFont(myFont);
        division.setSize(50, 30);

        Button multiplicar = new Button("x");
        multiplicar.setBackground(Color.darkGray);
        multiplicar.setFont(myFont);
        multiplicar.setSize(50, 30);

        Button raiz = new Button("√");
        raiz.setBackground(Color.darkGray);
        raiz.setFont(myFont);
        raiz.setSize(50, 30);

        Button potencia = new Button("x^y");
        potencia.setBackground(Color.darkGray);
        potencia.setFont(myFont);
        potencia.setSize(50, 30);

        Button igual = new Button("=");
        igual.setBackground(Color.darkGray);
        igual.setFont(myFont);
        igual.setSize(50, 30);

        Button limpiar = new Button("C");
        limpiar.setBackground(Color.darkGray);
        limpiar.setFont(myFont);
        limpiar.setSize(50, 30);

        Button porcentaje = new Button("%");
        porcentaje.setBackground(Color.darkGray);
        porcentaje.setFont(myFont);
        porcentaje.setSize(50, 30);

        Button unox = new Button("1/x");
        unox.setBackground(Color.darkGray);
        unox.setFont(myFont);
        unox.setSize(50, 30);

        Button potencia2 = new Button("x²");
        potencia2.setBackground(Color.darkGray);
        potencia2.setFont(myFont);
        potencia2.setSize(50, 30);

        Button coma = new Button(".");
        coma.setBackground(Color.darkGray);
        coma.setFont(myFont);
        coma.setSize(50, 30);

        Button masmenos = new Button("+-");
        masmenos.setBackground(Color.darkGray);
        masmenos.setFont(myFont);
        masmenos.setSize(50, 30);

        Button borrar = new Button("<--");
        borrar.setBackground(Color.darkGray);
        borrar.setFont(myFont);
        borrar.setSize(50, 30);

        // Añado los botones al panel de los botones
        for (Button button : Arrays.asList(numero_7, numero_8, numero_9, division, limpiar, borrar, numero_4, numero_5,
                numero_6, multiplicar, unox, potencia2, numero_1, numero_2, numero_3, resta, potencia, raiz,
                numero_0, coma, igual, suma, porcentaje, masmenos)) {
            botones.add(button);
        }

        f.add(botones);

        // Botones numeros
        numero_0.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "0");
                } else {
                    pantalla.setText("0");
                    operado[0]=false;
                }
            }
        });

        numero_1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "1");
                } else {
                    pantalla.setText("1");
                    operado[0]=false;
                }
            }
        });

        numero_2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "2");
                } else {
                    pantalla.setText("2");
                    operado[0]=false;
                }
            }
        });

        numero_3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0") && !operado[0]){
                    pantalla.setText(pantalla.getText() + "3");
                } else {
                    pantalla.setText("3");
                    operado[0]=false;
                }
            }
        });

        numero_4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "4");
                } else {
                    pantalla.setText("4");
                    operado[0]=false;
                }
            }
        });
        numero_5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "5");
                } else {
                    pantalla.setText("5");
                    operado[0]=false;
                }
            }
        });

        numero_6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "6");
                } else {
                    pantalla.setText("6");
                    operado[0]=false;
                }
            }
        });

        numero_7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "7");
                } else {
                    pantalla.setText("7");
                    operado[0]=false;
                }
            }
        });

        numero_8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "8");
                } else {
                    pantalla.setText("8");
                    operado[0]=false;
                }
            }
        });

        numero_9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().equals("0")&& !operado[0]){
                    pantalla.setText(pantalla.getText() + "9");
                } else {
                    pantalla.setText("9");
                    operado[0]=false;
                }
            }
        });

        // Borramos la pantalla
        limpiar.addActionListener(e -> pantalla.setText("0"));

        // Boton punto
        coma.addActionListener(e -> {
            contenido[0] = pantalla.getText();
            // Si el contenido es menor o igual de 0 pongo "0." Si el campo esta vacio muestro "0."
            if (contenido[0].length() <= 0) {
                pantalla.setText("0.");
            } else {
                // Si hay algun punto no coloca otro punto
                if (pantalla.getText().contains(".")) {
                } else {
                    pantalla.setText(pantalla.getText() + ".");
                    punto[0] = false;
                }
            }
        });

        // Boton masmenos
        masmenos.addActionListener(e -> {
            contenido[0] = pantalla.getText();
            if (contenido[0].length() > 0) {
                resultado[0] = (-1) * Double.parseDouble(contenido[0]);
                if (resultado[0]%1==0){
                    pantalla.setText(String.valueOf((int)resultado[0]));
                } else {
                    pantalla.setText(String.valueOf(resultado[0]));
                }
            }
            operado[0]=true;
        });

        // Botones elevados
        unox.addActionListener(e -> {
            contenido[0]=pantalla.getText();
            if (contenido[0].length()>0){
                resultado[0]=1/Double.parseDouble(contenido[0]);
                pantalla.setText(String.valueOf(resultado[0]));
            }
            operado[0]=true;
        });

        // Botones elevados
        potencia2.addActionListener(e -> {
            contenido[0]=pantalla.getText();
            if (contenido[0].length()>0){
                resultado[0]=Math.pow(Double.parseDouble(contenido[0]),2);
                if (resultado[0]%1==0){
                    pantalla.setText(String.valueOf((int)resultado[0]));
                } else {
                    pantalla.setText(String.valueOf(resultado[0]));
                }
            }
            operado[0]=true;
        });

        // Operacines botones
        suma.addActionListener(e -> {
            if (!pantalla.getText().equals("")){
                valor1[0] =pantalla.getText();
                signo[0] ="+";
                pantalla.setText("");
            }
            operado[0]=false;
        });

        resta.addActionListener(e -> {
            if (!pantalla.getText().equals("")){
                valor1[0] =pantalla.getText();
                signo[0] ="-";
                pantalla.setText("");
            }
            operado[0]=false;
        });

        multiplicar.addActionListener(e -> {
            if (!pantalla.getText().equals("")){
                valor1[0] =pantalla.getText();
                signo[0] ="x";
                pantalla.setText("");
            }
            operado[0]=false;
        });

        division.addActionListener(e -> {
            if (!pantalla.getText().equals("")){
                valor1[0] =pantalla.getText();
                signo[0] ="/";
                pantalla.setText("");
            }
            operado[0]=false;
        });

        potencia.addActionListener(e -> {
            if (!pantalla.getText().equals("")){
                valor1[0] =pantalla.getText();
                signo[0] ="x^y";
                pantalla.setText("");
            }
            operado[0]=true;
        });


        raiz.addActionListener(e -> {
            contenido[0]= pantalla.getText();
            if (contenido[0].length()>0){
                resultado[0]=Math.sqrt(Double.parseDouble(contenido[0]));
                if (resultado[0]%1==0){
                    pantalla.setText(String.valueOf((int)resultado[0]));
                } else {
                    pantalla.setText(String.valueOf(resultado[0]));
                }

            }
            operado[0]=true;
        });

        porcentaje.addActionListener(e -> {
            if (!pantalla.getText().equals("")){
                valor1[0] =pantalla.getText();
                signo[0] ="%";
                pantalla.setText("");
            }
            operado[0]=true;
        });

        borrar.addActionListener(e -> {
            contenido[0]=pantalla.getText();
            if (contenido[0].length()>0){
                contenido[0]=contenido[0].substring(0, contenido[0].length()-1);
                pantalla.setText(contenido[0]);
            }

        });

        igual.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2[0] =pantalla.getText();
                if (!valor2[0].equals("")){
                    resultadototal[0] =operaciones(valor1[0],valor2[0],signo[0]);
                    pantalla.setText(resultadototal[0]);
                }
                operado[0]=true;
            }
        });

    }

    public static String operaciones(String valor1, String valor2, String signo) {
        double resultadocal = 0.0;
        String respuesta;

        if (signo.endsWith("+")) {
            resultadocal = Double.parseDouble(valor1) + Double.parseDouble(valor2);
        } else if (signo.endsWith("-")) {
            resultadocal = Double.parseDouble(valor1) - Double.parseDouble(valor2);
        } else if (signo.endsWith("x")) {
            resultadocal = Double.parseDouble(valor1) * Double.parseDouble(valor2);
        } else if (signo.endsWith("/")) {
            resultadocal = Double.parseDouble(valor1) / Double.parseDouble(valor2);
        } else if (signo.endsWith("x^y")) {
            resultadocal = Math.pow(Double.parseDouble(valor1), Double.parseDouble(valor2));
        } else if (signo.endsWith("%")){
            resultadocal = (Double.parseDouble(valor1)/100)*Double.parseDouble(valor2);
        }
        if (resultadocal%1==0){
            respuesta = String.valueOf((int)resultadocal);
        } else{
            respuesta = String.valueOf(resultadocal);
        }

        return respuesta;
    }



}

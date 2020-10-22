package Ejercicios;

import java.awt.*;
import java.awt.event.*;

/**
 * Implementar un programa que elija entre los vehiculos que quieres comprar(Se pueden elegir más de uno)
 * <p>
 * Coche --> Si elegimos coche nos apareceran unos checkBox del color y otros de la marca
 * Moto --> Si elegimos moto nos apareceran unos checkBox de la cilindrada y otro del tipo de moto
 * <p>
 * Tendra un boton que al pulsarlo nos mostrará un dialogo con la información elegida
 */

public class Ejercicio1DI {
    public static void main(String[] args) {
        // Creo un frame
        Frame frame = new Frame("Ejercicio 1");
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);
        frame.setBounds(600, 400, 500, 300);

        // Creo un panel y lo añado al frame
        Panel p = new Panel();
        frame.add(p);

        // Creo una etiqueta
        Label l = new Label("Elige un vehiculo");
        p.add(l);

        // Creo 2 checkbox para elegir vehiculo
        Checkbox ch1 = new Checkbox("Coche", false);
        Checkbox ch2 = new Checkbox("Moto", false);

        p.add(ch1);
        p.add(ch2);

        // Cierro la ventana
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Creo un listener para comprobar si esta marcado el checkbox de coche
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (ch1.getState() == true) {
                    // Creo un nuevo frame y panel donde muestro checkbox de color y marca y muestro la eleccion en un alert
                    Frame frame1 = new Frame("Coche");
                    frame1.setBounds(700, 400, 500, 300);
                    frame1.setVisible(true);
                    frame1.setBackground(Color.GRAY);

                    Panel p2 = new Panel();
                    frame1.add(p2);

                    // Creo una etiqueta
                    Label l2 = new Label("Elige un color");
                    p2.add(l2);

                    // Creo checkBox de color
                    Checkbox ch1Color = new Checkbox("Azul");
                    Checkbox ch2Color = new Checkbox("Verde");
                    Checkbox ch3Color = new Checkbox("Amarillo");

                    p2.add(ch1Color);
                    p2.add(ch2Color);
                    p2.add(ch3Color);

                    // Creo una etiqueta
                    Label l3 = new Label("Elige una marca");
                    p2.add(l3);

                    // Creo checkBox de marca
                    Checkbox ch1Marca = new Checkbox("Renault");
                    Checkbox ch2Marca = new Checkbox("Audi");
                    Checkbox ch3Marca = new Checkbox("BMW");

                    p2.add(ch1Marca);
                    p2.add(ch2Marca);
                    p2.add(ch3Marca);

                    // Añado un boton para mostrar el alert de la compra
                    Button boton = new Button("Comprar");
                    p2.add(boton);

                    boton.addActionListener(new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (ch1Color.getState() == true && ch1Marca.getState() == true) {
                                Frame f = new Frame();
                                Dialog d = new Dialog(f, "Compra Coche", true);

                                Label ldialog = new Label("Has comprado un coche de color: " + ch1Color.getLabel()
                                        + " de la marca: " + ch1Marca.getLabel());
                                d.add(ldialog);
                                d.setBounds(700, 400, 500, 300);
                                d.setVisible(true);

                                // Cierro el dialog


                            } else if (ch2Color.getState() == true && ch2Marca.getState() == true) {
                                crearFrameCoche(ch2Color, ch2Marca);
                            } else if (ch3Color.getState() == true && ch3Marca.getState() == true) {
                                crearFrameCoche(ch3Color, ch3Marca);
                            } else if (ch1Color.getState() == true && ch2Marca.getState() == true) {
                                crearFrameCoche(ch1Color, ch2Marca);
                            } else if (ch1Color.getState() == true && ch3Marca.getState() == true) {
                                crearFrameCoche(ch1Color, ch3Marca);
                            } else if (ch2Color.getState() == true && ch1Marca.getState() == true) {
                                crearFrameCoche(ch2Color, ch1Marca);
                            } else if (ch2Color.getState() == true && ch3Marca.getState() == true) {
                                crearFrameCoche(ch2Color, ch3Marca);
                            } else if (ch3Color.getState() == true && ch1Marca.getState() == true) {
                                crearFrameCoche(ch3Color, ch1Marca);
                            } else if (ch3Color.getState() == true && ch2Marca.getState() == true) {
                                crearFrameCoche(ch3Color, ch2Marca);
                            } else {
                                Frame f = new Frame();
                                Dialog d = new Dialog(f, "Compra Moto", true);

                                Label ldialog = new Label("No has comprado ningun coche");
                                d.add(ldialog);
                                d.setBounds(700, 400, 500, 300);
                                d.setVisible(true);
                            }
                        }
                    });

                    // Cierro la ventana
                    frame1.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent we) {
                            System.exit(0);
                        }
                    });
                }
            }
        });

        // Creo un listener para comprobar si esta marcado el checkbox de motos
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (ch2.getState() == true) {
                    // Creo un nuevo frame y panel donde muestro checkbox de color y marca y muestro la eleccion en un alert
                    Frame frame1Moto = new Frame("Moto");
                    frame1Moto.setBounds(700, 400, 500, 300);
                    frame1Moto.setVisible(true);
                    frame1Moto.setBackground(Color.GRAY);

                    Panel p2Moto = new Panel();
                    frame1Moto.add(p2Moto);

                    // Creo una etiqueta
                    Label l2Moto = new Label("Elige una cilindrada");
                    p2Moto.add(l2Moto);

                    // Creo checkBox de color
                    Checkbox ch1CilindradaMoto = new Checkbox("150cc");
                    Checkbox ch2CilindradaMoto = new Checkbox("250cc");
                    Checkbox ch3CilindradaMoto = new Checkbox("500cc");

                    p2Moto.add(ch1CilindradaMoto);
                    p2Moto.add(ch2CilindradaMoto);
                    p2Moto.add(ch3CilindradaMoto);

                    // Creo una etiqueta
                    Label l3Moto = new Label("Elige el tipo");
                    p2Moto.add(l3Moto);

                    // Creo checkBox de marca
                    Checkbox ch1TipoMoto = new Checkbox("Competición");
                    Checkbox ch2TipoMoto = new Checkbox("Motocross");
                    Checkbox ch3TipoMoto = new Checkbox("Calle");

                    p2Moto.add(ch1TipoMoto);
                    p2Moto.add(ch2TipoMoto);
                    p2Moto.add(ch3TipoMoto);

                    // Añado un boton para mostrar el alert de la compra
                    Button boton = new Button("Comprar");
                    p2Moto.add(boton);

                    boton.addActionListener(new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (ch1CilindradaMoto.getState() == true && ch1TipoMoto.getState() == true) {
                                crearFrame(ch1CilindradaMoto, ch1TipoMoto);

                            } else if (ch2CilindradaMoto.getState() == true && ch2TipoMoto.getState() == true) {
                                crearFrame(ch2CilindradaMoto, ch2TipoMoto);
                            } else if (ch3CilindradaMoto.getState() == true && ch3TipoMoto.getState() == true) {
                                crearFrame(ch3CilindradaMoto, ch3TipoMoto);
                            } else if (ch1CilindradaMoto.getState() == true && ch2TipoMoto.getState() == true) {
                                crearFrame(ch1CilindradaMoto, ch2TipoMoto);
                            } else if (ch1CilindradaMoto.getState() == true && ch3TipoMoto.getState() == true) {
                                crearFrame(ch1CilindradaMoto, ch3TipoMoto);
                            } else if (ch2CilindradaMoto.getState() == true && ch1TipoMoto.getState() == true) {
                                crearFrame(ch2CilindradaMoto, ch1TipoMoto);
                            } else if (ch2CilindradaMoto.getState() == true && ch3TipoMoto.getState() == true) {
                                crearFrame(ch2CilindradaMoto, ch3TipoMoto);
                            } else if (ch3CilindradaMoto.getState() == true && ch1TipoMoto.getState() == true) {
                                crearFrame(ch3CilindradaMoto, ch1TipoMoto);
                            } else if (ch3CilindradaMoto.getState() == true && ch2TipoMoto.getState() == true) {
                                crearFrame(ch3CilindradaMoto, ch2TipoMoto);
                            } else {
                                Frame f = new Frame();
                                Dialog d = new Dialog(f, "Compra Moto", true);

                                Label ldialog = new Label("No has comprado ninguna moto");
                                d.add(ldialog);
                                d.setBounds(700, 400, 500, 300);
                                d.setVisible(true);

                                // Cierro la ventana
                                f.addWindowListener(new WindowAdapter() {
                                    public void windowClosing(WindowEvent we) {
                                        System.exit(0);
                                    }
                                });
                            }
                        }
                    });

                }
            }
        });


    }

    private static void crearFrameCoche(Checkbox ch2Color, Checkbox ch2Marca) {
        Frame f = new Frame();
        Dialog d = new Dialog(f, "Compra Moto", true);

        Label ldialog = new Label("Has comprado un coche de color: " + ch2Color.getLabel()
                + " de la marca: " + ch2Marca.getLabel());
        d.add(ldialog);
        d.setBounds(700, 400, 500, 300);
        d.setVisible(true);

    }

    private static void crearFrame(Checkbox ch1, Checkbox ch2) {
        Frame f = new Frame();
        Dialog d = new Dialog(f, "Compra Moto", true);

        Label ldialog = new Label("Has comprado una moto de cilindrada: " + ch1.getLabel()
                + " del tipo: " + ch2.getLabel());
        d.add(ldialog);
        d.setBounds(700, 400, 500, 300);
        d.setVisible(true);

    }

}


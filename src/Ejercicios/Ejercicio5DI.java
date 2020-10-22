package Ejercicios;

import java.awt.*;

/**
 * Copiarme un menu con tres opciones de menu y las distintas que aparecen en vuestro bloc de notas,
 * introduciendo submenus.
 */
public class Ejercicio5DI {

    public static void main(String[] args) {
        Frame f = new Frame("Ejercicio 5");
        f.setVisible(true);

        MenuBar mb = new MenuBar();

        Menu archivo = new Menu("Archivo");
        Menu edicion = new Menu("Edición");

        MenuItem ar1 = new MenuItem("Nuevo                  Ctrl+N");
        MenuItem ar2 = new MenuItem("Ventana Nueva          Ctrl+Mayus+N");
        MenuItem ar3 = new MenuItem("Abrir...               Ctrl+A");
        MenuItem ar4 = new MenuItem("Guardar                Ctrl+G");
        MenuItem ar5 = new MenuItem("Guardar como...        Ctrl+Mayus+S");
        MenuItem ar6 = new MenuItem("Configurar página...");
        Menu subar7 = new Menu("Imprimir...            Ctrl+P");
        MenuItem subar7_1 = new MenuItem("Imprime la biblia");
        MenuItem subar7_2 = new MenuItem("Imprime gatos");
        MenuItem subar7_3 = new MenuItem("Imprime mis huevos");
        MenuItem ar8 = new MenuItem("Salir");

        MenuItem ed1 = new MenuItem("Deshacer               Ctrl+Z");
        MenuItem ed2 = new MenuItem("Cortar               Ctrl+X");
        MenuItem ed3 = new MenuItem("Copiar               Ctrl+C");
        MenuItem ed4 = new MenuItem("Pegar               Ctrl+V");
        MenuItem ed5 = new MenuItem("Eliminar               Supr");
        MenuItem ed6 = new MenuItem("Búsqueda con Bing...               Ctrl+F");
        MenuItem ed7 = new MenuItem("Buscar...               Ctrl+B");
        MenuItem ed8 = new MenuItem("Buscar siguiente               F3");
        MenuItem ed9 = new MenuItem("Buscar anterior               Mayus+F3");
        MenuItem ed10 = new MenuItem("Reemplazar...               Ctrl+R");
        MenuItem ed11 = new MenuItem("Ir a...               Ctrl+T");
        MenuItem ed12 = new MenuItem("Seleccionar todo               Ctrl+E");
        MenuItem ed13 = new MenuItem("Hora y fecha               F5");

        archivo.add(ar1);
        archivo.add(ar2);
        archivo.add(ar3);
        archivo.add(ar4);
        archivo.add(ar5);
        archivo.add(ar6);
        archivo.add(subar7);
        subar7.add(subar7_1);
        subar7.add(subar7_2);
        subar7.add(subar7_3);
        archivo.add(ar8);

        edicion.add(ed1);
        edicion.add(ed2);
        edicion.add(ed3);
        edicion.add(ed4);
        edicion.add(ed5);
        edicion.add(ed6);
        edicion.add(ed7);
        edicion.add(ed8);
        edicion.add(ed9);
        edicion.add(ed10);
        edicion.add(ed11);
        edicion.add(ed12);
        edicion.add(ed13);


        mb.add(archivo);
        mb.add(edicion);

        f.setMenuBar(mb);

        f.setSize(400, 400);
    }
}

package Explicaciones;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar {
    public static void main(String[] args) {
        Frame f = new Frame("Ejemplo Explicaciones.ScrollBar");
        f.setBounds(40,100,500,500);
        f.setVisible(true);

        Panel p = new Panel();
        f.add(p);

        // Creo scrollbar
        Scrollbar sb = new Scrollbar();
        sb.setBounds(40,100,100,400);
        p.add(sb);

        sb.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Maximo
                System.out.println(sb.getMaximum());
                //Minimo
                System.out.println(sb.getMinimum());
                System.out.println(sb.getValue());
            }
        });

    }
}

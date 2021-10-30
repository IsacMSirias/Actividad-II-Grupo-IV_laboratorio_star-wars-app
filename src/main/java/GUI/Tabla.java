package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class Tabla extends  JFrame{

    JFrame tabla = new JFrame();
    JTable tablaStarWars = new JTable();


    public Tabla() {
        super("StarWarsTable");

        Object[][] datosfila = {

                {"Luke SkywalkerLuke Skywalker", "1.75 m", "25 de septiembre de 1951"},
                {"Leia Organa", "1.55 m", "21 de October de 1956"},
                {"Darth Vader", " 2.18 m", "19 de mayo de 1944"},
                {"Han Solo", "1.85 m", "13 de julio de 1942"}

        };

        String[] IDColumnas = {"Nombre", "Altura", "Año de Nacimiento"};

        final JTable table = new JTable(datosfila, IDColumnas);
        table.setPreferredScrollableViewportSize(new Dimension(700, 80));
        JScrollPane scrollpane = new JScrollPane(table);

        getContentPane().add(scrollpane, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
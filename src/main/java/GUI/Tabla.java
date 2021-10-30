package GUI;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.util.Date;

public class Tabla extends  JFrame{

    JFrame tabla = new JFrame();
    JTable tablaStarWars = new JTable();
    public static Object datos;
    private static String[][] arraydePersonajes = new String[5][3];


    public Tabla() {
        super("StarWarsTable");
        ReadJson();

        String[] IDColumnas = {"Nombre", "Altura", "Fecha de Nacimiento"};

        final JTable table = new JTable(arraydePersonajes, IDColumnas);
        table.setPreferredScrollableViewportSize(new Dimension(700, 80));
        JScrollPane scrollpane = new JScrollPane(table);

        getContentPane().add(scrollpane, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void ReadJson(){
        JSONParser parser = new JSONParser();
        try {
            Object objeto = parser.parse(new FileReader("src/main/java/datos.json"));

            JSONArray json = (JSONArray) objeto;

            for (int i = 0; i < json.size(); i++) {
                String[] arrayanidado = new String[3];
                JSONObject object =(JSONObject) json.get(i);
                String edad = object.get("Fecha de nacimiento").toString();
                String estatura = object.get("Estatura").toString();
                String nombre = object.get("Nombre").toString();

                arrayanidado[2] = edad;
                arrayanidado[1] = estatura;
                arrayanidado[0] = nombre;

                arraydePersonajes[i] = arrayanidado;
            }

        } catch (Exception e) {

        }
    }
}
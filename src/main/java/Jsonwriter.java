import GUI.Tabla;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Jsonwriter {
    public static void WriteValues() {
        JSONObject obj = new JSONObject();
        JSONArray listadatos = new JSONArray();

        listadatos.add(Tabla.datos);
        obj.put(listadatos);



        try (FileWriter file = new FileWriter("src/main/java/Jsontxt.txt")){

            file.write(obj.toJSONString());
            file.flush();
            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

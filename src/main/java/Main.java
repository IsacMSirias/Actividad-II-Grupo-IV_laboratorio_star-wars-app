<<<<<<< HEAD

import ch.qos.logback.classic.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.LoggerFactory;
import GUI.Tabla;

import java.io.FileWriter;
import java.io.IOException;

=======
>>>>>>> parent of 14a88be (DataTable)
public class Main {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("Hello world");

        logger.info("{} ha sido cargada", Main.class.getSimpleName());
        logger.debug("{} ha sido cargada", Main.class.getSimpleName());
        logger.error("{} ha sido cargada", Main.class.getSimpleName());
        logger.warn("{} ha sido cargada", Main.class.getSimpleName());

    }

}



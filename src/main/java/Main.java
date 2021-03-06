import GUI.Tabla;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Tabla gui = new Tabla();
        gui.pack();
        gui.setVisible(true);
        System.out.println("Hello world");

        logger.info("{} ha sido cargada", Main.class.getSimpleName());
        logger.warn("{} ha sido cargada", Main.class.getSimpleName());
        logger.debug("{} ha sido cargada", Main.class.getSimpleName());
        logger.error("{} ha sido cargada", Main.class.getSimpleName());

    }

}
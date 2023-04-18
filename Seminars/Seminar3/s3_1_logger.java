package java_gb_23.Seminars.Seminar3;

import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.io.IOException;

public class s3_1_logger {
    public static void main(String[] args) throws IOException {
        Logger ll = Logger.getLogger(s3_1_logger.class.getName());
        String logPath = "s3_1_log.txt";
        FileHandler fh = new FileHandler(logPath, false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter formatter = new XMLFormatter();
        fh.setFormatter(formatter);
        
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            ll.log(Level.INFO, "element: " + a);
        }
        ll.log(Level.WARNING, "logger off");
        ll.info("log.info: test");
        ll.warning("log.warning: test");

    }
}

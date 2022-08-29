package homework;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class Loglevel {
    private static Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        String pathName = File.separator + "javagod" + File.separator + "text";
        String fileName = "test.txt";

        File f = new File(pathName, fileName);
        try {
            System.out.println(f.createNewFile());
        } catch (IOException e) {
            log.warning("warning=");

        }
    }
}

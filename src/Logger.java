import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int num = 1;

    private static Logger logger = null;
    private SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Date date = new Date();

    private Logger() {}

    public void log(String msg) {
        System.out.println("[" + date + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogUser {

	public static void main(String[] args) {
		LogManager manager = LogManager.getLogManager();
		
		Logger log = manager.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		log.log(Level.INFO, "this is a log measage"); 
	}

}

package gameManagement;

public class Utils {
	
	public static void runLoggers(LoggerInterface[] loggers, String message) {
		for(LoggerInterface logger: loggers) {
			logger.log(message);
		}
	}
	
}

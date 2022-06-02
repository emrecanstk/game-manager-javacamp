package gameManagement;

public class PlayerManager {
	private LoggerInterface[] loggers;
	
	public PlayerManager(LoggerInterface[] loggers) {
		this.loggers = loggers;
	}
	
	public void save(Player player) {
		Utils.runLoggers(loggers, player.getFirstName());
	}
	
	public void delete(Player player) {
		
	}
}

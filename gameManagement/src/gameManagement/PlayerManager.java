package gameManagement;

public class PlayerManager {
	private LoggerInterface[] loggers;
	
	public PlayerManager(LoggerInterface[] loggers) {
		this.loggers = loggers;
	}
	
	public void save(Player player) {
		System.out.println(player.firstName+" added on system.");
	}
	
	public void delete(Player player) {
		System.out.println(player.firstName+" deleted on system.");
	}
}

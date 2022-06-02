package gameManagement;

public class DataBaseLogger implements LoggerInterface {

	@Override
	public void log(String message) {
		System.out.println("Data from "+message+" logged on data base.");
		
	}

}

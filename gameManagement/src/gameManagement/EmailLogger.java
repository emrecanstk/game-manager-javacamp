package gameManagement;

public class EmailLogger implements LoggerInterface {

	@Override
	public void log(String message) {
		System.out.println("E-mail sent to "+message+" successfully.");
		
	}

}

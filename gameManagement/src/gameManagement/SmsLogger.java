package gameManagement;

public class SmsLogger implements LoggerInterface {

	@Override
	public void log(String message) {
		System.out.println("SMS sent to "+message+" successfully.");
		
	}

}

package gameManagement;

public class Main {

	public static void main(String[] args) {

		LoggerInterface[] loggers = {new SmsLogger(), new EmailLogger(), new DataBaseLogger()};

	}

}

package gameManagement;

public class Main {

	public static void main(String[] args) {
		
		// Objects created for testing the code: 

		LoggerInterface[] loggers = {new SmsLogger(), new EmailLogger(), new DataBaseLogger()};
		
		PlayerManager playerManager = new PlayerManager(loggers);
		GameManager gameManager = new GameManager();
		OfferManager offerManager = new OfferManager();
		
		Player emre = new Player(1, "Emre Can", "Satık", "emrecanwick", 850, 1000120, 2002);
		Player gulnur = new Player(2, "Gülnur", "Vırdınlı", "gvv", 850, 1003500, 2001);
		Player ercan = new Player(3, "Ercan", "Satık", "ercan71", 1800, 1001400, 1971);
		Player melike = new Player(4, "Melike", "Satık", "melike155", 1200, 1780000, 1978);
		Player aycan = new Player(5, "Aycan", "Satık", "Ican", 1000650, 700, 1998);
		
		Player[] players = {emre,gulnur,ercan,melike,aycan};
		
		Game gtaSa = new Game(1,"Grand Theft Auto: San Andreas","Rockstar Games",35);
		Game mbw = new Game(2,"Mount and Blade: Warband","TaleWorlds",84);
		Game gtaV = new Game(3, "Grand Theft Auto: V", "Rockstar Games", 210);
		Game lol = new Game(4, "Leauge of Legends", "Riot Gmes", 0);
		
		Game[] games = {gtaSa,mbw,gtaV,lol};
		
		Offer of1 = new Offer(1, 40);
		Offer of2 = new Offer(2, 15);
		Offer of3 = new Offer(3, 20);
		
		Offer[] offers = {of1,of2,of3};
		
	}

}

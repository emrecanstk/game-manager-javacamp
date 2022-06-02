package gameManagement;

public class Player {
	int id;
	String firstName;
	String lastName;
	String nickName;
	int identificationNumber;
	int birthYear;
	
	public Player(int id, String firstName, String lastName, String nickName, int identificationNumber, int birthYear) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.identificationNumber = identificationNumber;
		this.birthYear = birthYear;
	}
	
}

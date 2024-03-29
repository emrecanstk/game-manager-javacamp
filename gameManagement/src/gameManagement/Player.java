package gameManagement;

public class Player {
	int id;
	String firstName;
	String lastName;
	String nickName;
	int haveMoney;
	int identificationNumber;
	int birthYear;
	
	public Player(int id, String firstName, String lastName, String nickName, int haveMoney, int identificationNumber, int birthYear) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.haveMoney = haveMoney;
		this.identificationNumber = identificationNumber;
		this.birthYear = birthYear;
	}
	
	public void buyGame(Game game) {
		System.out.println(this.nickName+" bought "+game.name+" for "+game.price+" liras.");
		this.haveMoney = this.haveMoney - game.price;
	}
	
	public int getHaveMoney() {
		return haveMoney;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}

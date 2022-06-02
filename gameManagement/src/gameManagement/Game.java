package gameManagement;

public class Game {
	int id;
	String name;
	String companyName;
	int price;
	
	public Game(int id, String name, String companyName, int price) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

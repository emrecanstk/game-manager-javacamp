package gameManagement;

public class Offer {
	int id;
	int discount;
	
	public Offer(int id, int discount) {
		this.id = id;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}

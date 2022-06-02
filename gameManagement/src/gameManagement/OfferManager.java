package gameManagement;

public class OfferManager {

	public void add(Game game, Offer offer) {
		System.out.println(game.name+" is now %"+offer.discount+" off.");
		game.price = game.price - game.price*(offer.discount/100);
		game.hasDiscount = offer.discount;
	}

	public void delete(Game game, Offer offer) {
		if(game.hasDiscount == offer.discount) {
			System.out.println("%"+offer.discount+" on "+game.name+" has been deleted.");
			game.price = game.price + game.price*(offer.discount/100);
			game.hasDiscount = 0;
		}
		else {
			System.out.println(game.name+" does not have this discount.");
		}
		
	}

}

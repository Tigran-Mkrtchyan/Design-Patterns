package composite;

public class Bottle implements Things {
	private int price;
	public Bottle (int price) {
		this.price = price;
	}
	@Override
	public int countPrice() {
		return price;
	}

}

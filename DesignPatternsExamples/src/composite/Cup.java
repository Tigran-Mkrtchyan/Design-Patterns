package composite;

public class Cup implements Things {
	private int price;
	public Cup (int price) {
		this.price = price;
	}
	@Override
	public int countPrice() {
		return price;
	}

}

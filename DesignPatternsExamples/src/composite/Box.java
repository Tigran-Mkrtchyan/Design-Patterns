package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Things {
	private List <Things> box;
	public Box () {
		box = new ArrayList<>();
	}
	public void addThings(Things thing ) {
		box.add(thing);
	}
	@Override
	public int countPrice() {
		int price = 0;
		for (Things thing : box) {
			price += thing.countPrice();
		}
		return price;
	}

}

package composite;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		Things bottle = new Bottle (1000);
		Things bottle1 = new Bottle (500);
		Things cup = new Cup (400);
		Things cup1 = new Cup (600);
		box.addThings(cup1);
		box.addThings(bottle1);
		Box order =new Box ();
		order.addThings(box);
		order.addThings(bottle);
		order.addThings(cup);
		System.out.println(order.countPrice());
	}

}

package facade;

public class OrderFood {
	private Waiter waiter = new Waiter();
	private Chef chef  = new Chef();
	private Kitchen kitchen = new Kitchen();
	
	public void getOrder( String order) {
		chef.cookFood( order );
		kitchen.finishCooking();
		waiter.deliverFood(kitchen, order);
	}
}

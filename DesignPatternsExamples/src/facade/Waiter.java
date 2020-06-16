package facade;

public class Waiter {
	public void deliverFood(Kitchen kitchen , String order) {
		if(kitchen.isReadyFood()) {
			System.out.println("Waiter deliver " + order);
			kitchen.setIsReadyFood(false);
		}
		else {
			System.out.println("Waiter wait for .... ");
		}	
	}
}
